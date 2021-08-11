# IndexerApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteIndexerId**](IndexerApi.md#deleteIndexerId) | **DELETE** indexer/{id} | Delete an Indexer
[**getIndexer**](IndexerApi.md#getIndexer) | **GET** indexer | Get All Indexers
[**getIndexerId**](IndexerApi.md#getIndexerId) | **GET** indexer/{id} | Get an Indexer
[**putIndexerId**](IndexerApi.md#putIndexerId) | **PUT** indexer/{id} | Edit an Indexer

<a name="deleteIndexerId"></a>
# **deleteIndexerId**
> Void deleteIndexerId(id)

Delete an Indexer

Delete Indexer by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.IndexerApi;

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

IndexerApi apiInstance = new IndexerApi();
Integer id = 56; // Integer | Database Id of the indexer
try {
    Void result = apiInstance.deleteIndexerId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexerApi#deleteIndexerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database Id of the indexer |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getIndexer"></a>
# **getIndexer**
> List&lt;Indexer&gt; getIndexer()

Get All Indexers

Get all indexers

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.IndexerApi;

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

IndexerApi apiInstance = new IndexerApi();
try {
    List<Indexer> result = apiInstance.getIndexer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexerApi#getIndexer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Indexer&gt;**](Indexer.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndexerId"></a>
# **getIndexerId**
> Indexer getIndexerId(id)

Get an Indexer

Get Indexer by its database Id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.IndexerApi;

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

IndexerApi apiInstance = new IndexerApi();
Integer id = 56; // Integer | Database Id of the indexer
try {
    Indexer result = apiInstance.getIndexerId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexerApi#getIndexerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database Id of the indexer |

### Return type

[**Indexer**](Indexer.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putIndexerId"></a>
# **putIndexerId**
> Void putIndexerId(id)

Edit an Indexer

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.IndexerApi;

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

IndexerApi apiInstance = new IndexerApi();
Integer id = 56; // Integer | Database Id of the indexer
try {
    Void result = apiInstance.putIndexerId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexerApi#putIndexerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database Id of the indexer |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

