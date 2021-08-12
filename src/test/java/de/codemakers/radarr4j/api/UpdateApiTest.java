package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for UpdateApi
 */
public class UpdateApiTest {

    private UpdateApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(UpdateApi.class);
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
