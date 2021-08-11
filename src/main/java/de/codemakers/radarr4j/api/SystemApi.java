package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SystemApi {
  /**
   * Get Application Status
   * Find out information such as OS, version, paths used, etc
   * @return Call&lt;InlineResponse200&gt;
   */
  @GET("system/status")
  Call<InlineResponse200> getStatus();
    

}
