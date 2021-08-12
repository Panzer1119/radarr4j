package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.Movie;
import de.codemakers.radarr4j.model.MovieEditorBody;
import de.codemakers.radarr4j.model.MovieEditorBody1;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MovieApi
 */
public class MovieApiTest {

    private MovieApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(MovieApi.class);
    }


    /**
     * Delete a Movie
     *
     * Delete a single movie by database id
     */
    @Test
    public void deleteMovieTest() {
        Integer id = null;
        Boolean addImportExclusion = null;
        Boolean deleteFiles = null;
        // Void response = api.deleteMovie(id, addImportExclusion, deleteFiles);

        // TODO: test validations
    }

    /**
     * Delete Multiple Movies
     *
     * Editor endpoint is used by the movie editor in Radarr. The Delete operation allows mass deletion of movies (and optionally files).
     */
    @Test
    public void deleteMovieEditorTest() {
        MovieEditorBody1 body = null;
        // Void response = api.deleteMovieEditor(body);

        // TODO: test validations
    }

    /**
     * Get All Movies
     *
     * Returns all movies stored in the database
     */
    @Test
    public void getMovieTest() {
        Integer tmdbId = null;
        // List<Movie> response = api.getMovie(tmdbId);

        // TODO: test validations
    }

    /**
     * Get a Movie
     *
     * Returns a single movie
     */
    @Test
    public void getMovieByIdTest() {
        Integer id = null;
        // Movie response = api.getMovieById(id);

        // TODO: test validations
    }

    /**
     * Lookup a Movie to Add
     *
     * Search for a movie to add to the database (Uses TMDB for search results)
     */
    @Test
    public void getMovieLookupTest() {
        String term = null;
        // List<Movie> response = api.getMovieLookup(term);

        // TODO: test validations
    }

    /**
     * Add new movie
     *
     * Adds a movie to the database
     */
    @Test
    public void moviePostTest() {
        Movie body = null;
        // Integer response = api.moviePost(body);

        // TODO: test validations
    }

    /**
     * Edit existing movie
     *
     * Updates a movie in the database
     */
    @Test
    public void moviePutTest() {
        Movie body = null;
        Boolean moveFiles = null;
        // Movie response = api.moviePut(body, moveFiles);

        // TODO: test validations
    }

    /**
     * Add Movies From Folders
     *
     * The movie import endpoint is used by the bulk import view in Radarr UI. It allows movies to be bulk added to the Radarr database.
     */
    @Test
    public void postMovieImportTest() {
        List<Movie> body = null;
        // List<Movie> response = api.postMovieImport(body);

        // TODO: test validations
    }

    /**
     * Edit Multiple Movies
     *
     * Editor endpoint is used by the movie editor in Radarr. The Edit operation allows to edit properties of multiple movies at once
     */
    @Test
    public void putMovieEditorTest() {
        MovieEditorBody body = null;
        // List<Movie> response = api.putMovieEditor(body);

        // TODO: test validations
    }
}
