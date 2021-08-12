package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for HistoryApi
 */
public class HistoryApiTest {

    private HistoryApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(HistoryApi.class);
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
