# EnhanceLiveEndpointApi

All URIs are relative to *https://kg.diffbot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enhance**](EnhanceLiveEndpointApi.md#enhance) | **GET** /kg/enhance_endpoint | Live Enhance Endpoint


<a name="enhance"></a>
# **enhance**
> EnhanceResponse enhance(token, type, id, name, url, phone, email, description, employer, title, school, location, mode, nonCanonicalFacts, jsonmode, rocketReachToken, xDiffbotRequestId)

Live Enhance Endpoint

Enhance endpoint to find person or organization using partial data

### Example
```java
// Import classes:
import com.diffbot.kg.enhance.openapi.invoker.ApiClient;
import com.diffbot.kg.enhance.openapi.invoker.ApiException;
import com.diffbot.kg.enhance.openapi.invoker.Configuration;
import com.diffbot.kg.enhance.openapi.invoker.models.*;
import com.diffbot.kg.enhance.openapi.api.EnhanceLiveEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://kg.diffbot.com");

    EnhanceLiveEndpointApi apiInstance = new EnhanceLiveEndpointApi(defaultClient);
    String token = "token_example"; // String | Diffbot Token
    String type = "type_example"; // String | Diffbot entity type
    String id = "id_example"; // String | DiffbotId of entity to enhance. Parameter can be used with types `Person` and `Organization`
    String name = "name_example"; // String | Name of the entity to enhance. Parameter can be used with types `Person` and `Organization`
    String url = "url_example"; // String | Origin or homepage URI of entity to enhance. Parameter can be used with types `Person` and `Organization`
    String phone = "phone_example"; // String | Phone of the entity to enhance. Parameter can be used with types `Person` and `Organization`
    String email = "email_example"; // String | Email of the entity to enhance. Parameter can be used only with type `Person`
    String description = "description_example"; // String | Description of the entity to enhance. Parameter can be used with types `Person` and `Organization`
    String employer = "employer_example"; // String | Employer of the entity to enhance. Parameter can be used only with type `Person`
    String title = "title_example"; // String | Title of the entity to enhance. Parameter can be used only with type `Person`
    String school = "school_example"; // String | School of the entity to enhance. Parameter can be used only with type `Person`
    String location = "location_example"; // String | Location of the entity to enhance. Parameter can be used with types `Person` and `Organization`
    String mode = "mode_example"; // String | `mode=refresh` indicates that Diffbot will attempt to recrawl all the origins of the identified entity and reconstruct the returned entity from this refreshed data.
    String nonCanonicalFacts = "nonCanonicalFacts_example"; // String | `nonCanonicalFacts=true` returns non-canonical facts.
    String jsonmode = "jsonmode_example"; // String | `jsonmode=extended` returns origin information for facts.
    String rocketReachToken = "rocketReachToken_example"; // String | rocketReach token
    String xDiffbotRequestId = "xDiffbotRequestId_example"; // String | Request UUID for tracking. If available, will be set on response.
    try {
      EnhanceResponse result = apiInstance.enhance(token, type, id, name, url, phone, email, description, employer, title, school, location, mode, nonCanonicalFacts, jsonmode, rocketReachToken, xDiffbotRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnhanceLiveEndpointApi#enhance");
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
 **type** | **String**| Diffbot entity type | [optional] [enum: Person, Organization]
 **id** | **String**| DiffbotId of entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **name** | **String**| Name of the entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **url** | **String**| Origin or homepage URI of entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **phone** | **String**| Phone of the entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **email** | **String**| Email of the entity to enhance. Parameter can be used only with type &#x60;Person&#x60; | [optional]
 **description** | **String**| Description of the entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **employer** | **String**| Employer of the entity to enhance. Parameter can be used only with type &#x60;Person&#x60; | [optional]
 **title** | **String**| Title of the entity to enhance. Parameter can be used only with type &#x60;Person&#x60; | [optional]
 **school** | **String**| School of the entity to enhance. Parameter can be used only with type &#x60;Person&#x60; | [optional]
 **location** | **String**| Location of the entity to enhance. Parameter can be used with types &#x60;Person&#x60; and &#x60;Organization&#x60; | [optional]
 **mode** | **String**| &#x60;mode&#x3D;refresh&#x60; indicates that Diffbot will attempt to recrawl all the origins of the identified entity and reconstruct the returned entity from this refreshed data. | [optional]
 **nonCanonicalFacts** | **String**| &#x60;nonCanonicalFacts&#x3D;true&#x60; returns non-canonical facts. | [optional]
 **jsonmode** | **String**| &#x60;jsonmode&#x3D;extended&#x60; returns origin information for facts. | [optional]
 **rocketReachToken** | **String**| rocketReach token | [optional]
 **xDiffbotRequestId** | **String**| Request UUID for tracking. If available, will be set on response. | [optional]

### Return type

[**EnhanceResponse**](EnhanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Enhanced entity |  -  |
**400** | Error parsing request |  -  |
**401** | Token not specified or other client errors |  -  |
**429** | Insufficient credits |  -  |
**500** | Internal Server Error |  -  |

