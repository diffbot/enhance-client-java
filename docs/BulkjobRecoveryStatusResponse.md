

# BulkjobRecoveryStatusResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Bulkjob recovery status |  [optional]
**message** | **String** | Bulkjob recovery status message |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
IN_PROCESS | &quot;IN_PROCESS&quot;
COMPLETE | &quot;COMPLETE&quot;
COMPLETE_WITH_FAILURES | &quot;COMPLETE_WITH_FAILURES&quot;
STOPPED | &quot;STOPPED&quot;
ERROR_FINALIZING | &quot;ERROR_FINALIZING&quot;
UNKNOWN | &quot;UNKNOWN&quot;



