package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.Movie;
import de.codemakers.radarr4j.model.MovieEditorBody;
import de.codemakers.radarr4j.model.MovieEditorBody1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MovieApi {
  /**
   * Delete a Movie
   * Delete a single movie by database id
   * @param id Database Id of movie to delete (required)
   * @param addImportExclusion Add deleted movies to List Exclusions (optional)
   * @param deleteFiles Delete movie files when deleting movies (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("movie/{id}")
  Call<Void> deleteMovie(
            @retrofit2.http.Path("id") Integer id            ,     @retrofit2.http.Query("addImportExclusion") Boolean addImportExclusion                ,     @retrofit2.http.Query("deleteFiles") Boolean deleteFiles                
  );

  /**
   * Delete Multiple Movies
   * Editor endpoint is used by the movie editor in Radarr. The Delete operation allows mass deletion of movies (and optionally files).
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("movie/editor")
  Call<Void> deleteMovieEditor(
                    @retrofit2.http.Body MovieEditorBody1 body    
  );

  /**
   * Get All Movies
   * Returns all movies stored in the database
   * @param tmdbId TMDb id of the movie to get (optional)
   * @return Call&lt;List&lt;Movie&gt;&gt;
   */
  @GET("movie")
  Call<List<Movie>> getMovie(
        @retrofit2.http.Query("tmdbId") Integer tmdbId                
  );

  /**
   * Get a Movie
   * Returns a single movie
   * @param id Database Id of movie to return (required)
   * @return Call&lt;Movie&gt;
   */
  @GET("movie/{id}")
  Call<Movie> getMovieById(
            @retrofit2.http.Path("id") Integer id            
  );

  /**
   * Lookup a Movie to Add
   * Search for a movie to add to the database (Uses TMDB for search results)
   * @param term search term to use for lookup (required)
   * @return Call&lt;List&lt;Movie&gt;&gt;
   */
  @GET("movie/lookup")
  Call<List<Movie>> getMovieLookup(
        @retrofit2.http.Query("term") String term                
  );

  /**
   * Add new movie
   * Adds a movie to the database
   * @param body Movie object that needs to be added (required)
   * @return Call&lt;Integer&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("movie")
  Call<Integer> moviePost(
                    @retrofit2.http.Body Movie body    
  );

  /**
   * Edit existing movie
   * Updates a movie in the database
   * @param body Movie object that needs to be edited (required)
   * @param moveFiles Have radarr move files when updating (optional)
   * @return Call&lt;Movie&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("movie")
  Call<Movie> moviePut(
                    @retrofit2.http.Body Movie body    ,     @retrofit2.http.Query("moveFiles") Boolean moveFiles                
  );

  /**
   * Add Movies From Folders
   * The movie import endpoint is used by the bulk import view in Radarr UI. It allows movies to be bulk added to the Radarr database.
   * @param body  (optional)
   * @return Call&lt;List&lt;Movie&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("movie/import")
  Call<List<Movie>> postMovieImport(
                    @retrofit2.http.Body List<Movie> body    
  );

  /**
   * Edit Multiple Movies
   * Editor endpoint is used by the movie editor in Radarr. The Edit operation allows to edit properties of multiple movies at once
   * @param body  (optional)
   * @return Call&lt;List&lt;Movie&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("movie/editor")
  Call<List<Movie>> putMovieEditor(
                    @retrofit2.http.Body MovieEditorBody body    
  );

}
