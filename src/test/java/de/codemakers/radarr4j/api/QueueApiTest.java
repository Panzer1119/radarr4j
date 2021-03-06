package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import de.codemakers.radarr4j.model.QueueBulkBody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for QueueApi
 */
public class QueueApiTest {

    private QueueApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(QueueApi.class);
    }


    /**
     * Remove Items from Queue
     *
     * Remove multiple items from queue by their ids
     */
    @Test
    public void deleteQueueBulkTest() {
        QueueBulkBody body = null;
        Boolean removeFromClient = null;
        Boolean blacklist = null;
        // Void response = api.deleteQueueBulk(body, removeFromClient, blacklist);

        // TODO: test validations
    }

    /**
     * Remove Item from Queue
     *
     * Remove an item from the queue and optionally blacklist it
     */
    @Test
    public void deleteQueueIdTest() {
        String id = null;
        Boolean removeFromClient = null;
        Boolean blacklist = null;
        // Void response = api.deleteQueueId(id, removeFromClient, blacklist);

        // TODO: test validations
    }

    /**
     * Get Activity Queue
     *
     * Return a json object list of items in the queue
     */
    @Test
    public void getQueueTest() {
        Integer page = null;
        Integer pageSize = null;
        String sortDirection = null;
        String sortKey = null;
        Boolean includeUnknownMovieItems = null;
        // Void response = api.getQueue(page, pageSize, sortDirection, sortKey, includeUnknownMovieItems);

        // TODO: test validations
    }

    /**
     * Get Queue Item Details
     *
     * Get details of all items in queue
     */
    @Test
    public void getQueueDetailsTest() {
        Boolean includeMovie = null;
        // List<InlineResponse2009> response = api.getQueueDetails(includeMovie);

        // TODO: test validations
    }

    /**
     * Get Queue Status
     *
     * Stats on items in queue
     */
    @Test
    public void getQueueStatusTest() {
        // InlineResponse20010 response = api.getQueueStatus();

        // TODO: test validations
    }

    /**
     * 
     *
     * Perform a Radarr \&quot;force grab\&quot; on a pending queue item by its ID.
     */
    @Test
    public void postQueueGrabIdTest() {
        String id = null;
        // Void response = api.postQueueGrabId(id);

        // TODO: test validations
    }
}
