package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for RootFolderApi
 */
public class RootFolderApiTest {

    private RootFolderApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(RootFolderApi.class);
    }


    /**
     * Gets root folder
     *
     * Query Radarr for root folder information  Settings: Media Management &gt; Root Folders
     */
    @Test
    public void getRootfolderTest() {
        // List<Object> response = api.getRootfolder();

        // TODO: test validations
    }
}
