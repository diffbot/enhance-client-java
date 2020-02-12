# BulkEnhanceEndpointApi

All URIs are relative to *https://kg.diffbot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkjobStatus**](BulkEnhanceEndpointApi.md#bulkjobStatus) | **GET** /kg/enhance_endpoint/bulk/{bulkjobId}/status | Bulk Enhance Status Endpoint
[**enhanceBulkjob**](BulkEnhanceEndpointApi.md#enhanceBulkjob) | **POST** /kg/enhance_endpoint/bulk | Bulk Enhance Endpoint
[**pollBulkjob**](BulkEnhanceEndpointApi.md#pollBulkjob) | **GET** /kg/enhance_endpoint/bulk/{bulkjobId} | Bulk Enhance Poll Endpoint
[**stopBulkjob**](BulkEnhanceEndpointApi.md#stopBulkjob) | **GET** /kg/enhance_endpoint/bulk/{bulkjobId}/stop | Bulkjob stop


<a name="bulkjobStatus"></a>
# **bulkjobStatus**
> BulkjobStatusResponse bulkjobStatus(bulkjobId, token)

Bulk Enhance Status Endpoint

Get status of a bulk Enhance job

### Example
```java
// Import classes:
import com.diffbot.kg.enhance.openapi.invoker.ApiClient;
import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.invoker.Configuration;
import com.diffbot.kg.enhance.openapi.invoker.models.*;
import com.diffbot.kg.enhance.openapi.api.BulkEnhanceEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://kg.diffbot.com");

    BulkEnhanceEndpointApi apiInstance = new BulkEnhanceEndpointApi(defaultClient);
    String bulkjobId = "bulkjobId_example"; // String | Bulkjob Id
    String token = "token_example"; // String | Diffbot Token
    try {
      BulkjobStatusResponse result = apiInstance.bulkjobStatus(bulkjobId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEnhanceEndpointApi#bulkjobStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkjobId** | **String**| Bulkjob Id |
 **token** | **String**| Diffbot Token | [optional]

### Return type

[**BulkjobStatusResponse**](BulkjobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bulkjob status |  -  |
**201** | Bulkjob is still executing or is stopped |  -  |
**400** | Invalid bulkjobId |  -  |
**401** | Token not specified or other client errors |  -  |
**404** | Bulkjob not found |  -  |
**500** | Internal Server Error |  -  |

<a name="enhanceBulkjob"></a>
# **enhanceBulkjob**
> BulkjobAccepted enhanceBulkjob(token, tag, mode, nonCanonicalFacts, jsonmode, rocketReachToken, webhookurl, xDiffbotRequestId, requestBody)

Bulk Enhance Endpoint

Enhance endpoint to find person or organization using partial data

### Example
```java
// Import classes:
import com.diffbot.kg.enhance.openapi.invoker.ApiClient;
import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.invoker.Configuration;
import com.diffbot.kg.enhance.openapi.invoker.models.*;
import com.diffbot.kg.enhance.openapi.api.BulkEnhanceEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://kg.diffbot.com");

    BulkEnhanceEndpointApi apiInstance = new BulkEnhanceEndpointApi(defaultClient);
    String token = "token_example"; // String | Diffbot Token
    List<String> tag = Arrays.asList(); // List<String> | Tag
    String mode = "mode_example"; // String | `mode=refresh` indicates that Diffbot will attempt to recrawl all the origins of the identified entity and reconstruct the returned entity from this refreshed data.
    String nonCanonicalFacts = "nonCanonicalFacts_example"; // String | `nonCanonicalFacts=true` returns non-canonical facts.
    String jsonmode = "jsonmode_example"; // String | `jsonmode=extended` returns origin information for facts.
    String rocketReachToken = "rocketReachToken_example"; // String | rocketReach token
    String webhookurl = "webhookurl_example"; // String | Webhook URL
    String xDiffbotRequestId = "xDiffbotRequestId_example"; // String | Request UUID for tracking. If available, will be set on response.
    List<Object> requestBody = null; // List<Object> | Bulk query payload
    try {
      BulkjobAccepted result = apiInstance.enhanceBulkjob(token, tag, mode, nonCanonicalFacts, jsonmode, rocketReachToken, webhookurl, xDiffbotRequestId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEnhanceEndpointApi#enhanceBulkjob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Diffbot Token | [optional]
 **tag** | [**List&lt;String&gt;**](String.md)| Tag | [optional]
 **mode** | **String**| &#x60;mode&#x3D;refresh&#x60; indicates that Diffbot will attempt to recrawl all the origins of the identified entity and reconstruct the returned entity from this refreshed data. | [optional]
 **nonCanonicalFacts** | **String**| &#x60;nonCanonicalFacts&#x3D;true&#x60; returns non-canonical facts. | [optional]
 **jsonmode** | **String**| &#x60;jsonmode&#x3D;extended&#x60; returns origin information for facts. | [optional]
 **rocketReachToken** | **String**| rocketReach token | [optional]
 **webhookurl** | **String**| Webhook URL | [optional]
 **xDiffbotRequestId** | **String**| Request UUID for tracking. If available, will be set on response. | [optional]
 **requestBody** | [**List&lt;Object&gt;**](Object.md)| Bulk query payload | [optional]

### Return type

[**BulkjobAccepted**](BulkjobAccepted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Acknowledgement with bulkjobId |  -  |
**400** | Error parsing request |  -  |
**401** | Token not specified or other client errors |  -  |
**429** | Insufficient credits |  -  |
**500** | Internal Server Error |  -  |
**503** | Request too large |  -  |

<a name="pollBulkjob"></a>
# **pollBulkjob**
> Object pollBulkjob(bulkjobId, token, csvmode)

Bulk Enhance Poll Endpoint

Poll a bulk Enhance job

### Example
```java
// Import classes:
import com.diffbot.kg.enhance.openapi.invoker.ApiClient;
import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.invoker.Configuration;
import com.diffbot.kg.enhance.openapi.invoker.models.*;
import com.diffbot.kg.enhance.openapi.api.BulkEnhanceEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://kg.diffbot.com");

    BulkEnhanceEndpointApi apiInstance = new BulkEnhanceEndpointApi(defaultClient);
    String bulkjobId = "bulkjobId_example"; // String | Bulkjob Id
    String token = "token_example"; // String | Diffbot Token
    String csvmode = "csvmode_example"; // String | Return results as csv
    try {
      Object result = apiInstance.pollBulkjob(bulkjobId, token, csvmode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEnhanceEndpointApi#pollBulkjob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkjobId** | **String**| Bulkjob Id |
 **token** | **String**| Diffbot Token | [optional]
 **csvmode** | **String**| Return results as csv | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Enhanced entity |  -  |
**201** | Bulkjob is still executing or is stopped |  -  |
**400** | Invalid bulkjobId |  -  |
**401** | Token not specified or other client errors |  -  |
**404** | Bulkjob not found |  -  |
**500** | Internal Server Error |  -  |

<a name="stopBulkjob"></a>
# **stopBulkjob**
> BulkjobRecoveryStatusResponse stopBulkjob(bulkjobId, token)

Bulkjob stop

Stop an incomplete job

### Example
```java
// Import classes:
import com.diffbot.kg.enhance.openapi.invoker.ApiClient;
import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.invoker.Configuration;
import com.diffbot.kg.enhance.openapi.invoker.models.*;
import com.diffbot.kg.enhance.openapi.api.BulkEnhanceEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://kg.diffbot.com");

    BulkEnhanceEndpointApi apiInstance = new BulkEnhanceEndpointApi(defaultClient);
    String bulkjobId = "bulkjobId_example"; // String | Bulkjob Id
    String token = "token_example"; // String | Diffbot Token
    try {
      BulkjobRecoveryStatusResponse result = apiInstance.stopBulkjob(bulkjobId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEnhanceEndpointApi#stopBulkjob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkjobId** | **String**| Bulkjob Id |
 **token** | **String**| Diffbot Token | [optional]

### Return type

[**BulkjobRecoveryStatusResponse**](BulkjobRecoveryStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Enhanced entity |  -  |
**400** | Invalid bulkjobId |  -  |
**401** | Token not specified or other client errors |  -  |
**404** | Bulkjob not found |  -  |
**500** | Internal Server Error |  -  |

