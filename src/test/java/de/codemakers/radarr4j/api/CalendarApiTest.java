package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarApi
 */
public class CalendarApiTest {

    private CalendarApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CalendarApi.class);
    }


    /**
     * Get Calendar Events
     *
     * Get a list of movies based on calendar parameters
     */
    @Test
    public void getCalendarTest() {
        Boolean unmonitored = null;
        String start = null;
        String end = null;
        // Void response = api.getCalendar(unmonitored, start, end);

        // TODO: test validations
    }
}
