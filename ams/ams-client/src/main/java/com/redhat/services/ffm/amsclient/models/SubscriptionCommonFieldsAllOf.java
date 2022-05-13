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
 * SubscriptionCommonFieldsAllOf
 */
@JsonPropertyOrder({
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_BILLING_EXPIRATION_DATE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CLOUD_PROVIDER_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CLUSTER_BILLING_MODEL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CLUSTER_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CONSOLE_URL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CONSUMER_UUID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CPU_TOTAL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_CREATOR_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_DISPLAY_NAME,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_EXTERNAL_CLUSTER_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_LAST_RECONCILE_DATE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_LAST_RELEASED_AT,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_LAST_TELEMETRY_DATE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_MANAGED,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_ORGANIZATION_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_PLAN_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_PRODUCT_BUNDLE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_PROVENANCE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_REGION_ID,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_RELEASED,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_SERVICE_LEVEL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_SOCKET_TOTAL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_STATUS,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_SUPPORT_LEVEL,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_SYSTEM_UNITS,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_TRIAL_END_DATE,
  SubscriptionCommonFieldsAllOf.JSON_PROPERTY_USAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class SubscriptionCommonFieldsAllOf {
  public static final String JSON_PROPERTY_BILLING_EXPIRATION_DATE = "billing_expiration_date";
  private OffsetDateTime billingExpirationDate;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloud_account_id";
  private String cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER_ID = "cloud_provider_id";
  private String cloudProviderId;

  public static final String JSON_PROPERTY_CLUSTER_BILLING_MODEL = "cluster_billing_model";
  private String clusterBillingModel;

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

  public static final String JSON_PROPERTY_LAST_RECONCILE_DATE = "last_reconcile_date";
  private OffsetDateTime lastReconcileDate;

  public static final String JSON_PROPERTY_LAST_RELEASED_AT = "last_released_at";
  private OffsetDateTime lastReleasedAt;

  public static final String JSON_PROPERTY_LAST_TELEMETRY_DATE = "last_telemetry_date";
  private OffsetDateTime lastTelemetryDate;

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

  public SubscriptionCommonFieldsAllOf() { 
  }

  public SubscriptionCommonFieldsAllOf billingExpirationDate(OffsetDateTime billingExpirationDate) {
    this.billingExpirationDate = billingExpirationDate;
    return this;
  }

   /**
   * If set, the date the subscription expires based on the billing model
   * @return billingExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, the date the subscription expires based on the billing model")
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


  public SubscriptionCommonFieldsAllOf cloudAccountId(String cloudAccountId) {
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


  public SubscriptionCommonFieldsAllOf cloudProviderId(String cloudProviderId) {
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


  public SubscriptionCommonFieldsAllOf clusterBillingModel(String clusterBillingModel) {
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

  public String getClusterBillingModel() {
    return clusterBillingModel;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterBillingModel(String clusterBillingModel) {
    this.clusterBillingModel = clusterBillingModel;
  }


  public SubscriptionCommonFieldsAllOf clusterId(String clusterId) {
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


  public SubscriptionCommonFieldsAllOf consoleUrl(String consoleUrl) {
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


  public SubscriptionCommonFieldsAllOf consumerUuid(String consumerUuid) {
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


  public SubscriptionCommonFieldsAllOf cpuTotal(Integer cpuTotal) {
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


  public SubscriptionCommonFieldsAllOf creatorId(String creatorId) {
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


  public SubscriptionCommonFieldsAllOf displayName(String displayName) {
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


  public SubscriptionCommonFieldsAllOf externalClusterId(String externalClusterId) {
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


  public SubscriptionCommonFieldsAllOf lastReconcileDate(OffsetDateTime lastReconcileDate) {
    this.lastReconcileDate = lastReconcileDate;
    return this;
  }

   /**
   * Last time this subscription were reconciled about cluster usage
   * @return lastReconcileDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time this subscription were reconciled about cluster usage")
  @JsonProperty(JSON_PROPERTY_LAST_RECONCILE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastReconcileDate() {
    return lastReconcileDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RECONCILE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastReconcileDate(OffsetDateTime lastReconcileDate) {
    this.lastReconcileDate = lastReconcileDate;
  }


  public SubscriptionCommonFieldsAllOf lastReleasedAt(OffsetDateTime lastReleasedAt) {
    this.lastReleasedAt = lastReleasedAt;
    return this;
  }

   /**
   * Last time status was set to Released for this cluster/subscription in Unix time
   * @return lastReleasedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time status was set to Released for this cluster/subscription in Unix time")
  @JsonProperty(JSON_PROPERTY_LAST_RELEASED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastReleasedAt() {
    return lastReleasedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RELEASED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastReleasedAt(OffsetDateTime lastReleasedAt) {
    this.lastReleasedAt = lastReleasedAt;
  }


  public SubscriptionCommonFieldsAllOf lastTelemetryDate(OffsetDateTime lastTelemetryDate) {
    this.lastTelemetryDate = lastTelemetryDate;
    return this;
  }

   /**
   * Last telemetry authorization request for this cluster/subscription in Unix time
   * @return lastTelemetryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last telemetry authorization request for this cluster/subscription in Unix time")
  @JsonProperty(JSON_PROPERTY_LAST_TELEMETRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastTelemetryDate() {
    return lastTelemetryDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TELEMETRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastTelemetryDate(OffsetDateTime lastTelemetryDate) {
    this.lastTelemetryDate = lastTelemetryDate;
  }


  public SubscriptionCommonFieldsAllOf managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getManaged() {
    return managed;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public SubscriptionCommonFieldsAllOf organizationId(String organizationId) {
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


  public SubscriptionCommonFieldsAllOf planId(String planId) {
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


  public SubscriptionCommonFieldsAllOf productBundle(ProductBundleEnum productBundle) {
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


  public SubscriptionCommonFieldsAllOf provenance(String provenance) {
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


  public SubscriptionCommonFieldsAllOf regionId(String regionId) {
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


  public SubscriptionCommonFieldsAllOf released(Boolean released) {
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


  public SubscriptionCommonFieldsAllOf serviceLevel(ServiceLevelEnum serviceLevel) {
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


  public SubscriptionCommonFieldsAllOf socketTotal(Integer socketTotal) {
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


  public SubscriptionCommonFieldsAllOf status(String status) {
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


  public SubscriptionCommonFieldsAllOf supportLevel(SupportLevelEnum supportLevel) {
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


  public SubscriptionCommonFieldsAllOf systemUnits(SystemUnitsEnum systemUnits) {
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


  public SubscriptionCommonFieldsAllOf trialEndDate(OffsetDateTime trialEndDate) {
    this.trialEndDate = trialEndDate;
    return this;
  }

   /**
   * If the subscription is a trial, date the trial ends
   * @return trialEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the subscription is a trial, date the trial ends")
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


  public SubscriptionCommonFieldsAllOf usage(UsageEnum usage) {
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
   * Return true if this SubscriptionCommonFields_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCommonFieldsAllOf subscriptionCommonFieldsAllOf = (SubscriptionCommonFieldsAllOf) o;
    return Objects.equals(this.billingExpirationDate, subscriptionCommonFieldsAllOf.billingExpirationDate) &&
        Objects.equals(this.cloudAccountId, subscriptionCommonFieldsAllOf.cloudAccountId) &&
        Objects.equals(this.cloudProviderId, subscriptionCommonFieldsAllOf.cloudProviderId) &&
        Objects.equals(this.clusterBillingModel, subscriptionCommonFieldsAllOf.clusterBillingModel) &&
        Objects.equals(this.clusterId, subscriptionCommonFieldsAllOf.clusterId) &&
        Objects.equals(this.consoleUrl, subscriptionCommonFieldsAllOf.consoleUrl) &&
        Objects.equals(this.consumerUuid, subscriptionCommonFieldsAllOf.consumerUuid) &&
        Objects.equals(this.cpuTotal, subscriptionCommonFieldsAllOf.cpuTotal) &&
        Objects.equals(this.creatorId, subscriptionCommonFieldsAllOf.creatorId) &&
        Objects.equals(this.displayName, subscriptionCommonFieldsAllOf.displayName) &&
        Objects.equals(this.externalClusterId, subscriptionCommonFieldsAllOf.externalClusterId) &&
        Objects.equals(this.lastReconcileDate, subscriptionCommonFieldsAllOf.lastReconcileDate) &&
        Objects.equals(this.lastReleasedAt, subscriptionCommonFieldsAllOf.lastReleasedAt) &&
        Objects.equals(this.lastTelemetryDate, subscriptionCommonFieldsAllOf.lastTelemetryDate) &&
        Objects.equals(this.managed, subscriptionCommonFieldsAllOf.managed) &&
        Objects.equals(this.organizationId, subscriptionCommonFieldsAllOf.organizationId) &&
        Objects.equals(this.planId, subscriptionCommonFieldsAllOf.planId) &&
        Objects.equals(this.productBundle, subscriptionCommonFieldsAllOf.productBundle) &&
        Objects.equals(this.provenance, subscriptionCommonFieldsAllOf.provenance) &&
        Objects.equals(this.regionId, subscriptionCommonFieldsAllOf.regionId) &&
        Objects.equals(this.released, subscriptionCommonFieldsAllOf.released) &&
        Objects.equals(this.serviceLevel, subscriptionCommonFieldsAllOf.serviceLevel) &&
        Objects.equals(this.socketTotal, subscriptionCommonFieldsAllOf.socketTotal) &&
        Objects.equals(this.status, subscriptionCommonFieldsAllOf.status) &&
        Objects.equals(this.supportLevel, subscriptionCommonFieldsAllOf.supportLevel) &&
        Objects.equals(this.systemUnits, subscriptionCommonFieldsAllOf.systemUnits) &&
        Objects.equals(this.trialEndDate, subscriptionCommonFieldsAllOf.trialEndDate) &&
        Objects.equals(this.usage, subscriptionCommonFieldsAllOf.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingExpirationDate, cloudAccountId, cloudProviderId, clusterBillingModel, clusterId, consoleUrl, consumerUuid, cpuTotal, creatorId, displayName, externalClusterId, lastReconcileDate, lastReleasedAt, lastTelemetryDate, managed, organizationId, planId, productBundle, provenance, regionId, released, serviceLevel, socketTotal, status, supportLevel, systemUnits, trialEndDate, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCommonFieldsAllOf {\n");
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
    sb.append("    lastReconcileDate: ").append(toIndentedString(lastReconcileDate)).append("\n");
    sb.append("    lastReleasedAt: ").append(toIndentedString(lastReleasedAt)).append("\n");
    sb.append("    lastTelemetryDate: ").append(toIndentedString(lastTelemetryDate)).append("\n");
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

