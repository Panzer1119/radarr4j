package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse20010;
import de.codemakers.radarr4j.model.InlineResponse2009;
import de.codemakers.radarr4j.model.QueueBulkBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QueueApi {
  /**
   * Remove Items from Queue
   * Remove multiple items from queue by their ids
   * @param body  (optional)
   * @param removeFromClient  (optional)
   * @param blacklist  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("queue/bulk")
  Call<Void> deleteQueueBulk(
                    @retrofit2.http.Body QueueBulkBody body    ,     @retrofit2.http.Query("removeFromClient") Boolean removeFromClient                ,     @retrofit2.http.Query("blacklist") Boolean blacklist                
  );

  /**
   * Remove Item from Queue
   * Remove an item from the queue and optionally blacklist it
   * @param id  (required)
   * @param removeFromClient  (optional)
   * @param blacklist  (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("queue/{id}")
  Call<Void> deleteQueueId(
            @retrofit2.http.Path("id") String id            ,     @retrofit2.http.Query("removeFromClient") Boolean removeFromClient                ,     @retrofit2.http.Query("blacklist") Boolean blacklist                
  );

  /**
   * Get Activity Queue
   * Return a json object list of items in the queue
   * @param page 1 (required)
   * @param pageSize 20 (required)
   * @param sortDirection ascending (required)
   * @param sortKey timeLeft (required)
   * @param includeUnknownMovieItems true (required)
   * @return Call&lt;Void&gt;
   */
  @GET("queue")
  Call<Void> getQueue(
        @retrofit2.http.Query("page") Integer page                ,     @retrofit2.http.Query("pageSize") Integer pageSize                ,     @retrofit2.http.Query("sortDirection") String sortDirection                ,     @retrofit2.http.Query("sortKey") String sortKey                ,     @retrofit2.http.Query("includeUnknownMovieItems") Boolean includeUnknownMovieItems                
  );

  /**
   * Get Queue Item Details
   * Get details of all items in queue
   * @param includeMovie Include Movie object if linked (optional)
   * @return Call&lt;List&lt;InlineResponse2009&gt;&gt;
   */
  @GET("queue/details")
  Call<List<InlineResponse2009>> getQueueDetails(
        @retrofit2.http.Query("includeMovie") Boolean includeMovie                
  );

  /**
   * Get Queue Status
   * Stats on items in queue
   * @return Call&lt;InlineResponse20010&gt;
   */
  @GET("queue/status")
  Call<InlineResponse20010> getQueueStatus();
    

  /**
   * 
   * Perform a Radarr \&quot;force grab\&quot; on a pending queue item by its ID.
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("queue/grab/{id}")
  Call<Void> postQueueGrabId(
            @retrofit2.http.Path("id") String id            
  );

}
