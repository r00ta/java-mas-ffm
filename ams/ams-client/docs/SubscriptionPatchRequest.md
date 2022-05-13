

# SubscriptionPatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingExpirationDate** | **OffsetDateTime** |  |  [optional]
**cloudAccountId** | **String** |  |  [optional]
**cloudProviderId** | **String** |  |  [optional]
**clusterBillingModel** | [**ClusterBillingModelEnum**](#ClusterBillingModelEnum) |  |  [optional]
**clusterId** | **String** |  |  [optional]
**consoleUrl** | **String** |  |  [optional]
**consumerUuid** | **String** |  |  [optional]
**cpuTotal** | **Integer** |  |  [optional]
**creatorId** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**externalClusterId** | **String** |  |  [optional]
**managed** | **Boolean** |  |  [optional]
**organizationId** | **String** |  |  [optional]
**planId** | **String** |  |  [optional]
**productBundle** | [**ProductBundleEnum**](#ProductBundleEnum) |  |  [optional]
**provenance** | **String** |  |  [optional]
**regionId** | **String** |  |  [optional]
**released** | **Boolean** |  |  [optional]
**serviceLevel** | [**ServiceLevelEnum**](#ServiceLevelEnum) |  |  [optional]
**socketTotal** | **Integer** |  |  [optional]
**status** | **String** |  |  [optional]
**supportLevel** | [**SupportLevelEnum**](#SupportLevelEnum) |  |  [optional]
**systemUnits** | [**SystemUnitsEnum**](#SystemUnitsEnum) |  |  [optional]
**trialEndDate** | **OffsetDateTime** |  |  [optional]
**usage** | [**UsageEnum**](#UsageEnum) |  |  [optional]



## Enum: ClusterBillingModelEnum

Name | Value
---- | -----
STANDARD | &quot;standard&quot;
MARKETPLACE | &quot;marketplace&quot;



## Enum: ProductBundleEnum

Name | Value
---- | -----
OPENSHIFT | &quot;Openshift&quot;
JBOSS_MIDDLEWARE | &quot;JBoss-Middleware&quot;
IBM_CLOUDPAK | &quot;IBM-CloudPak&quot;



## Enum: ServiceLevelEnum

Name | Value
---- | -----
L1_L3 | &quot;L1-L3&quot;
L3_ONLY | &quot;L3-only&quot;



## Enum: SupportLevelEnum

Name | Value
---- | -----
EVAL | &quot;Eval&quot;
STANDARD | &quot;Standard&quot;
PREMIUM | &quot;Premium&quot;
SELF_SUPPORT | &quot;Self-Support&quot;
NONE | &quot;None&quot;



## Enum: SystemUnitsEnum

Name | Value
---- | -----
CORES_VCPU | &quot;Cores/vCPU&quot;
SOCKETS | &quot;Sockets&quot;



## Enum: UsageEnum

Name | Value
---- | -----
PRODUCTION | &quot;Production&quot;
DEVELOPMENT_TEST | &quot;Development/Test&quot;
DISASTER_RECOVERY | &quot;Disaster Recovery&quot;
ACADEMIC | &quot;Academic&quot;



