package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.ConfigHostBody;
import de.codemakers.radarr4j.model.ConfigNamingBody;
import de.codemakers.radarr4j.model.ConfigUiBody;
import de.codemakers.radarr4j.model.InlineResponse2004;
import de.codemakers.radarr4j.model.InlineResponse2007;
import de.codemakers.radarr4j.model.InlineResponse2008;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
public class SettingsApiTest {

    private SettingsApi api;

    @Before
    public void setup() {
        api = new ApiClient(TestUtil.TEST_HOST).createService(SettingsApi.class);
    }


    /**
     * Get Host Settings
     *
     * Get General/Host settings for Radarr.
     */
    @Test
    public void getConfigHostTest() {
        // InlineResponse2007 response = api.getConfigHost();

        // TODO: test validations
    }

    /**
     * Get Naming Settings
     *
     * Get Settings for movie file and folder naming.
     */
    @Test
    public void getConfigNamingTest() {
        // InlineResponse2008 response = api.getConfigNaming();

        // TODO: test validations
    }

    /**
     * Get UI Settings
     *
     * Query Radarr for UI settings
     */
    @Test
    public void getUiTest() {
        // InlineResponse2004 response = api.getUi();

        // TODO: test validations
    }

    /**
     * Edit Host Settings
     *
     * Edit General/Host settings for Radarr.
     */
    @Test
    public void putConfigHostTest() {
        ConfigHostBody body = null;
        // Void response = api.putConfigHost(body);

        // TODO: test validations
    }

    /**
     * Edit Naming Settings
     *
     * Edit Settings for movie file and folder naming.
     */
    @Test
    public void putConfigNamingTest() {
        ConfigNamingBody body = null;
        // Void response = api.putConfigNaming(body);

        // TODO: test validations
    }

    /**
     * Edit UI Settings
     *
     * Edit one or many UI settings and save to to the database
     */
    @Test
    public void putconfigUiTest() {
        ConfigUiBody body = null;
        // Void response = api.putconfigUi(body);

        // TODO: test validations
    }
}
