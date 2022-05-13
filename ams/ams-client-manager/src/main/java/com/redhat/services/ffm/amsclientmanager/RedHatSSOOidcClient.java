package com.redhat.services.ffm.amsclientmanager;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.redhat.services.ffm.security.AbstractOidcClient;
import com.redhat.services.ffm.security.OidcClientConfigUtils;
import io.quarkus.oidc.client.OidcClientConfig;
import io.quarkus.oidc.client.OidcClients;
import io.quarkus.oidc.common.runtime.OidcConstants;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class RedHatSSOOidcClient extends AbstractOidcClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedHatSSOOidcClient.class);

    private static final String NAME = "redhat-sso";

    @ConfigProperty(name = "redhat.sso.auth-server-url")
    String serverUrl;

    @ConfigProperty(name = "redhat.sso.client-id")
    String clientId;

    @ConfigProperty(name = "redhat.sso.refresh-token")
    String refreshToken;

    @ConfigProperty(name = "redhat.sso.enabled")
    boolean isEnabled;

    @Inject
    public RedHatSSOOidcClient(OidcClients oidcClients) {
        super(NAME, oidcClients);
    }

    @Override
    protected OidcClientConfig getOidcClientConfig() {
        OidcClientConfig oidcClientConfig = new OidcClientConfig();
        oidcClientConfig.setClientEnabled(isEnabled);
        oidcClientConfig.setId(NAME);
        oidcClientConfig.setAuthServerUrl(serverUrl);
        oidcClientConfig.setClientId(clientId);
        oidcClientConfig.grant.setType(OidcClientConfigUtils.getGrantType(OidcConstants.REFRESH_TOKEN_GRANT));
        oidcClientConfig.getCredentials().setSecret("secret");
        oidcClientConfig.setRefreshTokenTimeSkew(AbstractOidcClient.REFRESH_TOKEN_TIME_SKEW);

        return oidcClientConfig;
    }

    // TODO: refactor
    @Override
    protected void retrieveTokens() {
        currentTokens = client.refreshTokens(refreshToken).await().atMost(timeout);
        LOGGER.info("New token for OIDC client '{}' has been set", name);
    }
}