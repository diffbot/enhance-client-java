

# BulkjobStatus

Bulkjob status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | Bulkjob Id |  [optional]
**message** | **String** | Bulkjob status message |  [optional]
**jobsTotal** | **Integer** | Number of jobs in bulkjob |  [optional]
**jobsCompleted** | **Integer** | Number of jobs completed in bulkjob. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of Bulkjob. One of {NOT_STARTED, IN_PROCESS, COMPLETE, COMPLETE_WITH_FAILURES, STOPPED, ERROR_FINALIZING, UNKNOWN} |  [optional]
**estimateRemainingTime** | **Long** | Estimated remaining time for bulkjob to complete (in seconds). &#x60;null&#x60; if job is completed or not started. |  [optional]



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



