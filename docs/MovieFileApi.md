# MovieFileApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMoviefileId**](MovieFileApi.md#deleteMoviefileId) | **DELETE** moviefile/{id} | Delete a Movie
[**getMoviefile**](MovieFileApi.md#getMoviefile) | **GET** moviefile | Get Multiple MovieFiles
[**getMoviefileId**](MovieFileApi.md#getMoviefileId) | **GET** moviefile/{id} | Get a MovieFile

<a name="deleteMoviefileId"></a>
# **deleteMoviefileId**
> Void deleteMoviefileId(id)

Delete a Movie

Allows for deletion of a moviefile by its database id.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieFileApi;

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

MovieFileApi apiInstance = new MovieFileApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.deleteMoviefileId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieFileApi#deleteMoviefileId");
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

<a name="getMoviefile"></a>
# **getMoviefile**
> List&lt;MovieFile&gt; getMoviefile(moviefileids, movieid)

Get Multiple MovieFiles

The moviefile endpoint allows for retrieval of all moviefile by a list of ids or by the associated movieid. Either the moviefileids OR movieid query parameter must be passed.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieFileApi;

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

MovieFileApi apiInstance = new MovieFileApi();
List moviefileids = new List(); // List | Comma separated list of moviefile ids
String movieid = "movieid_example"; // String | Database id of movie to retrieve files for
try {
    List<MovieFile> result = apiInstance.getMoviefile(moviefileids, movieid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieFileApi#getMoviefile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moviefileids** | [**List**](.md)| Comma separated list of moviefile ids |
 **movieid** | **String**| Database id of movie to retrieve files for |

### Return type

[**List&lt;MovieFile&gt;**](MovieFile.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMoviefileId"></a>
# **getMoviefileId**
> MovieFile getMoviefileId(id)

Get a MovieFile

Get a movie file object by its database id.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieFileApi;

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

MovieFileApi apiInstance = new MovieFileApi();
String id = "id_example"; // String | 
try {
    MovieFile result = apiInstance.getMoviefileId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieFileApi#getMoviefileId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**MovieFile**](MovieFile.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

