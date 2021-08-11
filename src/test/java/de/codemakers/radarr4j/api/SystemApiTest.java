package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.InlineResponse200;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
public class SystemApiTest {

    private SystemApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SystemApi.class);
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
