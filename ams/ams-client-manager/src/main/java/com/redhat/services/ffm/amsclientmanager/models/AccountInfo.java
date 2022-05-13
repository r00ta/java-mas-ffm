package com.redhat.services.ffm.amsclientmanager.models;

public class AccountInfo {

    private final String externalOrganizationId;
    private final String accountUsername;
    private final Long accountId;
    private final boolean admin;

    public AccountInfo(String externalOrganizationId, String accountUsername, boolean admin, Long accountId) {
        this.externalOrganizationId = externalOrganizationId;
        this.accountUsername = accountUsername;
        this.accountId = accountId;
        this.admin = admin;
    }

    public String getExternalOrganizationId() {
        return externalOrganizationId;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public boolean isAdmin() {
        return admin;
    }

    public Long getAccountId() {
        return accountId;
    }
}