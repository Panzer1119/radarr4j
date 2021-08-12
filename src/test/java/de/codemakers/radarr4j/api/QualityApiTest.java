package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for QualityApi
 */
public class QualityApiTest {

    private QualityApi api;

    @Before
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
