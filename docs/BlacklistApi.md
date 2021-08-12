# BlacklistApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBlackList**](BlacklistApi.md#deleteBlackList) | **DELETE** blacklist | Delete a Blacklisted Release
[**deleteBlacklistBulk**](BlacklistApi.md#deleteBlacklistBulk) | **DELETE** blacklist/bulk | Delete Blacklisted Releases
[**getBlackList**](BlacklistApi.md#getBlackList) | **GET** blacklist | Get Blacklisted Releases
[**getBlacklistMovie**](BlacklistApi.md#getBlacklistMovie) | **GET** blacklist/movie | Get Blacklisted Releases for a Movie

<a name="deleteBlackList"></a>
# **deleteBlackList**
> Void deleteBlackList(id)

Delete a Blacklisted Release

Removes a specific release (the id provided) from the blacklist

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.BlacklistApi;

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

BlacklistApi apiInstance = new BlacklistApi();
Integer id = 56; // Integer | 
try {
    Void result = apiInstance.deleteBlackList(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#deleteBlackList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBlacklistBulk"></a>
# **deleteBlacklistBulk**
> Void deleteBlacklistBulk(body)

Delete Blacklisted Releases

Delete blacklisted releases in bulk

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
BlacklistBulkBody body = new BlacklistBulkBody(); // BlacklistBulkBody | 
try {
    Void result = apiInstance.deleteBlacklistBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#deleteBlacklistBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlacklistBulkBody**](BlacklistBulkBody.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getBlackList"></a>
# **getBlackList**
> InlineResponse2006 getBlackList(page, pageSize, sortDirection, sortKey)

Get Blacklisted Releases

Returns blacklisted releases

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
Integer page = 56; // Integer | 1
Integer pageSize = 56; // Integer | 20
String sortDirection = "sortDirection_example"; // String | descending
String sortKey = "sortKey_example"; // String | date
try {
    InlineResponse2006 result = apiInstance.getBlackList(page, pageSize, sortDirection, sortKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#getBlackList");
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

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlacklistMovie"></a>
# **getBlacklistMovie**
> List&lt;Blacklist&gt; getBlacklistMovie(movieId)

Get Blacklisted Releases for a Movie

Retrieves blacklisted releases that are tied to a given movie in the database

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.BlacklistApi;

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

BlacklistApi apiInstance = new BlacklistApi();
Integer movieId = 56; // Integer | Database Id for the movie 
try {
    List<Blacklist> result = apiInstance.getBlacklistMovie(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#getBlacklistMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**| Database Id for the movie  |

### Return type

[**List&lt;Blacklist&gt;**](Blacklist.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

