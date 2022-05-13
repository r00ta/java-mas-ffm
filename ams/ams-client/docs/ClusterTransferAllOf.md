

# ClusterTransferAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterUuid** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**expirationDate** | **OffsetDateTime** |  |  [optional]
**owner** | **String** |  |  [optional]
**recipient** | **String** |  |  [optional]
**secret** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
ACCEPTED | &quot;Accepted&quot;
DECLINED | &quot;Declined&quot;
RESCINDED | &quot;Rescinded&quot;
COMPLETED | &quot;Completed&quot;



