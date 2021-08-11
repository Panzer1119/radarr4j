package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MetadataApi {
  /**
   * Get All Metadata
   * Get all metadata consumer settings
   * @return Call&lt;List&lt;Metadata&gt;&gt;
   */
  @GET("metadata")
  Call<List<Metadata>> getMetadata();
    

}
