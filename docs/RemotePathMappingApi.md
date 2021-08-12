# RemotePathMappingApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRemotePathMapping**](RemotePathMappingApi.md#getRemotePathMapping) | **GET** remotePathMapping | Get All Remote Path Mappings

<a name="getRemotePathMapping"></a>
# **getRemotePathMapping**
> List&lt;InlineResponse2005&gt; getRemotePathMapping()

Get All Remote Path Mappings

Get a list of remote paths being mapped and used by Radarr

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.RemotePathMappingApi;

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

RemotePathMappingApi apiInstance = new RemotePathMappingApi();
try {
    List<InlineResponse2005> result = apiInstance.getRemotePathMapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemotePathMappingApi#getRemotePathMapping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse2005&gt;**](InlineResponse2005.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

