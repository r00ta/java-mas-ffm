/*
 * Account Management Service API
 * Manage user subscriptions and clusters
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.redhat.services.ffm.amsclient.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccessReviewResponse
 */
@JsonPropertyOrder({
  AccessReviewResponse.JSON_PROPERTY_ACCOUNT_ID,
  AccessReviewResponse.JSON_PROPERTY_ACTION,
  AccessReviewResponse.JSON_PROPERTY_ALLOWED,
  AccessReviewResponse.JSON_PROPERTY_CLUSTER_ID,
  AccessReviewResponse.JSON_PROPERTY_CLUSTER_UUID,
  AccessReviewResponse.JSON_PROPERTY_ORGANIZATION_ID,
  AccessReviewResponse.JSON_PROPERTY_RESOURCE_TYPE,
  AccessReviewResponse.JSON_PROPERTY_SUBSCRIPTION_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class AccessReviewResponse {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    GET("get"),
    
    LIST("list"),
    
    CREATE("create"),
    
    DELETE("delete"),
    
    UPDATE("update");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_CLUSTER_UUID = "cluster_uuid";
  private String clusterUuid;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  /**
   * Gets or Sets resourceType
   */
  public enum ResourceTypeEnum {
    ADDON("AddOn"),
    
    FLAVOUR("Flavour"),
    
    ACCOUNT("Account"),
    
    ACCOUNTPOOL("AccountPool"),
    
    CLUSTER("Cluster"),
    
    PLAN("Plan"),
    
    SUBSCRIPTION("Subscription"),
    
    ORGANIZATION("Organization"),
    
    ROLE("Role"),
    
    PERMISSION("Permission"),
    
    ROLEBINDING("RoleBinding"),
    
    REGISTRY("Registry"),
    
    REGISTRYCREDENTIAL("RegistryCredential"),
    
    CURRENTACCOUNT("CurrentAccount"),
    
    ACCESSREVIEW("AccessReview"),
    
    SELFACCCESSREVIEW("SelfAcccessReview"),
    
    RESOURCEREVIEW("ResourceReview"),
    
    SELFRESOURCEREVIEW("SelfResourceReview"),
    
    CLUSTERREGISTRATION("ClusterRegistration"),
    
    ACCESSTOKEN("AccessToken"),
    
    CLUSTERAUTHORIZATION("ClusterAuthorization"),
    
    SELFMANAGEDCLUSTER("SelfManagedCluster"),
    
    REDHATMANAGEDCLUSTER("RedhatManagedCluster"),
    
    EXPORTCONTROLREVIEW("ExportControlReview"),
    
    CLUSTERLOG("ClusterLog"),
    
    CLUSTERCREDENTIAL("ClusterCredential"),
    
    CLUSTERMETRIC("ClusterMetric"),
    
    RESOURCEQUOTA("ResourceQuota"),
    
    RESERVEDRESOURCE("ReservedResource"),
    
    DASHBOARD("Dashboard"),
    
    CLUSTERPROVIDERANDREGION("ClusterProviderAndRegion"),
    
    SERVICELOG("ServiceLog"),
    
    INTERNALSERVICELOG("InternalServiceLog"),
    
    CSLOGS("CSLogs"),
    
    SUBSCRIPTIONLABEL("SubscriptionLabel"),
    
    ORGANIZATIONLABEL("OrganizationLabel"),
    
    SUBSCRIPTIONLABELINTERNAL("SubscriptionLabelInternal"),
    
    SELFACCESSREVIEW("SelfAccessReview"),
    
    SUBSCRIPTIONINTERNAL("SubscriptionInternal"),
    
    SUBSCRIPTIONROLEBINDING("SubscriptionRoleBinding");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ResourceTypeEnum resourceType;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscription_id";
  private String subscriptionId;

  public AccessReviewResponse() { 
  }

  public AccessReviewResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccessReviewResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public AccessReviewResponse allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllowed() {
    return allowed;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public AccessReviewResponse clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public AccessReviewResponse clusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

   /**
   * Get clusterUuid
   * @return clusterUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterUuid() {
    return clusterUuid;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }


  public AccessReviewResponse organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public AccessReviewResponse resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  public AccessReviewResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  /**
   * Return true if this AccessReviewResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessReviewResponse accessReviewResponse = (AccessReviewResponse) o;
    return Objects.equals(this.accountId, accessReviewResponse.accountId) &&
        Objects.equals(this.action, accessReviewResponse.action) &&
        Objects.equals(this.allowed, accessReviewResponse.allowed) &&
        Objects.equals(this.clusterId, accessReviewResponse.clusterId) &&
        Objects.equals(this.clusterUuid, accessReviewResponse.clusterUuid) &&
        Objects.equals(this.organizationId, accessReviewResponse.organizationId) &&
        Objects.equals(this.resourceType, accessReviewResponse.resourceType) &&
        Objects.equals(this.subscriptionId, accessReviewResponse.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, allowed, clusterId, clusterUuid, organizationId, resourceType, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessReviewResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

