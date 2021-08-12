package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for CustomFiltersApi
 */
public class CustomFiltersApiTest {

    private CustomFiltersApi api;

    @Before
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
