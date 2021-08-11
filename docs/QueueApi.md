# QueueApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteQueueBulk**](QueueApi.md#deleteQueueBulk) | **DELETE** queue/bulk | Remove Items from Queue
[**deleteQueueId**](QueueApi.md#deleteQueueId) | **DELETE** queue/{id} | Remove Item from Queue
[**getQueue**](QueueApi.md#getQueue) | **GET** queue | Get Activity Queue
[**getQueueDetails**](QueueApi.md#getQueueDetails) | **GET** queue/details | Get Queue Item Details
[**getQueueStatus**](QueueApi.md#getQueueStatus) | **GET** queue/status | Get Queue Status
[**postQueueGrabId**](QueueApi.md#postQueueGrabId) | **POST** queue/grab/{id} | 

<a name="deleteQueueBulk"></a>
# **deleteQueueBulk**
> Void deleteQueueBulk(body, removeFromClient, blacklist)

Remove Items from Queue

Remove multiple items from queue by their ids

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
QueueBulkBody body = new QueueBulkBody(); // QueueBulkBody | 
Boolean removeFromClient = true; // Boolean | 
Boolean blacklist = true; // Boolean | 
try {
    Void result = apiInstance.deleteQueueBulk(body, removeFromClient, blacklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#deleteQueueBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueueBulkBody**](QueueBulkBody.md)|  | [optional]
 **removeFromClient** | **Boolean**|  | [optional]
 **blacklist** | **Boolean**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteQueueId"></a>
# **deleteQueueId**
> Void deleteQueueId(id, removeFromClient, blacklist)

Remove Item from Queue

Remove an item from the queue and optionally blacklist it

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
String id = "id_example"; // String | 
Boolean removeFromClient = true; // Boolean | 
Boolean blacklist = true; // Boolean | 
try {
    Void result = apiInstance.deleteQueueId(id, removeFromClient, blacklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#deleteQueueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **removeFromClient** | **Boolean**|  | [optional]
 **blacklist** | **Boolean**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getQueue"></a>
# **getQueue**
> Void getQueue(page, pageSize, sortDirection, sortKey, includeUnknownMovieItems)

Get Activity Queue

Return a json object list of items in the queue

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
Integer page = 56; // Integer | 1
Integer pageSize = 56; // Integer | 20
String sortDirection = "sortDirection_example"; // String | ascending
String sortKey = "sortKey_example"; // String | timeLeft
Boolean includeUnknownMovieItems = true; // Boolean | true
try {
    Void result = apiInstance.getQueue(page, pageSize, sortDirection, sortKey, includeUnknownMovieItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#getQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| 1 |
 **pageSize** | **Integer**| 20 |
 **sortDirection** | **String**| ascending |
 **sortKey** | **String**| timeLeft |
 **includeUnknownMovieItems** | **Boolean**| true |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getQueueDetails"></a>
# **getQueueDetails**
> List&lt;InlineResponse2009&gt; getQueueDetails(includeMovie)

Get Queue Item Details

Get details of all items in queue

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
Boolean includeMovie = true; // Boolean | Include Movie object if linked
try {
    List<InlineResponse2009> result = apiInstance.getQueueDetails(includeMovie);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#getQueueDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeMovie** | **Boolean**| Include Movie object if linked | [optional]

### Return type

[**List&lt;InlineResponse2009&gt;**](InlineResponse2009.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQueueStatus"></a>
# **getQueueStatus**
> InlineResponse20010 getQueueStatus()

Get Queue Status

Stats on items in queue

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
try {
    InlineResponse20010 result = apiInstance.getQueueStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#getQueueStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postQueueGrabId"></a>
# **postQueueGrabId**
> Void postQueueGrabId(id)



Perform a Radarr \&quot;force grab\&quot; on a pending queue item by its ID.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.QueueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QueueApi apiInstance = new QueueApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.postQueueGrabId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#postQueueGrabId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

