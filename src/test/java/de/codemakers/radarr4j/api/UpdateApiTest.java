package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.InlineResponse2001;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpdateApi
 */
public class UpdateApiTest {

    private UpdateApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UpdateApi.class);
    }


    /**
     * Get Recent Updates
     *
     * Will return a list of recent updates to Radarr  Location: System &gt; Updates
     */
    @Test
    public void getUpdateTest() {
        // InlineResponse2001 response = api.getUpdate();

        // TODO: test validations
    }
}
