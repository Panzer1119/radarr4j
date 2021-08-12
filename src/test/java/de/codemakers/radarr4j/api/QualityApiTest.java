package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for QualityApi
 */
public class QualityApiTest {

    private QualityApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(QualityApi.class);
    }


    /**
     * Get All Quality Profiles
     *
     * Query Radarr for quality profiles 
     */
    @Test
    public void getAddDiscoverTest() {
        // List<QualityProfile> response = api.getAddDiscover();

        // TODO: test validations
    }
}
