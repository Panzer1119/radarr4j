package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import de.codemakers.radarr4j.model.DownloadClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for DownloadClientApi
 */
public class DownloadClientApiTest {

    private DownloadClientApi api;

    @Before
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(DownloadClientApi.class);
    }


    /**
     * Delete a Download Client
     *
     * Delete a download client by database id
     */
    @Test
    public void deleteDownloadclientIdTest() {
        Integer id = null;
        // Void response = api.deleteDownloadclientId(id);

        // TODO: test validations
    }

    /**
     * Get All Download Clients
     *
     * Get a list of all the download clients added in Radarr
     */
    @Test
    public void getDownloadClientTest() {
        // List<DownloadClient> response = api.getDownloadClient();

        // TODO: test validations
    }

    /**
     * Get a Download Client
     *
     * Get a single download client by database id
     */
    @Test
    public void getDownloadclientIdTest() {
        Integer id = null;
        // DownloadClient response = api.getDownloadclientId(id);

        // TODO: test validations
    }

    /**
     * Edit a Download Client
     *
     * Edit a downloadclient by database id
     */
    @Test
    public void putDownloadclientIdTest() {
        Integer id = null;
        DownloadClient body = null;
        // Void response = api.putDownloadclientId(id, body);

        // TODO: test validations
    }
}
