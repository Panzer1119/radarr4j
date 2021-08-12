package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import de.codemakers.radarr4j.model.Tag;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for TagApi
 */
public class TagApiTest {

    private TagApi api;

    @Before
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(TagApi.class);
    }


    /**
     * Edit a Tag
     *
     * Edit a Tag by its database id
     */
    @Test
    public void putTagIdTest() {
        Integer id = null;
        Tag body = null;
        // Void response = api.putTagId(id, body);

        // TODO: test validations
    }

    /**
     * Get All Tag Details
     *
     * Returns a list of tag detail objects for all tags in the database.
     */
    @Test
    public void tagDetailGetTest() {
        // List<TagDetail> response = api.tagDetailGet();

        // TODO: test validations
    }

    /**
     * Get a Tag Details
     *
     * Returns the id of all items in the database which use the specified tag
     */
    @Test
    public void tagDetailIdGetTest() {
        Integer id = null;
        // TagDetail response = api.tagDetailIdGet(id);

        // TODO: test validations
    }

    /**
     * Get All Tags
     *
     * Get all tags in the database
     */
    @Test
    public void tagGetTest() {
        // List<Tag> response = api.tagGet();

        // TODO: test validations
    }

    /**
     * Delete a Tag
     *
     * Delete a tag
     */
    @Test
    public void tagIdDeleteTest() {
        Integer id = null;
        // Void response = api.tagIdDelete(id);

        // TODO: test validations
    }

    /**
     * Get a Tag
     *
     * Return a given tag and its label by the database id.
     */
    @Test
    public void tagIdGetTest() {
        Integer id = null;
        // Tag response = api.tagIdGet(id);

        // TODO: test validations
    }

    /**
     * Create a Tag
     *
     * Create a new tag that can be assigned to a movie, list, delay profile, notification, or restriction
     */
    @Test
    public void tagPostTest() {
        Tag body = null;
        // Void response = api.tagPost(body);

        // TODO: test validations
    }
}
