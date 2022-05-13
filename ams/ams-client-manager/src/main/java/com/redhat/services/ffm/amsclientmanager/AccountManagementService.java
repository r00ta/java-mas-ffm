package com.redhat.services.ffm.amsclientmanager;

import com.redhat.services.ffm.amsclientmanager.models.AccountInfo;
import com.redhat.services.ffm.amsclientmanager.models.ResourceType;
import io.smallrye.mutiny.Uni;

public interface AccountManagementService {

    /**
     * Figure out which type of resource is allowed for the given account info.
     */
    Uni<Boolean> organizationHasQuotaForProductInstance(String externalOrganizationId, String product, String name);

    /**
     * Creates a resource for the given user and return a subscriptionId that can later
     * be used to delete the resource.
     *
     * @param accountInfo  the account information for requests
     * @param resourceType the requested resource type
     * @return the id of the subscription
     */
    String createResource(AccountInfo accountInfo, ResourceType resourceType);

    /**
     * Delete a subscription by id
     *
     * @param subscriptionId the identifier of the subscription to be deleted
     */
    Uni<Void> deleteSubscription(String subscriptionId);
}
