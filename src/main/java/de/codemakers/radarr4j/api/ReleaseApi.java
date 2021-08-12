package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.model.ReleasePushResponse;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ReleaseApi {
    
    /**
     * If the title is wanted, Radarr will grab it.
     *
     * @param title Title (required)
     * @param downloadUrl Download Url (required)
     * @param protocol Protocol (Usenet or Torrent) (required)
     * @param publishDate Publish Date ISO8601 Date (required)
     *
     * @return Call&lt;ReleasePushResponse&gt;
     */
    @Headers( {"Content-Type:application/json"})
    @POST("tag")
    Call<ReleasePushResponse> pushRelease(@retrofit2.http.Query("title") String title, @retrofit2.http.Query("downloadUrl") String downloadUrl, @retrofit2.http.Query("protocol") String protocol, @retrofit2.http.Query("publishDate") String publishDate);
    
}
