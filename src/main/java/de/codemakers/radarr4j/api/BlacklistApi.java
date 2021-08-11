package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Blacklist;
import de.codemakers.radarr4j.model.BlacklistBulkBody;
import de.codemakers.radarr4j.model.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlacklistApi {
  /**
   * Delete a Blacklisted Release
   * Removes a specific release (the id provided) from the blacklist
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("blacklist")
  Call<Void> deleteBlackList(
        @retrofit2.http.Query("id") Integer id                
  );

  /**
   * Delete Blacklisted Releases
   * Delete blacklisted releases in bulk
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("blacklist/bulk")
  Call<Void> deleteBlacklistBulk(
                    @retrofit2.http.Body BlacklistBulkBody body    
  );

  /**
   * Get Blacklisted Releases
   * Returns blacklisted releases
   * @param page 1 (required)
   * @param pageSize 20 (required)
   * @param sortDirection descending (required)
   * @param sortKey date (required)
   * @return Call&lt;InlineResponse2006&gt;
   */
  @GET("blacklist")
  Call<InlineResponse2006> getBlackList(
        @retrofit2.http.Query("page") Integer page                ,     @retrofit2.http.Query("pageSize") Integer pageSize                ,     @retrofit2.http.Query("sortDirection") String sortDirection                ,     @retrofit2.http.Query("sortKey") String sortKey                
  );

  /**
   * Get Blacklisted Releases for a Movie
   * Retrieves blacklisted releases that are tied to a given movie in the database
   * @param movieId Database Id for the movie  (required)
   * @return Call&lt;List&lt;Blacklist&gt;&gt;
   */
  @GET("blacklist/movie")
  Call<List<Blacklist>> getBlacklistMovie(
        @retrofit2.http.Query("movieId") Integer movieId                
  );

}
