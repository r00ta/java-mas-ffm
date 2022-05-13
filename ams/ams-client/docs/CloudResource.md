

# CloudResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**kind** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**category** | **String** |  |  [optional]
**categoryPretty** | **String** |  |  [optional]
**cloudProvider** | **String** |  |  [optional]
**cpuCores** | **Integer** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**genericName** | **String** |  |  [optional]
**memory** | **Integer** |  |  [optional]
**memoryPretty** | **String** |  |  [optional]
**namePretty** | **String** |  |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  |  [optional]
**sizePretty** | **String** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]



## Enum: ResourceTypeEnum

Name | Value
---- | -----
ADDON | &quot;addon&quot;
COMPUTE_NODE | &quot;compute.node&quot;
CLUSTER | &quot;cluster&quot;
NETWORK_IO | &quot;network.io&quot;
NETWORK_LOADBALANCER | &quot;network.loadbalancer&quot;
PV_STORAGE | &quot;pv.storage&quot;



