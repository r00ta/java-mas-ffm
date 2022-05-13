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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SubscriptionPatchRequest
 */
@JsonPropertyOrder({
  SubscriptionPatchRequest.JSON_PROPERTY_BILLING_EXPIRATION_DATE,
  SubscriptionPatchRequest.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_CLOUD_PROVIDER_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_CLUSTER_BILLING_MODEL,
  SubscriptionPatchRequest.JSON_PROPERTY_CLUSTER_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_CONSOLE_URL,
  SubscriptionPatchRequest.JSON_PROPERTY_CONSUMER_UUID,
  SubscriptionPatchRequest.JSON_PROPERTY_CPU_TOTAL,
  SubscriptionPatchRequest.JSON_PROPERTY_CREATOR_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_DISPLAY_NAME,
  SubscriptionPatchRequest.JSON_PROPERTY_EXTERNAL_CLUSTER_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_MANAGED,
  SubscriptionPatchRequest.JSON_PROPERTY_ORGANIZATION_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_PLAN_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_PRODUCT_BUNDLE,
  SubscriptionPatchRequest.JSON_PROPERTY_PROVENANCE,
  SubscriptionPatchRequest.JSON_PROPERTY_REGION_ID,
  SubscriptionPatchRequest.JSON_PROPERTY_RELEASED,
  SubscriptionPatchRequest.JSON_PROPERTY_SERVICE_LEVEL,
  SubscriptionPatchRequest.JSON_PROPERTY_SOCKET_TOTAL,
  SubscriptionPatchRequest.JSON_PROPERTY_STATUS,
  SubscriptionPatchRequest.JSON_PROPERTY_SUPPORT_LEVEL,
  SubscriptionPatchRequest.JSON_PROPERTY_SYSTEM_UNITS,
  SubscriptionPatchRequest.JSON_PROPERTY_TRIAL_END_DATE,
  SubscriptionPatchRequest.JSON_PROPERTY_USAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class SubscriptionPatchRequest {
  public static final String JSON_PROPERTY_BILLING_EXPIRATION_DATE = "billing_expiration_date";
  private OffsetDateTime billingExpirationDate;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloud_account_id";
  private String cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER_ID = "cloud_provider_id";
  private String cloudProviderId;

  /**
   * Gets or Sets clusterBillingModel
   */
  public enum ClusterBillingModelEnum {
    STANDARD("standard"),
    
    MARKETPLACE("marketplace");

    private String value;

    ClusterBillingModelEnum(String value) {
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
    public static ClusterBillingModelEnum fromValue(String value) {
      for (ClusterBillingModelEnum b : ClusterBillingModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CLUSTER_BILLING_MODEL = "cluster_billing_model";
  private ClusterBillingModelEnum clusterBillingModel;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_CONSOLE_URL = "console_url";
  private String consoleUrl;

  public static final String JSON_PROPERTY_CONSUMER_UUID = "consumer_uuid";
  private String consumerUuid;

  public static final String JSON_PROPERTY_CPU_TOTAL = "cpu_total";
  private Integer cpuTotal;

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private String creatorId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_EXTERNAL_CLUSTER_ID = "external_cluster_id";
  private String externalClusterId;

  public static final String JSON_PROPERTY_MANAGED = "managed";
  private Boolean managed;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_PLAN_ID = "plan_id";
  private String planId;

  /**
   * Gets or Sets productBundle
   */
  public enum ProductBundleEnum {
    OPENSHIFT("Openshift"),
    
    JBOSS_MIDDLEWARE("JBoss-Middleware"),
    
    IBM_CLOUDPAK("IBM-CloudPak");

    private String value;

    ProductBundleEnum(String value) {
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
    public static ProductBundleEnum fromValue(String value) {
      for (ProductBundleEnum b : ProductBundleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCT_BUNDLE = "product_bundle";
  private ProductBundleEnum productBundle;

  public static final String JSON_PROPERTY_PROVENANCE = "provenance";
  private String provenance;

  public static final String JSON_PROPERTY_REGION_ID = "region_id";
  private String regionId;

  public static final String JSON_PROPERTY_RELEASED = "released";
  private Boolean released;

  /**
   * Gets or Sets serviceLevel
   */
  public enum ServiceLevelEnum {
    L1_L3("L1-L3"),
    
    L3_ONLY("L3-only");

    private String value;

    ServiceLevelEnum(String value) {
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
    public static ServiceLevelEnum fromValue(String value) {
      for (ServiceLevelEnum b : ServiceLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE_LEVEL = "service_level";
  private ServiceLevelEnum serviceLevel;

  public static final String JSON_PROPERTY_SOCKET_TOTAL = "socket_total";
  private Integer socketTotal;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  /**
   * Gets or Sets supportLevel
   */
  public enum SupportLevelEnum {
    EVAL("Eval"),
    
    STANDARD("Standard"),
    
    PREMIUM("Premium"),
    
    SELF_SUPPORT("Self-Support"),
    
    NONE("None");

    private String value;

    SupportLevelEnum(String value) {
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
    public static SupportLevelEnum fromValue(String value) {
      for (SupportLevelEnum b : SupportLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUPPORT_LEVEL = "support_level";
  private SupportLevelEnum supportLevel;

  /**
   * Gets or Sets systemUnits
   */
  public enum SystemUnitsEnum {
    CORES_VCPU("Cores/vCPU"),
    
    SOCKETS("Sockets");

    private String value;

    SystemUnitsEnum(String value) {
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
    public static SystemUnitsEnum fromValue(String value) {
      for (SystemUnitsEnum b : SystemUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYSTEM_UNITS = "system_units";
  private SystemUnitsEnum systemUnits;

  public static final String JSON_PROPERTY_TRIAL_END_DATE = "trial_end_date";
  private OffsetDateTime trialEndDate;

  /**
   * Gets or Sets usage
   */
  public enum UsageEnum {
    PRODUCTION("Production"),
    
    DEVELOPMENT_TEST("Development/Test"),
    
    DISASTER_RECOVERY("Disaster Recovery"),
    
    ACADEMIC("Academic");

    private String value;

    UsageEnum(String value) {
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
    public static UsageEnum fromValue(String value) {
      for (UsageEnum b : UsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USAGE = "usage";
  private UsageEnum usage;

  public SubscriptionPatchRequest() { 
  }

  public SubscriptionPatchRequest billingExpirationDate(OffsetDateTime billingExpirationDate) {
    this.billingExpirationDate = billingExpirationDate;
    return this;
  }

   /**
   * Get billingExpirationDate
   * @return billingExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getBillingExpirationDate() {
    return billingExpirationDate;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingExpirationDate(OffsetDateTime billingExpirationDate) {
    this.billingExpirationDate = billingExpirationDate;
  }


  public SubscriptionPatchRequest cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public SubscriptionPatchRequest cloudProviderId(String cloudProviderId) {
    this.cloudProviderId = cloudProviderId;
    return this;
  }

   /**
   * Get cloudProviderId
   * @return cloudProviderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudProviderId() {
    return cloudProviderId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudProviderId(String cloudProviderId) {
    this.cloudProviderId = cloudProviderId;
  }


  public SubscriptionPatchRequest clusterBillingModel(ClusterBillingModelEnum clusterBillingModel) {
    this.clusterBillingModel = clusterBillingModel;
    return this;
  }

   /**
   * Get clusterBillingModel
   * @return clusterBillingModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClusterBillingModelEnum getClusterBillingModel() {
    return clusterBillingModel;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterBillingModel(ClusterBillingModelEnum clusterBillingModel) {
    this.clusterBillingModel = clusterBillingModel;
  }


  public SubscriptionPatchRequest clusterId(String clusterId) {
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


  public SubscriptionPatchRequest consoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
    return this;
  }

   /**
   * Get consoleUrl
   * @return consoleUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSOLE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConsoleUrl() {
    return consoleUrl;
  }


  @JsonProperty(JSON_PROPERTY_CONSOLE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
  }


  public SubscriptionPatchRequest consumerUuid(String consumerUuid) {
    this.consumerUuid = consumerUuid;
    return this;
  }

   /**
   * Get consumerUuid
   * @return consumerUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSUMER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConsumerUuid() {
    return consumerUuid;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerUuid(String consumerUuid) {
    this.consumerUuid = consumerUuid;
  }


  public SubscriptionPatchRequest cpuTotal(Integer cpuTotal) {
    this.cpuTotal = cpuTotal;
    return this;
  }

   /**
   * Get cpuTotal
   * @return cpuTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCpuTotal() {
    return cpuTotal;
  }


  @JsonProperty(JSON_PROPERTY_CPU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuTotal(Integer cpuTotal) {
    this.cpuTotal = cpuTotal;
  }


  public SubscriptionPatchRequest creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * Get creatorId
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorId() {
    return creatorId;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public SubscriptionPatchRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SubscriptionPatchRequest externalClusterId(String externalClusterId) {
    this.externalClusterId = externalClusterId;
    return this;
  }

   /**
   * Get externalClusterId
   * @return externalClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalClusterId() {
    return externalClusterId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalClusterId(String externalClusterId) {
    this.externalClusterId = externalClusterId;
  }


  public SubscriptionPatchRequest managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManaged() {
    return managed;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public SubscriptionPatchRequest organizationId(String organizationId) {
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


  public SubscriptionPatchRequest planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public SubscriptionPatchRequest productBundle(ProductBundleEnum productBundle) {
    this.productBundle = productBundle;
    return this;
  }

   /**
   * Get productBundle
   * @return productBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_BUNDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductBundleEnum getProductBundle() {
    return productBundle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_BUNDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductBundle(ProductBundleEnum productBundle) {
    this.productBundle = productBundle;
  }


  public SubscriptionPatchRequest provenance(String provenance) {
    this.provenance = provenance;
    return this;
  }

   /**
   * Get provenance
   * @return provenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvenance() {
    return provenance;
  }


  @JsonProperty(JSON_PROPERTY_PROVENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvenance(String provenance) {
    this.provenance = provenance;
  }


  public SubscriptionPatchRequest regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionId() {
    return regionId;
  }


  @JsonProperty(JSON_PROPERTY_REGION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public SubscriptionPatchRequest released(Boolean released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleased() {
    return released;
  }


  @JsonProperty(JSON_PROPERTY_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleased(Boolean released) {
    this.released = released;
  }


  public SubscriptionPatchRequest serviceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * Get serviceLevel
   * @return serviceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLevelEnum getServiceLevel() {
    return serviceLevel;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  public SubscriptionPatchRequest socketTotal(Integer socketTotal) {
    this.socketTotal = socketTotal;
    return this;
  }

   /**
   * Get socketTotal
   * @return socketTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOCKET_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSocketTotal() {
    return socketTotal;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketTotal(Integer socketTotal) {
    this.socketTotal = socketTotal;
  }


  public SubscriptionPatchRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public SubscriptionPatchRequest supportLevel(SupportLevelEnum supportLevel) {
    this.supportLevel = supportLevel;
    return this;
  }

   /**
   * Get supportLevel
   * @return supportLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportLevelEnum getSupportLevel() {
    return supportLevel;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportLevel(SupportLevelEnum supportLevel) {
    this.supportLevel = supportLevel;
  }


  public SubscriptionPatchRequest systemUnits(SystemUnitsEnum systemUnits) {
    this.systemUnits = systemUnits;
    return this;
  }

   /**
   * Get systemUnits
   * @return systemUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYSTEM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemUnitsEnum getSystemUnits() {
    return systemUnits;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemUnits(SystemUnitsEnum systemUnits) {
    this.systemUnits = systemUnits;
  }


  public SubscriptionPatchRequest trialEndDate(OffsetDateTime trialEndDate) {
    this.trialEndDate = trialEndDate;
    return this;
  }

   /**
   * Get trialEndDate
   * @return trialEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTrialEndDate() {
    return trialEndDate;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialEndDate(OffsetDateTime trialEndDate) {
    this.trialEndDate = trialEndDate;
  }


  public SubscriptionPatchRequest usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageEnum getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }


  /**
   * Return true if this SubscriptionPatchRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPatchRequest subscriptionPatchRequest = (SubscriptionPatchRequest) o;
    return Objects.equals(this.billingExpirationDate, subscriptionPatchRequest.billingExpirationDate) &&
        Objects.equals(this.cloudAccountId, subscriptionPatchRequest.cloudAccountId) &&
        Objects.equals(this.cloudProviderId, subscriptionPatchRequest.cloudProviderId) &&
        Objects.equals(this.clusterBillingModel, subscriptionPatchRequest.clusterBillingModel) &&
        Objects.equals(this.clusterId, subscriptionPatchRequest.clusterId) &&
        Objects.equals(this.consoleUrl, subscriptionPatchRequest.consoleUrl) &&
        Objects.equals(this.consumerUuid, subscriptionPatchRequest.consumerUuid) &&
        Objects.equals(this.cpuTotal, subscriptionPatchRequest.cpuTotal) &&
        Objects.equals(this.creatorId, subscriptionPatchRequest.creatorId) &&
        Objects.equals(this.displayName, subscriptionPatchRequest.displayName) &&
        Objects.equals(this.externalClusterId, subscriptionPatchRequest.externalClusterId) &&
        Objects.equals(this.managed, subscriptionPatchRequest.managed) &&
        Objects.equals(this.organizationId, subscriptionPatchRequest.organizationId) &&
        Objects.equals(this.planId, subscriptionPatchRequest.planId) &&
        Objects.equals(this.productBundle, subscriptionPatchRequest.productBundle) &&
        Objects.equals(this.provenance, subscriptionPatchRequest.provenance) &&
        Objects.equals(this.regionId, subscriptionPatchRequest.regionId) &&
        Objects.equals(this.released, subscriptionPatchRequest.released) &&
        Objects.equals(this.serviceLevel, subscriptionPatchRequest.serviceLevel) &&
        Objects.equals(this.socketTotal, subscriptionPatchRequest.socketTotal) &&
        Objects.equals(this.status, subscriptionPatchRequest.status) &&
        Objects.equals(this.supportLevel, subscriptionPatchRequest.supportLevel) &&
        Objects.equals(this.systemUnits, subscriptionPatchRequest.systemUnits) &&
        Objects.equals(this.trialEndDate, subscriptionPatchRequest.trialEndDate) &&
        Objects.equals(this.usage, subscriptionPatchRequest.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingExpirationDate, cloudAccountId, cloudProviderId, clusterBillingModel, clusterId, consoleUrl, consumerUuid, cpuTotal, creatorId, displayName, externalClusterId, managed, organizationId, planId, productBundle, provenance, regionId, released, serviceLevel, socketTotal, status, supportLevel, systemUnits, trialEndDate, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPatchRequest {\n");
    sb.append("    billingExpirationDate: ").append(toIndentedString(billingExpirationDate)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudProviderId: ").append(toIndentedString(cloudProviderId)).append("\n");
    sb.append("    clusterBillingModel: ").append(toIndentedString(clusterBillingModel)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
    sb.append("    consumerUuid: ").append(toIndentedString(consumerUuid)).append("\n");
    sb.append("    cpuTotal: ").append(toIndentedString(cpuTotal)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalClusterId: ").append(toIndentedString(externalClusterId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    productBundle: ").append(toIndentedString(productBundle)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    socketTotal: ").append(toIndentedString(socketTotal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportLevel: ").append(toIndentedString(supportLevel)).append("\n");
    sb.append("    systemUnits: ").append(toIndentedString(systemUnits)).append("\n");
    sb.append("    trialEndDate: ").append(toIndentedString(trialEndDate)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

