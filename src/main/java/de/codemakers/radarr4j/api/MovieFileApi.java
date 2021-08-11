package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.MovieFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MovieFileApi {
  /**
   * Delete a Movie
   * Allows for deletion of a moviefile by its database id.
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("moviefile/{id}")
  Call<Void> deleteMoviefileId(
            @retrofit2.http.Path("id") String id            
  );

  /**
   * Get Multiple MovieFiles
   * The moviefile endpoint allows for retrieval of all moviefile by a list of ids or by the associated movieid. Either the moviefileids OR movieid query parameter must be passed.
   * @param moviefileids Comma separated list of moviefile ids (required)
   * @param movieid Database id of movie to retrieve files for (required)
   * @return Call&lt;List&lt;MovieFile&gt;&gt;
   */
  @GET("moviefile")
  Call<List<MovieFile>> getMoviefile(
        @retrofit2.http.Query("moviefileids") List moviefileids                ,     @retrofit2.http.Query("movieid") String movieid                
  );

  /**
   * Get a MovieFile
   * Get a movie file object by its database id.
   * @param id  (required)
   * @return Call&lt;MovieFile&gt;
   */
  @GET("moviefile/{id}")
  Call<MovieFile> getMoviefileId(
            @retrofit2.http.Path("id") String id            
  );

}
