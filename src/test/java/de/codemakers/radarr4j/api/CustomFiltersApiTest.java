package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for CustomFiltersApi
 */
public class CustomFiltersApiTest {

    private CustomFiltersApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(CustomFiltersApi.class);
    }


    /**
     * Get UI Custom Filters
     *
     * Query Radarr for custom filters
     */
    @Test
    public void getCustomFilterTest() {
        // List<InlineResponse2003> response = api.getCustomFilter();

        // TODO: test validations
    }
}
