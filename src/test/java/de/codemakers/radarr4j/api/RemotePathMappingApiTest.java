package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for RemotePathMappingApi
 */
public class RemotePathMappingApiTest {

    private RemotePathMappingApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(RemotePathMappingApi.class);
    }


    /**
     * Get All Remote Path Mappings
     *
     * Get a list of remote paths being mapped and used by Radarr
     */
    @Test
    public void getRemotePathMappingTest() {
        // List<InlineResponse2005> response = api.getRemotePathMapping();

        // TODO: test validations
    }
}
