package com.redhat.services.ffm.security;

import java.time.Duration;

import javax.annotation.PostConstruct;

import com.redhat.services.ffm.errors.api.platform.OidcTokensNotInitializedException;
import io.quarkus.oidc.client.OidcClient;
import io.quarkus.oidc.client.OidcClientConfig;
import io.quarkus.oidc.client.OidcClientException;
import io.quarkus.oidc.client.OidcClients;
import io.quarkus.oidc.client.Tokens;
import io.quarkus.scheduler.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractOidcClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractOidcClient.class);

    protected static final String SCHEDULER_TIME = "5s";
    protected static final Duration SSO_CONNECTION_TIMEOUT = Duration.ofSeconds(30);
    protected static final Duration REFRESH_TOKEN_TIME_SKEW = Duration.ofSeconds(30);

    protected String name;
    protected OidcClient client;
    private OidcClients oidcClients;
    protected Duration timeout;
    protected Tokens currentTokens;

    public AbstractOidcClient() {
    }

    public AbstractOidcClient(String name, OidcClients oidcClients, Duration timeout) {
        this.name = name;
        this.oidcClients = oidcClients;
        this.timeout = timeout;
    }

    public AbstractOidcClient(String name, OidcClients oidcClients) {
        this(name, oidcClients, SSO_CONNECTION_TIMEOUT);
    }

    protected abstract OidcClientConfig getOidcClientConfig();

    @PostConstruct
    protected void init() {
        this.client = oidcClients.newClient(getOidcClientConfig()).await().atMost(timeout);
        if (getOidcClientConfig().isClientEnabled()){
            retrieveTokens();
        }
    }

    @Scheduled(every = AbstractOidcClient.SCHEDULER_TIME)
    public void checkAndRefresh() {
        if (!getOidcClientConfig().isClientEnabled()){
            return;
        }

        if (currentTokens == null || currentTokens.isAccessTokenExpired() || currentTokens.isAccessTokenWithinRefreshInterval()) {
            refreshTokens();
            LOGGER.info("Tokens have been refreshed for OIDC client '{}'", name);
        }
    }

    public String getToken() {
        if (!getOidcClientConfig().isClientEnabled()){
            LOGGER.debug("OidcClient '{}' is disabled but the token was requested. Null is returned.", name);
            return null;
        }

        if (currentTokens == null) {
            throw new OidcTokensNotInitializedException(String.format("Tokens for OIDC client '%s' are not initialized.", name));
        }
        return currentTokens.getAccessToken();
    }

    public String getName() {
        return this.name;
    }

    private void refreshTokens() {
        Tokens tokens = currentTokens;
        try {
            currentTokens = client.refreshTokens(tokens.getRefreshToken()).await().atMost(timeout);
        } catch (OidcClientException e) {
            LOGGER.warn("Could not use refresh token. Trying to get a new fresh token for OIDC client '{}'", name);
            retrieveTokens();
        }
    }

    protected void retrieveTokens() {
        currentTokens = client.getTokens().await().atMost(timeout);
        LOGGER.info("New token for OIDC client '{}' has been set", name);
    }
}
