# MovieApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMovie**](MovieApi.md#deleteMovie) | **DELETE** movie/{id} | Delete a Movie
[**deleteMovieEditor**](MovieApi.md#deleteMovieEditor) | **DELETE** movie/editor | Delete Multiple Movies
[**getMovie**](MovieApi.md#getMovie) | **GET** movie | Get All Movies
[**getMovieById**](MovieApi.md#getMovieById) | **GET** movie/{id} | Get a Movie
[**getMovieLookup**](MovieApi.md#getMovieLookup) | **GET** movie/lookup | Lookup a Movie to Add
[**moviePost**](MovieApi.md#moviePost) | **POST** movie | Add new movie
[**moviePut**](MovieApi.md#moviePut) | **PUT** movie | Edit existing movie
[**postMovieImport**](MovieApi.md#postMovieImport) | **POST** movie/import | Add Movies From Folders
[**putMovieEditor**](MovieApi.md#putMovieEditor) | **PUT** movie/editor | Edit Multiple Movies

<a name="deleteMovie"></a>
# **deleteMovie**
> Void deleteMovie(id, addImportExclusion, deleteFiles)

Delete a Movie

Delete a single movie by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

MovieApi apiInstance = new MovieApi();
Integer id = 56; // Integer | Database Id of movie to delete
Boolean addImportExclusion = true; // Boolean | Add deleted movies to List Exclusions
Boolean deleteFiles = true; // Boolean | Delete movie files when deleting movies
try {
    Void result = apiInstance.deleteMovie(id, addImportExclusion, deleteFiles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#deleteMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database Id of movie to delete |
 **addImportExclusion** | **Boolean**| Add deleted movies to List Exclusions | [optional]
 **deleteFiles** | **Boolean**| Delete movie files when deleting movies | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMovieEditor"></a>
# **deleteMovieEditor**
> Void deleteMovieEditor(body)

Delete Multiple Movies

Editor endpoint is used by the movie editor in Radarr. The Delete operation allows mass deletion of movies (and optionally files).

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
MovieEditorBody1 body = new MovieEditorBody1(); // MovieEditorBody1 | 
try {
    Void result = apiInstance.deleteMovieEditor(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#deleteMovieEditor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MovieEditorBody1**](MovieEditorBody1.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getMovie"></a>
# **getMovie**
> List&lt;Movie&gt; getMovie(tmdbId)

Get All Movies

Returns all movies stored in the database

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
Integer tmdbId = 56; // Integer | TMDb id of the movie to get
try {
    List<Movie> result = apiInstance.getMovie(tmdbId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#getMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tmdbId** | **Integer**| TMDb id of the movie to get | [optional]

### Return type

[**List&lt;Movie&gt;**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMovieById"></a>
# **getMovieById**
> Movie getMovieById(id)

Get a Movie

Returns a single movie

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
Integer id = 56; // Integer | Database Id of movie to return
try {
    Movie result = apiInstance.getMovieById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#getMovieById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database Id of movie to return |

### Return type

[**Movie**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMovieLookup"></a>
# **getMovieLookup**
> List&lt;Movie&gt; getMovieLookup(term)

Lookup a Movie to Add

Search for a movie to add to the database (Uses TMDB for search results)

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
String term = "term_example"; // String | search term to use for lookup
try {
    List<Movie> result = apiInstance.getMovieLookup(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#getMovieLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| search term to use for lookup |

### Return type

[**List&lt;Movie&gt;**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moviePost"></a>
# **moviePost**
> Integer moviePost(body)

Add new movie

Adds a movie to the database

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

MovieApi apiInstance = new MovieApi();
Movie body = new Movie(); // Movie | Movie object that needs to be added
try {
    Integer result = apiInstance.moviePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#moviePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Movie**](Movie.md)| Movie object that needs to be added |

### Return type

**Integer**

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moviePut"></a>
# **moviePut**
> Movie moviePut(body, moveFiles)

Edit existing movie

Updates a movie in the database

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

MovieApi apiInstance = new MovieApi();
Movie body = new Movie(); // Movie | Movie object that needs to be edited
Boolean moveFiles = true; // Boolean | Have radarr move files when updating
try {
    Movie result = apiInstance.moviePut(body, moveFiles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#moviePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Movie**](Movie.md)| Movie object that needs to be edited |
 **moveFiles** | **Boolean**| Have radarr move files when updating | [optional]

### Return type

[**Movie**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMovieImport"></a>
# **postMovieImport**
> List&lt;Movie&gt; postMovieImport(body)

Add Movies From Folders

The movie import endpoint is used by the bulk import view in Radarr UI. It allows movies to be bulk added to the Radarr database.

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
List<Movie> body = Arrays.asList(new Movie()); // List<Movie> | 
try {
    List<Movie> result = apiInstance.postMovieImport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#postMovieImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Movie&gt;**](Movie.md)|  | [optional]

### Return type

[**List&lt;Movie&gt;**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMovieEditor"></a>
# **putMovieEditor**
> List&lt;Movie&gt; putMovieEditor(body)

Edit Multiple Movies

Editor endpoint is used by the movie editor in Radarr. The Edit operation allows to edit properties of multiple movies at once

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.MovieApi;

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

MovieApi apiInstance = new MovieApi();
MovieEditorBody body = new MovieEditorBody(); // MovieEditorBody | 
try {
    List<Movie> result = apiInstance.putMovieEditor(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#putMovieEditor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MovieEditorBody**](MovieEditorBody.md)|  | [optional]

### Return type

[**List&lt;Movie&gt;**](Movie.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

