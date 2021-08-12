package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RootFolderApi
 */
public class RootFolderApiTest {

    private RootFolderApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(RootFolderApi.class);
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
