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

public interface CalendarApi {
  /**
   * Get Calendar Events
   * Get a list of movies based on calendar parameters
   * @param unmonitored  (required)
   * @param start ISO 8601 (required)
   * @param end ISO 8601 (required)
   * @return Call&lt;Void&gt;
   */
  @GET("calendar")
  Call<Void> getCalendar(
        @retrofit2.http.Query("unmonitored") Boolean unmonitored                ,     @retrofit2.http.Query("start") String start                ,     @retrofit2.http.Query("end") String end                
  );

}
