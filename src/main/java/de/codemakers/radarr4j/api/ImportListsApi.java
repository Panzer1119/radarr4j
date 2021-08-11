package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.ImportList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ImportListsApi {
  /**
   * Delete an Import List
   * 
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("importlist/{id}")
  Call<Void> deleteImportlistId(
            @retrofit2.http.Path("id") String id            
  );

  /**
   * Get All Import Lists
   * Query Radarr for all lists
   * @return Call&lt;List&lt;ImportList&gt;&gt;
   */
  @GET("importlist")
  Call<List<ImportList>> getImportList();
    

  /**
   * Get an Import List
   * 
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("importlist/{id}")
  Call<Void> getImportlistId(
            @retrofit2.http.Path("id") String id            
  );

  /**
   * Edit an Import List
   * 
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("importlist/{id}")
  Call<Void> putImportlistId(
            @retrofit2.http.Path("id") String id            
  );

}
