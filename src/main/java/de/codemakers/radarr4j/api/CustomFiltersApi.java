package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse2003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomFiltersApi {
  /**
   * Get UI Custom Filters
   * Query Radarr for custom filters
   * @return Call&lt;List&lt;InlineResponse2003&gt;&gt;
   */
  @GET("customfilter")
  Call<List<InlineResponse2003>> getCustomFilter();
    

}
