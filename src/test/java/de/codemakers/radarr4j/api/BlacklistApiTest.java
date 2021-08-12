package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import de.codemakers.radarr4j.model.BlacklistBulkBody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for BlacklistApi
 */
public class BlacklistApiTest {
    
    private BlacklistApi api;
    
    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(BlacklistApi.class);
    }
    
    
    /**
     * Delete a Blacklisted Release
     * <p>
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
     * <p>
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
     * <p>
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
     * <p>
     * Retrieves blacklisted releases that are tied to a given movie in the database
     */
    @Test
    public void getBlacklistMovieTest() {
        Integer movieId = null;
        // List<Blacklist> response = api.getBlacklistMovie(movieId);
        
        // TODO: test validations
    }
}
