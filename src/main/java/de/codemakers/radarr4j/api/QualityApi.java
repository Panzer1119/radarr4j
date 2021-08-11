package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.QualityProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QualityApi {
  /**
   * Get All Quality Profiles
   * Query Radarr for quality profiles 
   * @return Call&lt;List&lt;QualityProfile&gt;&gt;
   */
  @GET("qualityProfile")
  Call<List<QualityProfile>> getAddDiscover();
    

}
