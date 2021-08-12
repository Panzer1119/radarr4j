package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.ImportList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportListsApi
 */
public class ImportListsApiTest {

    private ImportListsApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(ImportListsApi.class);
    }


    /**
     * Delete an Import List
     *
     * 
     */
    @Test
    public void deleteImportlistIdTest() {
        String id = null;
        // Void response = api.deleteImportlistId(id);

        // TODO: test validations
    }

    /**
     * Get All Import Lists
     *
     * Query Radarr for all lists
     */
    @Test
    public void getImportListTest() {
        // List<ImportList> response = api.getImportList();

        // TODO: test validations
    }

    /**
     * Get an Import List
     *
     * 
     */
    @Test
    public void getImportlistIdTest() {
        String id = null;
        // Void response = api.getImportlistId(id);

        // TODO: test validations
    }

    /**
     * Edit an Import List
     *
     * 
     */
    @Test
    public void putImportlistIdTest() {
        String id = null;
        // Void response = api.putImportlistId(id);

        // TODO: test validations
    }
}
