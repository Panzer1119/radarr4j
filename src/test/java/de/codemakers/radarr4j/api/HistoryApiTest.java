package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.History;
import de.codemakers.radarr4j.model.InlineResponse2002;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoryApi
 */
public class HistoryApiTest {

    private HistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(HistoryApi.class);
    }


    /**
     * Get History
     *
     * Return a json object list of items in your history
     */
    @Test
    public void getHistoryTest() {
        Integer page = null;
        Integer pageSize = null;
        String sortDirection = null;
        String sortKey = null;
        // InlineResponse2002 response = api.getHistory(page, pageSize, sortDirection, sortKey);

        // TODO: test validations
    }

    /**
     * Get History for a Movie
     *
     * Get history for a given movie in database by its database id
     */
    @Test
    public void getHistoryMovieTest() {
        Integer movieId = null;
        Integer eventType = null;
        // List<History> response = api.getHistoryMovie(movieId, eventType);

        // TODO: test validations
    }
}
