package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.Blacklist;
import de.codemakers.radarr4j.model.BlacklistBulkBody;
import de.codemakers.radarr4j.model.InlineResponse2006;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlacklistApi
 */
public class BlacklistApiTest {

    private BlacklistApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BlacklistApi.class);
    }


    /**
     * Delete a Blacklisted Release
     *
     * Removes a specific release (the id provided) from the blacklist
     */
    @Test
    public void deleteBlackListTest() {
        Integer id = null;
        // Void response = api.deleteBlackList(id);

        // TODO: test validations
    }

    /**
     * Delete Blacklisted Releases
     *
     * Delete blacklisted releases in bulk
     */
    @Test
    public void deleteBlacklistBulkTest() {
        BlacklistBulkBody body = null;
        // Void response = api.deleteBlacklistBulk(body);

        // TODO: test validations
    }

    /**
     * Get Blacklisted Releases
     *
     * Returns blacklisted releases
     */
    @Test
    public void getBlackListTest() {
        Integer page = null;
        Integer pageSize = null;
        String sortDirection = null;
        String sortKey = null;
        // InlineResponse2006 response = api.getBlackList(page, pageSize, sortDirection, sortKey);

        // TODO: test validations
    }

    /**
     * Get Blacklisted Releases for a Movie
     *
     * Retrieves blacklisted releases that are tied to a given movie in the database
     */
    @Test
    public void getBlacklistMovieTest() {
        Integer movieId = null;
        // List<Blacklist> response = api.getBlacklistMovie(movieId);

        // TODO: test validations
    }
}
