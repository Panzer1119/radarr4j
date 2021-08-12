package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for CalendarApi
 */
public class CalendarApiTest {

    private CalendarApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(CalendarApi.class);
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
