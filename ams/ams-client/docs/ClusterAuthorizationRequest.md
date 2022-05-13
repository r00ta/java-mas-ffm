

# ClusterAuthorizationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountUsername** | **String** |  | 
**availabilityZone** | **String** |  |  [optional]
**byoc** | **Boolean** |  |  [optional]
**cloudAccountId** | **String** |  |  [optional]
**cloudProviderId** | **String** |  |  [optional]
**clusterId** | **String** |  | 
**disconnected** | **Boolean** |  |  [optional]
**displayName** | **String** |  |  [optional]
**externalClusterId** | **String** |  |  [optional]
**managed** | **Boolean** |  |  [optional]
**productCategory** | [**ProductCategoryEnum**](#ProductCategoryEnum) |  |  [optional]
**productId** | [**ProductIdEnum**](#ProductIdEnum) |  |  [optional]
**quotaVersion** | **String** |  |  [optional]
**reserve** | **Boolean** |  |  [optional]
**resources** | [**List&lt;ReservedResource&gt;**](ReservedResource.md) |  |  [optional]



## Enum: ProductCategoryEnum

Name | Value
---- | -----
ASSISTEDINSTALL | &quot;assistedInstall&quot;



## Enum: ProductIdEnum

Name | Value
---- | -----
OCP | &quot;ocp&quot;
OSD | &quot;osd&quot;
OSDTRIAL | &quot;osdtrial&quot;
MOA | &quot;moa&quot;
RHMI | &quot;rhmi&quot;



