package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.Indexer;
import de.codemakers.radarr4j.model.InlineResponse401;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndexerApi
 */
public class IndexerApiTest {

    private IndexerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IndexerApi.class);
    }


    /**
     * Delete an Indexer
     *
     * Delete Indexer by database id
     */
    @Test
    public void deleteIndexerIdTest() {
        Integer id = null;
        // Void response = api.deleteIndexerId(id);

        // TODO: test validations
    }

    /**
     * Get All Indexers
     *
     * Get all indexers
     */
    @Test
    public void getIndexerTest() {
        // List<Indexer> response = api.getIndexer();

        // TODO: test validations
    }

    /**
     * Get an Indexer
     *
     * Get Indexer by its database Id
     */
    @Test
    public void getIndexerIdTest() {
        Integer id = null;
        // Indexer response = api.getIndexerId(id);

        // TODO: test validations
    }

    /**
     * Edit an Indexer
     *
     * 
     */
    @Test
    public void putIndexerIdTest() {
        Integer id = null;
        // Void response = api.putIndexerId(id);

        // TODO: test validations
    }
}
