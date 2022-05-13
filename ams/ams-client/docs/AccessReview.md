

# AccessReview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountUsername** | **String** |  | 
**action** | [**ActionEnum**](#ActionEnum) |  | 
**clusterId** | **String** |  |  [optional]
**clusterUuid** | **String** |  |  [optional]
**organizationId** | **String** |  |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**subscriptionId** | **String** |  |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
GET | &quot;get&quot;
LIST | &quot;list&quot;
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
UPDATE | &quot;update&quot;



## Enum: ResourceTypeEnum

Name | Value
---- | -----
ADDON | &quot;AddOn&quot;
FLAVOUR | &quot;Flavour&quot;
ACCOUNT | &quot;Account&quot;
ACCOUNTPOOL | &quot;AccountPool&quot;
CLUSTER | &quot;Cluster&quot;
PLAN | &quot;Plan&quot;
SUBSCRIPTION | &quot;Subscription&quot;
ORGANIZATION | &quot;Organization&quot;
ROLE | &quot;Role&quot;
PERMISSION | &quot;Permission&quot;
ROLEBINDING | &quot;RoleBinding&quot;
REGISTRY | &quot;Registry&quot;
REGISTRYCREDENTIAL | &quot;RegistryCredential&quot;
CURRENTACCOUNT | &quot;CurrentAccount&quot;
ACCESSREVIEW | &quot;AccessReview&quot;
SELFACCCESSREVIEW | &quot;SelfAcccessReview&quot;
RESOURCEREVIEW | &quot;ResourceReview&quot;
SELFRESOURCEREVIEW | &quot;SelfResourceReview&quot;
CLUSTERREGISTRATION | &quot;ClusterRegistration&quot;
ACCESSTOKEN | &quot;AccessToken&quot;
CLUSTERAUTHORIZATION | &quot;ClusterAuthorization&quot;
SELFMANAGEDCLUSTER | &quot;SelfManagedCluster&quot;
REDHATMANAGEDCLUSTER | &quot;RedhatManagedCluster&quot;
EXPORTCONTROLREVIEW | &quot;ExportControlReview&quot;
CLUSTERLOG | &quot;ClusterLog&quot;
CLUSTERCREDENTIAL | &quot;ClusterCredential&quot;
CLUSTERMETRIC | &quot;ClusterMetric&quot;
RESOURCEQUOTA | &quot;ResourceQuota&quot;
RESERVEDRESOURCE | &quot;ReservedResource&quot;
DASHBOARD | &quot;Dashboard&quot;
CLUSTERPROVIDERANDREGION | &quot;ClusterProviderAndRegion&quot;
SERVICELOG | &quot;ServiceLog&quot;
INTERNALSERVICELOG | &quot;InternalServiceLog&quot;
CSLOGS | &quot;CSLogs&quot;
SUBSCRIPTIONLABEL | &quot;SubscriptionLabel&quot;
ORGANIZATIONLABEL | &quot;OrganizationLabel&quot;
SUBSCRIPTIONLABELINTERNAL | &quot;SubscriptionLabelInternal&quot;
SELFACCESSREVIEW | &quot;SelfAccessReview&quot;
SUBSCRIPTIONINTERNAL | &quot;SubscriptionInternal&quot;
SUBSCRIPTIONROLEBINDING | &quot;SubscriptionRoleBinding&quot;



