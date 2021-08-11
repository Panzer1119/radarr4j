package de.codemakers.radarr4j.api;

import de.codemakers.radarr4j.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import de.codemakers.radarr4j.model.InlineResponse201;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommandApi {
  /**
   * Post a Command
   * Pushes commands to Radarr using a key:value pair. The main key is \&quot;name\&quot; and below are acceptable values but it can also accept other key:value pairs (listed under each command):  * ApplicationUpdate - Trigger an update of Radarr * Backup - Trigger a backup routine * CheckHealth - Trigger a system health check * ClearBlacklist - Triggers the removal of all blacklisted movies * CleanUpRecycleBin - Trigger a recycle bin cleanup check * DeleteLogFiles - Triggers the removal of all Info/Debug/Trace log files * DeleteUpdateLogFiles - Triggers the removal of all Update log files * DownloadedMoviesScan - Triggers the scan of downloaded movies * MissingMoviesSearch - Triggers a search of all missing movies * RefreshMonitoredDownloads - Triggers the scan of monitored downloads * RefreshMovie - Trigger a refresh / scan of library     * movieIds:int[] - Specify a list of ids (comma separated) for individual movies to refresh
   * @return Call&lt;Void&gt;
   */
  @POST("command")
  Call<Void> postCommand();
    

}
