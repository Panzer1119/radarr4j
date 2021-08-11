package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.History;
import de.codemakers.radarr4j.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HistoryApi {
  /**
   * Get History
   * Return a json object list of items in your history
   * @param page 1 (required)
   * @param pageSize 20 (required)
   * @param sortDirection descending (required)
   * @param sortKey date (required)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @GET("history")
  Call<InlineResponse2002> getHistory(
        @retrofit2.http.Query("page") Integer page                ,     @retrofit2.http.Query("pageSize") Integer pageSize                ,     @retrofit2.http.Query("sortDirection") String sortDirection                ,     @retrofit2.http.Query("sortKey") String sortKey                
  );

  /**
   * Get History for a Movie
   * Get history for a given movie in database by its database id
   * @param movieId database id of movie (required)
   * @param eventType history event type to retrieve (optional)
   * @return Call&lt;List&lt;History&gt;&gt;
   */
  @GET("history/movie")
  Call<List<History>> getHistoryMovie(
        @retrofit2.http.Query("movieId") Integer movieId                ,     @retrofit2.http.Query("eventType") Integer eventType                
  );

}
