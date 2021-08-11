# DownloadClientApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDownloadclientId**](DownloadClientApi.md#deleteDownloadclientId) | **DELETE** downloadclient/{id} | Delete a Download Client
[**getDownloadClient**](DownloadClientApi.md#getDownloadClient) | **GET** downloadclient | Get All Download Clients
[**getDownloadclientId**](DownloadClientApi.md#getDownloadclientId) | **GET** downloadclient/{id} | Get a Download Client
[**putDownloadclientId**](DownloadClientApi.md#putDownloadclientId) | **PUT** downloadclient/{id} | Edit a Download Client

<a name="deleteDownloadclientId"></a>
# **deleteDownloadclientId**
> Void deleteDownloadclientId(id)

Delete a Download Client

Delete a download client by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.DownloadClientApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

DownloadClientApi apiInstance = new DownloadClientApi();
Integer id = 56; // Integer | Database id of the download client
try {
    Void result = apiInstance.deleteDownloadclientId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadClientApi#deleteDownloadclientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of the download client |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDownloadClient"></a>
# **getDownloadClient**
> List&lt;DownloadClient&gt; getDownloadClient()

Get All Download Clients

Get a list of all the download clients added in Radarr

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.DownloadClientApi;

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

DownloadClientApi apiInstance = new DownloadClientApi();
try {
    List<DownloadClient> result = apiInstance.getDownloadClient();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadClientApi#getDownloadClient");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DownloadClient&gt;**](DownloadClient.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDownloadclientId"></a>
# **getDownloadclientId**
> DownloadClient getDownloadclientId(id)

Get a Download Client

Get a single download client by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.DownloadClientApi;

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

DownloadClientApi apiInstance = new DownloadClientApi();
Integer id = 56; // Integer | Database id of the download client
try {
    DownloadClient result = apiInstance.getDownloadclientId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadClientApi#getDownloadclientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of the download client |

### Return type

[**DownloadClient**](DownloadClient.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putDownloadclientId"></a>
# **putDownloadclientId**
> Void putDownloadclientId(id, body)

Edit a Download Client

Edit a downloadclient by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.DownloadClientApi;

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

DownloadClientApi apiInstance = new DownloadClientApi();
Integer id = 56; // Integer | Database id of the download client
DownloadClient body = new DownloadClient(); // DownloadClient | 
try {
    Void result = apiInstance.putDownloadclientId(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadClientApi#putDownloadclientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of the download client |
 **body** | [**DownloadClient**](DownloadClient.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

