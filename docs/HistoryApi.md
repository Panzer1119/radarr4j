# HistoryApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistory**](HistoryApi.md#getHistory) | **GET** history | Get History
[**getHistoryMovie**](HistoryApi.md#getHistoryMovie) | **GET** history/movie | Get History for a Movie

<a name="getHistory"></a>
# **getHistory**
> InlineResponse2002 getHistory(page, pageSize, sortDirection, sortKey)

Get History

Return a json object list of items in your history

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.HistoryApi;

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

HistoryApi apiInstance = new HistoryApi();
Integer page = 56; // Integer | 1
Integer pageSize = 56; // Integer | 20
String sortDirection = "sortDirection_example"; // String | descending
String sortKey = "sortKey_example"; // String | date
try {
    InlineResponse2002 result = apiInstance.getHistory(page, pageSize, sortDirection, sortKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| 1 |
 **pageSize** | **Integer**| 20 |
 **sortDirection** | **String**| descending |
 **sortKey** | **String**| date |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHistoryMovie"></a>
# **getHistoryMovie**
> List&lt;History&gt; getHistoryMovie(movieId, eventType)

Get History for a Movie

Get history for a given movie in database by its database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.HistoryApi;

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

HistoryApi apiInstance = new HistoryApi();
Integer movieId = 56; // Integer | database id of movie
Integer eventType = 56; // Integer | history event type to retrieve
try {
    List<History> result = apiInstance.getHistoryMovie(movieId, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getHistoryMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**| database id of movie |
 **eventType** | **Integer**| history event type to retrieve | [optional]

### Return type

[**List&lt;History&gt;**](History.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

