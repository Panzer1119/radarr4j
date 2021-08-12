package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HealthApi
 */
public class HealthApiTest {

    private HealthApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(HealthApi.class);
    }


    /**
     * Get Failed Health Checks
     *
     * Query radarr for health information  Location: System &gt; Status
     */
    @Test
    public void getHealthTest() {
        // List<Object> response = api.getHealth();

        // TODO: test validations
    }
}
