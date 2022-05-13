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
import com.redhat.services.ffm.amsclient.models.ClusterMetricsNodes;
import com.redhat.services.ffm.amsclient.models.ClusterResource;
import com.redhat.services.ffm.amsclient.models.ClusterUpgrade;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OneMetric
 */
@JsonPropertyOrder({
  OneMetric.JSON_PROPERTY_CHANNEL_INFO,
  OneMetric.JSON_PROPERTY_CLOUD_PROVIDER,
  OneMetric.JSON_PROPERTY_CLUSTER_TYPE,
  OneMetric.JSON_PROPERTY_COMPUTE_NODES_CPU,
  OneMetric.JSON_PROPERTY_COMPUTE_NODES_MEMORY,
  OneMetric.JSON_PROPERTY_COMPUTE_NODES_SOCKETS,
  OneMetric.JSON_PROPERTY_CONSOLE_URL,
  OneMetric.JSON_PROPERTY_CPU,
  OneMetric.JSON_PROPERTY_CRITICAL_ALERTS_FIRING,
  OneMetric.JSON_PROPERTY_HEALTH_STATE,
  OneMetric.JSON_PROPERTY_MEMORY,
  OneMetric.JSON_PROPERTY_NODES,
  OneMetric.JSON_PROPERTY_NON_VIRT_NODES,
  OneMetric.JSON_PROPERTY_OPENSHIFT_VERSION,
  OneMetric.JSON_PROPERTY_OPERATING_SYSTEM,
  OneMetric.JSON_PROPERTY_OPERATORS_CONDITION_FAILING,
  OneMetric.JSON_PROPERTY_QUERY_TIMESTAMP,
  OneMetric.JSON_PROPERTY_REGION,
  OneMetric.JSON_PROPERTY_SOCKETS,
  OneMetric.JSON_PROPERTY_STATE,
  OneMetric.JSON_PROPERTY_STATE_DESCRIPTION,
  OneMetric.JSON_PROPERTY_STORAGE,
  OneMetric.JSON_PROPERTY_SUBSCRIPTION_CPU_TOTAL,
  OneMetric.JSON_PROPERTY_SUBSCRIPTION_OBLIGATION_EXISTS,
  OneMetric.JSON_PROPERTY_SUBSCRIPTION_SOCKET_TOTAL,
  OneMetric.JSON_PROPERTY_UPGRADE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class OneMetric {
  public static final String JSON_PROPERTY_CHANNEL_INFO = "channel_info";
  private String channelInfo;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_CLUSTER_TYPE = "cluster_type";
  private String clusterType;

  public static final String JSON_PROPERTY_COMPUTE_NODES_CPU = "compute_nodes_cpu";
  private ClusterResource computeNodesCpu;

  public static final String JSON_PROPERTY_COMPUTE_NODES_MEMORY = "compute_nodes_memory";
  private ClusterResource computeNodesMemory;

  public static final String JSON_PROPERTY_COMPUTE_NODES_SOCKETS = "compute_nodes_sockets";
  private ClusterResource computeNodesSockets;

  public static final String JSON_PROPERTY_CONSOLE_URL = "console_url";
  private String consoleUrl;

  public static final String JSON_PROPERTY_CPU = "cpu";
  private ClusterResource cpu;

  public static final String JSON_PROPERTY_CRITICAL_ALERTS_FIRING = "critical_alerts_firing";
  private Double criticalAlertsFiring = null;

  /**
   * Gets or Sets healthState
   */
  public enum HealthStateEnum {
    HEALTHY("healthy"),
    
    UNHEALTHY("unhealthy"),
    
    UNKNOWN("unknown");

    private String value;

    HealthStateEnum(String value) {
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
    public static HealthStateEnum fromValue(String value) {
      for (HealthStateEnum b : HealthStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HEALTH_STATE = "health_state";
  private HealthStateEnum healthState;

  public static final String JSON_PROPERTY_MEMORY = "memory";
  private ClusterResource memory;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private ClusterMetricsNodes nodes;

  public static final String JSON_PROPERTY_NON_VIRT_NODES = "non_virt_nodes";
  private Double nonVirtNodes = null;

  public static final String JSON_PROPERTY_OPENSHIFT_VERSION = "openshift_version";
  private String openshiftVersion;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM = "operating_system";
  private String operatingSystem;

  public static final String JSON_PROPERTY_OPERATORS_CONDITION_FAILING = "operators_condition_failing";
  private Double operatorsConditionFailing = null;

  public static final String JSON_PROPERTY_QUERY_TIMESTAMP = "query_timestamp";
  private OffsetDateTime queryTimestamp;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SOCKETS = "sockets";
  private ClusterResource sockets;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_STATE_DESCRIPTION = "state_description";
  private String stateDescription;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private ClusterResource storage;

  public static final String JSON_PROPERTY_SUBSCRIPTION_CPU_TOTAL = "subscription_cpu_total";
  private Double subscriptionCpuTotal = null;

  public static final String JSON_PROPERTY_SUBSCRIPTION_OBLIGATION_EXISTS = "subscription_obligation_exists";
  private Double subscriptionObligationExists = null;

  public static final String JSON_PROPERTY_SUBSCRIPTION_SOCKET_TOTAL = "subscription_socket_total";
  private Double subscriptionSocketTotal = null;

  public static final String JSON_PROPERTY_UPGRADE = "upgrade";
  private ClusterUpgrade upgrade;

  public OneMetric() { 
  }

  public OneMetric channelInfo(String channelInfo) {
    this.channelInfo = channelInfo;
    return this;
  }

   /**
   * Get channelInfo
   * @return channelInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelInfo() {
    return channelInfo;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelInfo(String channelInfo) {
    this.channelInfo = channelInfo;
  }


  public OneMetric cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCloudProvider() {
    return cloudProvider;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public OneMetric clusterType(String clusterType) {
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Get clusterType
   * @return clusterType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterType() {
    return clusterType;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }


  public OneMetric computeNodesCpu(ClusterResource computeNodesCpu) {
    this.computeNodesCpu = computeNodesCpu;
    return this;
  }

   /**
   * Get computeNodesCpu
   * @return computeNodesCpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_CPU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getComputeNodesCpu() {
    return computeNodesCpu;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_CPU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComputeNodesCpu(ClusterResource computeNodesCpu) {
    this.computeNodesCpu = computeNodesCpu;
  }


  public OneMetric computeNodesMemory(ClusterResource computeNodesMemory) {
    this.computeNodesMemory = computeNodesMemory;
    return this;
  }

   /**
   * Get computeNodesMemory
   * @return computeNodesMemory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_MEMORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getComputeNodesMemory() {
    return computeNodesMemory;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_MEMORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComputeNodesMemory(ClusterResource computeNodesMemory) {
    this.computeNodesMemory = computeNodesMemory;
  }


  public OneMetric computeNodesSockets(ClusterResource computeNodesSockets) {
    this.computeNodesSockets = computeNodesSockets;
    return this;
  }

   /**
   * Get computeNodesSockets
   * @return computeNodesSockets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getComputeNodesSockets() {
    return computeNodesSockets;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_NODES_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComputeNodesSockets(ClusterResource computeNodesSockets) {
    this.computeNodesSockets = computeNodesSockets;
  }


  public OneMetric consoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
    return this;
  }

   /**
   * Get consoleUrl
   * @return consoleUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONSOLE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsoleUrl() {
    return consoleUrl;
  }


  @JsonProperty(JSON_PROPERTY_CONSOLE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsoleUrl(String consoleUrl) {
    this.consoleUrl = consoleUrl;
  }


  public OneMetric cpu(ClusterResource cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getCpu() {
    return cpu;
  }


  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCpu(ClusterResource cpu) {
    this.cpu = cpu;
  }


  public OneMetric criticalAlertsFiring(Double criticalAlertsFiring) {
    this.criticalAlertsFiring = criticalAlertsFiring;
    return this;
  }

   /**
   * Get criticalAlertsFiring
   * @return criticalAlertsFiring
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CRITICAL_ALERTS_FIRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getCriticalAlertsFiring() {
    return criticalAlertsFiring;
  }


  @JsonProperty(JSON_PROPERTY_CRITICAL_ALERTS_FIRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCriticalAlertsFiring(Double criticalAlertsFiring) {
    this.criticalAlertsFiring = criticalAlertsFiring;
  }


  public OneMetric healthState(HealthStateEnum healthState) {
    this.healthState = healthState;
    return this;
  }

   /**
   * Get healthState
   * @return healthState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEALTH_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HealthStateEnum getHealthState() {
    return healthState;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthState(HealthStateEnum healthState) {
    this.healthState = healthState;
  }


  public OneMetric memory(ClusterResource memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEMORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getMemory() {
    return memory;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemory(ClusterResource memory) {
    this.memory = memory;
  }


  public OneMetric nodes(ClusterMetricsNodes nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterMetricsNodes getNodes() {
    return nodes;
  }


  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNodes(ClusterMetricsNodes nodes) {
    this.nodes = nodes;
  }


  public OneMetric nonVirtNodes(Double nonVirtNodes) {
    this.nonVirtNodes = nonVirtNodes;
    return this;
  }

   /**
   * Get nonVirtNodes
   * @return nonVirtNodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NON_VIRT_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getNonVirtNodes() {
    return nonVirtNodes;
  }


  @JsonProperty(JSON_PROPERTY_NON_VIRT_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonVirtNodes(Double nonVirtNodes) {
    this.nonVirtNodes = nonVirtNodes;
  }


  public OneMetric openshiftVersion(String openshiftVersion) {
    this.openshiftVersion = openshiftVersion;
    return this;
  }

   /**
   * Get openshiftVersion
   * @return openshiftVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPENSHIFT_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOpenshiftVersion() {
    return openshiftVersion;
  }


  @JsonProperty(JSON_PROPERTY_OPENSHIFT_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenshiftVersion(String openshiftVersion) {
    this.openshiftVersion = openshiftVersion;
  }


  public OneMetric operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperatingSystem() {
    return operatingSystem;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public OneMetric operatorsConditionFailing(Double operatorsConditionFailing) {
    this.operatorsConditionFailing = operatorsConditionFailing;
    return this;
  }

   /**
   * Get operatorsConditionFailing
   * @return operatorsConditionFailing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATORS_CONDITION_FAILING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getOperatorsConditionFailing() {
    return operatorsConditionFailing;
  }


  @JsonProperty(JSON_PROPERTY_OPERATORS_CONDITION_FAILING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatorsConditionFailing(Double operatorsConditionFailing) {
    this.operatorsConditionFailing = operatorsConditionFailing;
  }


  public OneMetric queryTimestamp(OffsetDateTime queryTimestamp) {
    this.queryTimestamp = queryTimestamp;
    return this;
  }

   /**
   * Get queryTimestamp
   * @return queryTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getQueryTimestamp() {
    return queryTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryTimestamp(OffsetDateTime queryTimestamp) {
    this.queryTimestamp = queryTimestamp;
  }


  public OneMetric region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(String region) {
    this.region = region;
  }


  public OneMetric sockets(ClusterResource sockets) {
    this.sockets = sockets;
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getSockets() {
    return sockets;
  }


  @JsonProperty(JSON_PROPERTY_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSockets(ClusterResource sockets) {
    this.sockets = sockets;
  }


  public OneMetric state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(String state) {
    this.state = state;
  }


  public OneMetric stateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

   /**
   * Get stateDescription
   * @return stateDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStateDescription() {
    return stateDescription;
  }


  @JsonProperty(JSON_PROPERTY_STATE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
  }


  public OneMetric storage(ClusterResource storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterResource getStorage() {
    return storage;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorage(ClusterResource storage) {
    this.storage = storage;
  }


  public OneMetric subscriptionCpuTotal(Double subscriptionCpuTotal) {
    this.subscriptionCpuTotal = subscriptionCpuTotal;
    return this;
  }

   /**
   * Get subscriptionCpuTotal
   * @return subscriptionCpuTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_CPU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSubscriptionCpuTotal() {
    return subscriptionCpuTotal;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_CPU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionCpuTotal(Double subscriptionCpuTotal) {
    this.subscriptionCpuTotal = subscriptionCpuTotal;
  }


  public OneMetric subscriptionObligationExists(Double subscriptionObligationExists) {
    this.subscriptionObligationExists = subscriptionObligationExists;
    return this;
  }

   /**
   * Get subscriptionObligationExists
   * @return subscriptionObligationExists
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_OBLIGATION_EXISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSubscriptionObligationExists() {
    return subscriptionObligationExists;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_OBLIGATION_EXISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionObligationExists(Double subscriptionObligationExists) {
    this.subscriptionObligationExists = subscriptionObligationExists;
  }


  public OneMetric subscriptionSocketTotal(Double subscriptionSocketTotal) {
    this.subscriptionSocketTotal = subscriptionSocketTotal;
    return this;
  }

   /**
   * Get subscriptionSocketTotal
   * @return subscriptionSocketTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_SOCKET_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSubscriptionSocketTotal() {
    return subscriptionSocketTotal;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_SOCKET_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionSocketTotal(Double subscriptionSocketTotal) {
    this.subscriptionSocketTotal = subscriptionSocketTotal;
  }


  public OneMetric upgrade(ClusterUpgrade upgrade) {
    this.upgrade = upgrade;
    return this;
  }

   /**
   * Get upgrade
   * @return upgrade
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ClusterUpgrade getUpgrade() {
    return upgrade;
  }


  @JsonProperty(JSON_PROPERTY_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpgrade(ClusterUpgrade upgrade) {
    this.upgrade = upgrade;
  }


  /**
   * Return true if this OneMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneMetric oneMetric = (OneMetric) o;
    return Objects.equals(this.channelInfo, oneMetric.channelInfo) &&
        Objects.equals(this.cloudProvider, oneMetric.cloudProvider) &&
        Objects.equals(this.clusterType, oneMetric.clusterType) &&
        Objects.equals(this.computeNodesCpu, oneMetric.computeNodesCpu) &&
        Objects.equals(this.computeNodesMemory, oneMetric.computeNodesMemory) &&
        Objects.equals(this.computeNodesSockets, oneMetric.computeNodesSockets) &&
        Objects.equals(this.consoleUrl, oneMetric.consoleUrl) &&
        Objects.equals(this.cpu, oneMetric.cpu) &&
        Objects.equals(this.criticalAlertsFiring, oneMetric.criticalAlertsFiring) &&
        Objects.equals(this.healthState, oneMetric.healthState) &&
        Objects.equals(this.memory, oneMetric.memory) &&
        Objects.equals(this.nodes, oneMetric.nodes) &&
        Objects.equals(this.nonVirtNodes, oneMetric.nonVirtNodes) &&
        Objects.equals(this.openshiftVersion, oneMetric.openshiftVersion) &&
        Objects.equals(this.operatingSystem, oneMetric.operatingSystem) &&
        Objects.equals(this.operatorsConditionFailing, oneMetric.operatorsConditionFailing) &&
        Objects.equals(this.queryTimestamp, oneMetric.queryTimestamp) &&
        Objects.equals(this.region, oneMetric.region) &&
        Objects.equals(this.sockets, oneMetric.sockets) &&
        Objects.equals(this.state, oneMetric.state) &&
        Objects.equals(this.stateDescription, oneMetric.stateDescription) &&
        Objects.equals(this.storage, oneMetric.storage) &&
        Objects.equals(this.subscriptionCpuTotal, oneMetric.subscriptionCpuTotal) &&
        Objects.equals(this.subscriptionObligationExists, oneMetric.subscriptionObligationExists) &&
        Objects.equals(this.subscriptionSocketTotal, oneMetric.subscriptionSocketTotal) &&
        Objects.equals(this.upgrade, oneMetric.upgrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelInfo, cloudProvider, clusterType, computeNodesCpu, computeNodesMemory, computeNodesSockets, consoleUrl, cpu, criticalAlertsFiring, healthState, memory, nodes, nonVirtNodes, openshiftVersion, operatingSystem, operatorsConditionFailing, queryTimestamp, region, sockets, state, stateDescription, storage, subscriptionCpuTotal, subscriptionObligationExists, subscriptionSocketTotal, upgrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneMetric {\n");
    sb.append("    channelInfo: ").append(toIndentedString(channelInfo)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    computeNodesCpu: ").append(toIndentedString(computeNodesCpu)).append("\n");
    sb.append("    computeNodesMemory: ").append(toIndentedString(computeNodesMemory)).append("\n");
    sb.append("    computeNodesSockets: ").append(toIndentedString(computeNodesSockets)).append("\n");
    sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    criticalAlertsFiring: ").append(toIndentedString(criticalAlertsFiring)).append("\n");
    sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    nonVirtNodes: ").append(toIndentedString(nonVirtNodes)).append("\n");
    sb.append("    openshiftVersion: ").append(toIndentedString(openshiftVersion)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operatorsConditionFailing: ").append(toIndentedString(operatorsConditionFailing)).append("\n");
    sb.append("    queryTimestamp: ").append(toIndentedString(queryTimestamp)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    subscriptionCpuTotal: ").append(toIndentedString(subscriptionCpuTotal)).append("\n");
    sb.append("    subscriptionObligationExists: ").append(toIndentedString(subscriptionObligationExists)).append("\n");
    sb.append("    subscriptionSocketTotal: ").append(toIndentedString(subscriptionSocketTotal)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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
