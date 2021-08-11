# NotificationApi

All URIs are relative to *{protocol}://{hostPath}/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteNotificationId**](NotificationApi.md#deleteNotificationId) | **DELETE** notification/{id} | Delete a Notification
[**getNotificationId**](NotificationApi.md#getNotificationId) | **GET** notification/{id} | Get a Notification
[**getNotifications**](NotificationApi.md#getNotifications) | **GET** notification | Get All Notifications
[**putNotificationId**](NotificationApi.md#putNotificationId) | **PUT** notification/{id} | Edit a Notification

<a name="deleteNotificationId"></a>
# **deleteNotificationId**
> Void deleteNotificationId(id)

Delete a Notification

Delete Notification by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.NotificationApi;

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

NotificationApi apiInstance = new NotificationApi();
Integer id = 56; // Integer | Database id of notification
try {
    Void result = apiInstance.deleteNotificationId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#deleteNotificationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of notification |

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getNotificationId"></a>
# **getNotificationId**
> Notification getNotificationId(id)

Get a Notification

Get Notification by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.NotificationApi;

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

NotificationApi apiInstance = new NotificationApi();
Integer id = 56; // Integer | Database id of notification
try {
    Notification result = apiInstance.getNotificationId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> List&lt;Notification&gt; getNotifications()

Get All Notifications

Get all notifications

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.NotificationApi;

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

NotificationApi apiInstance = new NotificationApi();
try {
    List<Notification> result = apiInstance.getNotifications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putNotificationId"></a>
# **putNotificationId**
> Void putNotificationId(id, body)

Edit a Notification

Edit Notification by database id

### Example
```java
// Import classes:
//import de.codemakers.radarr4j.invoker.ApiClient;
//import de.codemakers.radarr4j.invoker.ApiException;
//import de.codemakers.radarr4j.invoker.Configuration;
//import de.codemakers.radarr4j.invoker.auth.*;
//import de.codemakers.radarr4j.api.NotificationApi;

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

NotificationApi apiInstance = new NotificationApi();
Integer id = 56; // Integer | Database id of notification
Notification body = new Notification(); // Notification | 
try {
    Void result = apiInstance.putNotificationId(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#putNotificationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Database id of notification |
 **body** | [**Notification**](Notification.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[X-API-Key](../README.md#X-API-Key)[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

