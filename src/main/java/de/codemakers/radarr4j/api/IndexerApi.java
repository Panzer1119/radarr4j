package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Indexer;
import de.codemakers.radarr4j.model.InlineResponse401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IndexerApi {
  /**
   * Delete an Indexer
   * Delete Indexer by database id
   * @param id Database Id of the indexer (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("indexer/{id}")
  Call<Void> deleteIndexerId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get All Indexers
   * Get all indexers
   * @return Call&lt;List&lt;Indexer&gt;&gt;
   */
  @GET("indexer")
  Call<List<Indexer>> getIndexer();
    

  /**
   * Get an Indexer
   * Get Indexer by its database Id
   * @param id Database Id of the indexer (required)
   * @return Call&lt;Indexer&gt;
   */
  @GET("indexer/{id}")
  Call<Indexer> getIndexerId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Edit an Indexer
   * 
   * @param id Database Id of the indexer (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("indexer/{id}")
  Call<Void> putIndexerId(
            @retrofit2.http.Path("id") Integer id            
  );

}
