package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.Metadata;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataApi
 */
public class MetadataApiTest {

    private MetadataApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MetadataApi.class);
    }


    /**
     * Get All Metadata
     *
     * Get all metadata consumer settings
     */
    @Test
    public void getMetadataTest() {
        // List<Metadata> response = api.getMetadata();

        // TODO: test validations
    }
}
