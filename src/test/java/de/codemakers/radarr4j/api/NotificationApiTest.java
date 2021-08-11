package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import de.codemakers.radarr4j.model.Notification;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
public class NotificationApiTest {

    private NotificationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationApi.class);
    }


    /**
     * Delete a Notification
     *
     * Delete Notification by database id
     */
    @Test
    public void deleteNotificationIdTest() {
        Integer id = null;
        // Void response = api.deleteNotificationId(id);

        // TODO: test validations
    }

    /**
     * Get a Notification
     *
     * Get Notification by database id
     */
    @Test
    public void getNotificationIdTest() {
        Integer id = null;
        // Notification response = api.getNotificationId(id);

        // TODO: test validations
    }

    /**
     * Get All Notifications
     *
     * Get all notifications
     */
    @Test
    public void getNotificationsTest() {
        // List<Notification> response = api.getNotifications();

        // TODO: test validations
    }

    /**
     * Edit a Notification
     *
     * Edit Notification by database id
     */
    @Test
    public void putNotificationIdTest() {
        Integer id = null;
        Notification body = null;
        // Void response = api.putNotificationId(id, body);

        // TODO: test validations
    }
}
