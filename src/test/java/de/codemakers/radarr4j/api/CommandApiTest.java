package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.RadarrApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for CommandApi
 */
public class CommandApiTest {

    private CommandApi api;

    @BeforeEach
    public void setup() {
        api = new RadarrApiClient(TestUtil.TEST_HOST).createService(CommandApi.class);
    }


    /**
     * Post a Command
     *
     * Pushes commands to Radarr using a key:value pair. The main key is \&quot;name\&quot; and below are acceptable values but it can also accept other key:value pairs (listed under each command):  * ApplicationUpdate - Trigger an update of Radarr * Backup - Trigger a backup routine * CheckHealth - Trigger a system health check * ClearBlacklist - Triggers the removal of all blacklisted movies * CleanUpRecycleBin - Trigger a recycle bin cleanup check * DeleteLogFiles - Triggers the removal of all Info/Debug/Trace log files * DeleteUpdateLogFiles - Triggers the removal of all Update log files * DownloadedMoviesScan - Triggers the scan of downloaded movies * MissingMoviesSearch - Triggers a search of all missing movies * RefreshMonitoredDownloads - Triggers the scan of monitored downloads * RefreshMovie - Trigger a refresh / scan of library     * movieIds:int[] - Specify a list of ids (comma separated) for individual movies to refresh
     */
    @Test
    public void postCommandTest() {
        // Void response = api.postCommand();

        // TODO: test validations
    }
}
