package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for SystemApi
 */
public class SystemApiTest {

    private SystemApi api;

    @Before
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(SystemApi.class);
    }


    /**
     * Get Application Status
     *
     * Find out information such as OS, version, paths used, etc
     */
    @Test
    public void getStatusTest() {
        // InlineResponse200 response = api.getStatus();

        // TODO: test validations
    }
}
