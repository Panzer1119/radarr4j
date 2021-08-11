package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.InlineResponse2003;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFiltersApi
 */
public class CustomFiltersApiTest {

    private CustomFiltersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomFiltersApi.class);
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
