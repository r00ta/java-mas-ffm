

# RoleBinding


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**kind** | **String** |  |  [optional]
**account** | [**ObjectReference**](ObjectReference.md) |  |  [optional]
**configManaged** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**managedBy** | [**ManagedByEnum**](#ManagedByEnum) |  |  [optional]
**organization** | [**ObjectReference**](ObjectReference.md) |  |  [optional]
**role** | [**ObjectReference**](ObjectReference.md) |  |  [optional]
**subscription** | [**ObjectReference**](ObjectReference.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]



## Enum: ManagedByEnum

Name | Value
---- | -----
CONFIG | &quot;Config&quot;
USER | &quot;User&quot;



## Enum: TypeEnum

Name | Value
---- | -----
APPLICATION | &quot;Application&quot;
SUBSCRIPTION | &quot;Subscription&quot;
ORGANIZATION | &quot;Organization&quot;



