package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiskSpaceApi
 */
public class DiskSpaceApiTest {

    private DiskSpaceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DiskSpaceApi.class);
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
