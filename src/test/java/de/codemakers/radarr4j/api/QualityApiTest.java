package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.QualityProfile;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QualityApi
 */
public class QualityApiTest {

    private QualityApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QualityApi.class);
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
