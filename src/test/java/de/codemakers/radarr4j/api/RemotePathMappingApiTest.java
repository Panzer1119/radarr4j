package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.InlineResponse2005;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RemotePathMappingApi
 */
public class RemotePathMappingApiTest {

    private RemotePathMappingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RemotePathMappingApi.class);
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
