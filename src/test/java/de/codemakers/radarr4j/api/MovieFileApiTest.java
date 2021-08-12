package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.MovieFile;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MovieFileApi
 */
public class MovieFileApiTest {

    private MovieFileApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(MovieFileApi.class);
    }


    /**
     * Delete a Movie
     *
     * Allows for deletion of a moviefile by its database id.
     */
    @Test
    public void deleteMoviefileIdTest() {
        String id = null;
        // Void response = api.deleteMoviefileId(id);

        // TODO: test validations
    }

    /**
     * Get Multiple MovieFiles
     *
     * The moviefile endpoint allows for retrieval of all moviefile by a list of ids or by the associated movieid. Either the moviefileids OR movieid query parameter must be passed.
     */
    @Test
    public void getMoviefileTest() {
        List moviefileids = null;
        String movieid = null;
        // List<MovieFile> response = api.getMoviefile(moviefileids, movieid);

        // TODO: test validations
    }

    /**
     * Get a MovieFile
     *
     * Get a movie file object by its database id.
     */
    @Test
    public void getMoviefileIdTest() {
        String id = null;
        // MovieFile response = api.getMoviefileId(id);

        // TODO: test validations
    }
}
