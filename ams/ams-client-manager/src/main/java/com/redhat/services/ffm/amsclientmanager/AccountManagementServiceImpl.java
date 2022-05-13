package com.redhat.services.ffm.amsclientmanager;

import java.time.Duration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.redhat.services.ffm.amsclient.ApiClient;
import com.redhat.services.ffm.amsclient.api.DefaultApi;
import com.redhat.services.ffm.amsclientmanager.models.AccountInfo;
import com.redhat.services.ffm.amsclientmanager.models.ResourceType;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class AccountManagementServiceImpl implements AccountManagementService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ConfigProperty(name = "account-management-system.url")
    String endpoint;

    @Inject
    RedHatSSOOidcClient redHatSSOOidcClient;

    private DefaultApi client;

    @PostConstruct
    void init() {
        log.info("Using Account Management Service with Account Management URL: {}", endpoint);
        ApiClient apiClient = new ApiClient();
        apiClient.updateBaseUri(endpoint);
        apiClient.setReadTimeout(Duration.ofSeconds(3));
        apiClient.setRequestInterceptor(x -> x.setHeader("Authorization", "Bearer " + redHatSSOOidcClient.getToken()));
        this.client = new DefaultApi(apiClient);
    }

    @Override
    public Uni<Boolean> organizationHasQuotaForProductInstance(String externalOrganizationId, String product, String name) {
        String search = "external_id='ORG_ID'".replace("ORG_ID", externalOrganizationId);

        return Uni.createFrom().completionStage(client.apiAccountsMgmtV1OrganizationsGet(null, null, search, null, null, null, null))
                .onItem()
                .transformToUni(x -> {
                    if (x.getSize() == 0) {
                        throw new RuntimeException("No organization found");
                    }
                    if (x.getSize() > 1) {
                        throw new RuntimeException("Too many organizations found");
                    }
                    return Uni.createFrom().completionStage(
                            client.apiAccountsMgmtV1OrganizationsOrgIdQuotaCostGet(
                                    x.getItems().get(0).getId(), null, true, null));
                })
                .onItem()
                .transformToUni(x -> {
                    if (x.getItems().stream().anyMatch(q -> q.getAllowed() > 0
                            && q.getRelatedResources() != null
                            && !q.getRelatedResources().isEmpty()
                            && q.getRelatedResources().stream().anyMatch(rr -> product.equals(rr.getProduct()) && name.equals(rr.getResourceName())))
                    ) {
                        return Uni.createFrom().item(Boolean.TRUE);
                    } else {
                        return Uni.createFrom().item(Boolean.FALSE);
                    }
                });
    }

    @Override
    public String createResource(AccountInfo accountInfo, ResourceType resourceType) {

        // TODO
        return null;
    }

    @Override
    public Uni<Void> deleteSubscription(String subscriptionId) {
        return Uni.createFrom().completionStage(client.apiAccountsMgmtV1SubscriptionsIdDelete(subscriptionId));
    }
}