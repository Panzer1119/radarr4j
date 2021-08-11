# ImportListsApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteImportlistId**](ImportListsApi.md#deleteImportlistId) | **DELETE** importlist/{id} | Delete an Import List
[**getImportList**](ImportListsApi.md#getImportList) | **GET** importlist | Get All Import Lists
[**getImportlistId**](ImportListsApi.md#getImportlistId) | **GET** importlist/{id} | Get an Import List
[**putImportlistId**](ImportListsApi.md#putImportlistId) | **PUT** importlist/{id} | Edit an Import List

<a name="deleteImportlistId"></a>
# **deleteImportlistId**
> Void deleteImportlistId(id)

Delete an Import List

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.ImportListsApi;

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

ImportListsApi apiInstance = new ImportListsApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.deleteImportlistId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportListsApi#deleteImportlistId");
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

<a name="getImportList"></a>
# **getImportList**
> List&lt;ImportList&gt; getImportList()

Get All Import Lists

Query Radarr for all lists

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.ImportListsApi;

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

ImportListsApi apiInstance = new ImportListsApi();
try {
    List<ImportList> result = apiInstance.getImportList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportListsApi#getImportList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ImportList&gt;**](ImportList.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImportlistId"></a>
# **getImportlistId**
> Void getImportlistId(id)

Get an Import List

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.ImportListsApi;

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

ImportListsApi apiInstance = new ImportListsApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.getImportlistId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportListsApi#getImportlistId");
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
 - **Accept**: application/json

<a name="putImportlistId"></a>
# **putImportlistId**
> Void putImportlistId(id)

Edit an Import List

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.ImportListsApi;

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

ImportListsApi apiInstance = new ImportListsApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.putImportlistId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportListsApi#putImportlistId");
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

