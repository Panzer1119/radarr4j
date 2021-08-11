package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UpdateApi {
  /**
   * Get Recent Updates
   * Will return a list of recent updates to Radarr  Location: System &gt; Updates
   * @return Call&lt;InlineResponse2001&gt;
   */
  @GET("update")
  Call<InlineResponse2001> getUpdate();
    

}
