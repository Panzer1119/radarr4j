package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse2005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RemotePathMappingApi {
  /**
   * Get All Remote Path Mappings
   * Get a list of remote paths being mapped and used by Radarr
   * @return Call&lt;List&lt;InlineResponse2005&gt;&gt;
   */
  @GET("remotePathMapping")
  Call<List<InlineResponse2005>> getRemotePathMapping();
    

}
