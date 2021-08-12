package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.model.ReleasePush;
import de.codemakers.radarr4j.model.ReleasePushResponse;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ReleaseApi {
    
    /**
     * If the title is wanted, Radarr will grab it.
     *
     * @param body Release to push
     *
     * @return Call&lt;ReleasePushResponse&gt;
     */
    @Headers( {"Content-Type:application/json"})
    @POST("release/push")
    Call<ReleasePushResponse> pushRelease(@retrofit2.http.Body ReleasePush body);
    
}
