

# OneMetric


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelInfo** | **String** |  |  [optional]
**cloudProvider** | **String** |  | 
**clusterType** | **String** |  | 
**computeNodesCpu** | [**ClusterResource**](ClusterResource.md) |  | 
**computeNodesMemory** | [**ClusterResource**](ClusterResource.md) |  | 
**computeNodesSockets** | [**ClusterResource**](ClusterResource.md) |  | 
**consoleUrl** | **String** |  | 
**cpu** | [**ClusterResource**](ClusterResource.md) |  | 
**criticalAlertsFiring** | **Double** |  | 
**healthState** | [**HealthStateEnum**](#HealthStateEnum) |  |  [optional]
**memory** | [**ClusterResource**](ClusterResource.md) |  | 
**nodes** | [**ClusterMetricsNodes**](ClusterMetricsNodes.md) |  | 
**nonVirtNodes** | **Double** |  | 
**openshiftVersion** | **String** |  | 
**operatingSystem** | **String** |  | 
**operatorsConditionFailing** | **Double** |  | 
**queryTimestamp** | **OffsetDateTime** |  |  [optional]
**region** | **String** |  | 
**sockets** | [**ClusterResource**](ClusterResource.md) |  | 
**state** | **String** |  | 
**stateDescription** | **String** |  | 
**storage** | [**ClusterResource**](ClusterResource.md) |  | 
**subscriptionCpuTotal** | **Double** |  | 
**subscriptionObligationExists** | **Double** |  | 
**subscriptionSocketTotal** | **Double** |  | 
**upgrade** | [**ClusterUpgrade**](ClusterUpgrade.md) |  | 



## Enum: HealthStateEnum

Name | Value
---- | -----
HEALTHY | &quot;healthy&quot;
UNHEALTHY | &quot;unhealthy&quot;
UNKNOWN | &quot;unknown&quot;



