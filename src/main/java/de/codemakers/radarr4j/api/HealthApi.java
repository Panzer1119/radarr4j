package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HealthApi {
  /**
   * Get Failed Health Checks
   * Query radarr for health information  Location: System &gt; Status
   * @return Call&lt;List&lt;Object&gt;&gt;
   */
  @GET("health")
  Call<List<Object>> getHealth();
    

}
