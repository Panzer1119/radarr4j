# CommandApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCommand**](CommandApi.md#postCommand) | **POST** command | Post a Command

<a name="postCommand"></a>
# **postCommand**
> Void postCommand()

Post a Command

Pushes commands to Radarr using a key:value pair. The main key is \&quot;name\&quot; and below are acceptable values but it can also accept other key:value pairs (listed under each command):  * ApplicationUpdate - Trigger an update of Radarr * Backup - Trigger a backup routine * CheckHealth - Trigger a system health check * ClearBlacklist - Triggers the removal of all blacklisted movies * CleanUpRecycleBin - Trigger a recycle bin cleanup check * DeleteLogFiles - Triggers the removal of all Info/Debug/Trace log files * DeleteUpdateLogFiles - Triggers the removal of all Update log files * DownloadedMoviesScan - Triggers the scan of downloaded movies * MissingMoviesSearch - Triggers a search of all missing movies * RefreshMonitoredDownloads - Triggers the scan of monitored downloads * RefreshMovie - Trigger a refresh / scan of library     * movieIds:int[] - Specify a list of ids (comma separated) for individual movies to refresh

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.RadarrApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.CommandApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: X-API-Key
HttpBasicAuth X-API-Key = (HttpBasicAuth) defaultClient.getAuthentication("X-API-Key");
X-API-Key.setUsername("YOUR USERNAME");
X-API-Key.setPassword("YOUR PASSWORD");

CommandApi apiInstance = new CommandApi();
try {
    Void result = apiInstance.postCommand();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#postCommand");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

