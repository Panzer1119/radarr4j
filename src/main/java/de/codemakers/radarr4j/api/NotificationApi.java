package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotificationApi {
  /**
   * Delete a Notification
   * Delete Notification by database id
   * @param id Database id of notification (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("notification/{id}")
  Call<Void> deleteNotificationId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get a Notification
   * Get Notification by database id
   * @param id Database id of notification (required)
   * @return Call&lt;Notification&gt;
   */
  @GET("notification/{id}")
  Call<Notification> getNotificationId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get All Notifications
   * Get all notifications
   * @return Call&lt;List&lt;Notification&gt;&gt;
   */
  @GET("notification")
  Call<List<Notification>> getNotifications();
    

  /**
   * Edit a Notification
   * Edit Notification by database id
   * @param id Database id of notification (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("notification/{id}")
  Call<Void> putNotificationId(
            @retrofit2.http.Path("id") Integer id            ,                 @retrofit2.http.Body Notification body    
  );

}
