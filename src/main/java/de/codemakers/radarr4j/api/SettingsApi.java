package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.ConfigHostBody;
import de.codemakers.radarr4j.model.ConfigNamingBody;
import de.codemakers.radarr4j.model.ConfigUiBody;
import de.codemakers.radarr4j.model.InlineResponse2004;
import de.codemakers.radarr4j.model.InlineResponse2007;
import de.codemakers.radarr4j.model.InlineResponse2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SettingsApi {
  /**
   * Get Host Settings
   * Get General/Host settings for Radarr.
   * @return Call&lt;InlineResponse2007&gt;
   */
  @GET("config/host")
  Call<InlineResponse2007> getConfigHost();
    

  /**
   * Get Naming Settings
   * Get Settings for movie file and folder naming.
   * @return Call&lt;InlineResponse2008&gt;
   */
  @GET("config/naming")
  Call<InlineResponse2008> getConfigNaming();
    

  /**
   * Get UI Settings
   * Query Radarr for UI settings
   * @return Call&lt;InlineResponse2004&gt;
   */
  @GET("config/ui")
  Call<InlineResponse2004> getUi();
    

  /**
   * Edit Host Settings
   * Edit General/Host settings for Radarr.
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("config/host")
  Call<Void> putConfigHost(
                    @retrofit2.http.Body ConfigHostBody body    
  );

  /**
   * Edit Naming Settings
   * Edit Settings for movie file and folder naming.
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("config/naming")
  Call<Void> putConfigNaming(
                    @retrofit2.http.Body ConfigNamingBody body    
  );

  /**
   * Edit UI Settings
   * Edit one or many UI settings and save to to the database
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("config/ui")
  Call<Void> putconfigUi(
                    @retrofit2.http.Body ConfigUiBody body    
  );

}
