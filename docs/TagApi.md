# TagApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**putTagId**](TagApi.md#putTagId) | **PUT** tag/{id} | Edit a Tag
[**tagDetailGet**](TagApi.md#tagDetailGet) | **GET** tag/detail | Get All Tag Details
[**tagDetailIdGet**](TagApi.md#tagDetailIdGet) | **GET** tag/detail/{id} | Get a Tag Details
[**tagGet**](TagApi.md#tagGet) | **GET** tag | Get All Tags
[**tagIdDelete**](TagApi.md#tagIdDelete) | **DELETE** tag/{id} | Delete a Tag
[**tagIdGet**](TagApi.md#tagIdGet) | **GET** tag/{id} | Get a Tag
[**tagPost**](TagApi.md#tagPost) | **POST** tag | Create a Tag

<a name="putTagId"></a>
# **putTagId**
> Void putTagId(id, body)

Edit a Tag

Edit a Tag by its database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

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

TagApi apiInstance = new TagApi();
Integer id = 56; // Integer | ID of tag
Tag body = new Tag(); // Tag | 
try {
    Void result = apiInstance.putTagId(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#putTagId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of tag |
 **body** | [**Tag**](Tag.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tagDetailGet"></a>
# **tagDetailGet**
> List&lt;TagDetail&gt; tagDetailGet()

Get All Tag Details

Returns a list of tag detail objects for all tags in the database.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

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

TagApi apiInstance = new TagApi();
try {
    List<TagDetail> result = apiInstance.tagDetailGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagDetailGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TagDetail&gt;**](TagDetail.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tagDetailIdGet"></a>
# **tagDetailIdGet**
> TagDetail tagDetailIdGet(id)

Get a Tag Details

Returns the id of all items in the database which use the specified tag

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

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

TagApi apiInstance = new TagApi();
Integer id = 56; // Integer | Database id of tag
try {
    TagDetail result = apiInstance.tagDetailIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagDetailIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of tag |

### Return type

[**TagDetail**](TagDetail.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tagGet"></a>
# **tagGet**
> List&lt;Tag&gt; tagGet()

Get All Tags

Get all tags in the database

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

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

TagApi apiInstance = new TagApi();
try {
    List<Tag> result = apiInstance.tagGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tagIdDelete"></a>
# **tagIdDelete**
> Void tagIdDelete(id)

Delete a Tag

Delete a tag

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
Integer id = 56; // Integer | ID of tag
try {
    Void result = apiInstance.tagIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of tag |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="tagIdGet"></a>
# **tagIdGet**
> Tag tagIdGet(id)

Get a Tag

Return a given tag and its label by the database id.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

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

TagApi apiInstance = new TagApi();
Integer id = 56; // Integer | ID of tag
try {
    Tag result = apiInstance.tagIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of tag |

### Return type

[**Tag**](Tag.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tagPost"></a>
# **tagPost**
> Void tagPost(body)

Create a Tag

Create a new tag that can be assigned to a movie, list, delay profile, notification, or restriction

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
Tag body = new Tag(); // Tag | Tag object that needs to be added
try {
    Void result = apiInstance.tagPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tag**](Tag.md)| Tag object that needs to be added |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

