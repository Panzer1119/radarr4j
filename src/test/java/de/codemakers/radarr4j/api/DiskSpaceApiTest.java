package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for DiskSpaceApi
 */
public class DiskSpaceApiTest {

    private DiskSpaceApi api;

    @Before
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(DiskSpaceApi.class);
    }


    /**
     * Get System Diskspace Information
     *
     * Query Radarr for disk usage information  Location: System &gt; Status
     */
    @Test
    public void getDiskspaceTest() {
        // List<Object> response = api.getDiskspace();

        // TODO: test validations
    }
}
