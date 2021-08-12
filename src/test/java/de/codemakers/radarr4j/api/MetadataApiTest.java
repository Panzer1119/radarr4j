package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for MetadataApi
 */
public class MetadataApiTest {

    private MetadataApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(MetadataApi.class);
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
