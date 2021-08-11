package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.DownloadClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DownloadClientApi {
  /**
   * Delete a Download Client
   * Delete a download client by database id
   * @param id Database id of the download client (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("downloadclient/{id}")
  Call<Void> deleteDownloadclientId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Get All Download Clients
   * Get a list of all the download clients added in Radarr
   * @return Call&lt;List&lt;DownloadClient&gt;&gt;
   */
  @GET("downloadclient")
  Call<List<DownloadClient>> getDownloadClient();
    

  /**
   * Get a Download Client
   * Get a single download client by database id
   * @param id Database id of the download client (required)
   * @return Call&lt;DownloadClient&gt;
   */
  @GET("downloadclient/{id}")
  Call<DownloadClient> getDownloadclientId(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Edit a Download Client
   * Edit a downloadclient by database id
   * @param id Database id of the download client (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("downloadclient/{id}")
  Call<Void> putDownloadclientId(
            @retrofit2.http.Path("id") Integer id            ,                 @retrofit2.http.Body DownloadClient body    
  );

}
