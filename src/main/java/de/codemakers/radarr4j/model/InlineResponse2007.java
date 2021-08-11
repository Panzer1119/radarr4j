/*
 * Radarr
 * The way users should interact with Radarr programatically. To utilize any of these endpoints you will need a few pieces of information:  ex: localhost:7878/api/v3/movies?apiKey={key_here}  * url: localhost, 10.1.0.1, 192.168.1.1, etc * port: 7878 (unless you modify it) * apiKey: Located in Settings > General > Security
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.codemakers.radarr4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse2007
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class InlineResponse2007 {
  @SerializedName("bindAddress")
  private String bindAddress = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("sslPort")
  private Integer sslPort = null;

  @SerializedName("enableSsl")
  private Boolean enableSsl = null;

  @SerializedName("launchBrowser")
  private Boolean launchBrowser = null;

  @SerializedName("authenticationMethod")
  private String authenticationMethod = null;

  @SerializedName("analyticsEnabled")
  private Boolean analyticsEnabled = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("logLevel")
  private String logLevel = null;

  @SerializedName("consoleLogLevel")
  private String consoleLogLevel = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("sslCertPath")
  private String sslCertPath = null;

  @SerializedName("sslCertPassword")
  private String sslCertPassword = null;

  @SerializedName("urlBase")
  private String urlBase = null;

  @SerializedName("updateAutomatically")
  private Boolean updateAutomatically = null;

  @SerializedName("updateMechanism")
  private String updateMechanism = null;

  @SerializedName("updateScriptPath")
  private String updateScriptPath = null;

  @SerializedName("proxyEnabled")
  private Boolean proxyEnabled = null;

  @SerializedName("proxyType")
  private String proxyType = null;

  @SerializedName("proxyHostname")
  private String proxyHostname = null;

  @SerializedName("proxyPort")
  private Integer proxyPort = null;

  @SerializedName("proxyUsername")
  private String proxyUsername = null;

  @SerializedName("proxyPassword")
  private String proxyPassword = null;

  @SerializedName("proxyBypassFilter")
  private String proxyBypassFilter = null;

  @SerializedName("proxyBypassLocalAddresses")
  private Boolean proxyBypassLocalAddresses = null;

  @SerializedName("certificateValidation")
  private String certificateValidation = null;

  @SerializedName("backupFolder")
  private String backupFolder = null;

  @SerializedName("backupInterval")
  private Integer backupInterval = null;

  @SerializedName("backupRetention")
  private Integer backupRetention = null;

  @SerializedName("id")
  private Integer id = null;

  public InlineResponse2007 bindAddress(String bindAddress) {
    this.bindAddress = bindAddress;
    return this;
  }

   /**
   * Get bindAddress
   * @return bindAddress
  **/
  @Schema(required = true, description = "")
  public String getBindAddress() {
    return bindAddress;
  }

  public void setBindAddress(String bindAddress) {
    this.bindAddress = bindAddress;
  }

  public InlineResponse2007 port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(required = true, description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public InlineResponse2007 sslPort(Integer sslPort) {
    this.sslPort = sslPort;
    return this;
  }

   /**
   * Get sslPort
   * @return sslPort
  **/
  @Schema(required = true, description = "")
  public Integer getSslPort() {
    return sslPort;
  }

  public void setSslPort(Integer sslPort) {
    this.sslPort = sslPort;
  }

  public InlineResponse2007 enableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
    return this;
  }

   /**
   * Get enableSsl
   * @return enableSsl
  **/
  @Schema(required = true, description = "")
  public Boolean isEnableSsl() {
    return enableSsl;
  }

  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }

  public InlineResponse2007 launchBrowser(Boolean launchBrowser) {
    this.launchBrowser = launchBrowser;
    return this;
  }

   /**
   * Get launchBrowser
   * @return launchBrowser
  **/
  @Schema(required = true, description = "")
  public Boolean isLaunchBrowser() {
    return launchBrowser;
  }

  public void setLaunchBrowser(Boolean launchBrowser) {
    this.launchBrowser = launchBrowser;
  }

  public InlineResponse2007 authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * Get authenticationMethod
   * @return authenticationMethod
  **/
  @Schema(required = true, description = "")
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public InlineResponse2007 analyticsEnabled(Boolean analyticsEnabled) {
    this.analyticsEnabled = analyticsEnabled;
    return this;
  }

   /**
   * Get analyticsEnabled
   * @return analyticsEnabled
  **/
  @Schema(required = true, description = "")
  public Boolean isAnalyticsEnabled() {
    return analyticsEnabled;
  }

  public void setAnalyticsEnabled(Boolean analyticsEnabled) {
    this.analyticsEnabled = analyticsEnabled;
  }

  public InlineResponse2007 username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InlineResponse2007 password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InlineResponse2007 logLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Get logLevel
   * @return logLevel
  **/
  @Schema(required = true, description = "")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public InlineResponse2007 consoleLogLevel(String consoleLogLevel) {
    this.consoleLogLevel = consoleLogLevel;
    return this;
  }

   /**
   * Get consoleLogLevel
   * @return consoleLogLevel
  **/
  @Schema(required = true, description = "")
  public String getConsoleLogLevel() {
    return consoleLogLevel;
  }

  public void setConsoleLogLevel(String consoleLogLevel) {
    this.consoleLogLevel = consoleLogLevel;
  }

  public InlineResponse2007 branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @Schema(required = true, description = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public InlineResponse2007 apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @Schema(required = true, description = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public InlineResponse2007 sslCertPath(String sslCertPath) {
    this.sslCertPath = sslCertPath;
    return this;
  }

   /**
   * Get sslCertPath
   * @return sslCertPath
  **/
  @Schema(required = true, description = "")
  public String getSslCertPath() {
    return sslCertPath;
  }

  public void setSslCertPath(String sslCertPath) {
    this.sslCertPath = sslCertPath;
  }

  public InlineResponse2007 sslCertPassword(String sslCertPassword) {
    this.sslCertPassword = sslCertPassword;
    return this;
  }

   /**
   * Get sslCertPassword
   * @return sslCertPassword
  **/
  @Schema(required = true, description = "")
  public String getSslCertPassword() {
    return sslCertPassword;
  }

  public void setSslCertPassword(String sslCertPassword) {
    this.sslCertPassword = sslCertPassword;
  }

  public InlineResponse2007 urlBase(String urlBase) {
    this.urlBase = urlBase;
    return this;
  }

   /**
   * Get urlBase
   * @return urlBase
  **/
  @Schema(required = true, description = "")
  public String getUrlBase() {
    return urlBase;
  }

  public void setUrlBase(String urlBase) {
    this.urlBase = urlBase;
  }

  public InlineResponse2007 updateAutomatically(Boolean updateAutomatically) {
    this.updateAutomatically = updateAutomatically;
    return this;
  }

   /**
   * Get updateAutomatically
   * @return updateAutomatically
  **/
  @Schema(required = true, description = "")
  public Boolean isUpdateAutomatically() {
    return updateAutomatically;
  }

  public void setUpdateAutomatically(Boolean updateAutomatically) {
    this.updateAutomatically = updateAutomatically;
  }

  public InlineResponse2007 updateMechanism(String updateMechanism) {
    this.updateMechanism = updateMechanism;
    return this;
  }

   /**
   * Get updateMechanism
   * @return updateMechanism
  **/
  @Schema(required = true, description = "")
  public String getUpdateMechanism() {
    return updateMechanism;
  }

  public void setUpdateMechanism(String updateMechanism) {
    this.updateMechanism = updateMechanism;
  }

  public InlineResponse2007 updateScriptPath(String updateScriptPath) {
    this.updateScriptPath = updateScriptPath;
    return this;
  }

   /**
   * Get updateScriptPath
   * @return updateScriptPath
  **/
  @Schema(required = true, description = "")
  public String getUpdateScriptPath() {
    return updateScriptPath;
  }

  public void setUpdateScriptPath(String updateScriptPath) {
    this.updateScriptPath = updateScriptPath;
  }

  public InlineResponse2007 proxyEnabled(Boolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

   /**
   * Get proxyEnabled
   * @return proxyEnabled
  **/
  @Schema(required = true, description = "")
  public Boolean isProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(Boolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  public InlineResponse2007 proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

   /**
   * Get proxyType
   * @return proxyType
  **/
  @Schema(required = true, description = "")
  public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public InlineResponse2007 proxyHostname(String proxyHostname) {
    this.proxyHostname = proxyHostname;
    return this;
  }

   /**
   * Get proxyHostname
   * @return proxyHostname
  **/
  @Schema(required = true, description = "")
  public String getProxyHostname() {
    return proxyHostname;
  }

  public void setProxyHostname(String proxyHostname) {
    this.proxyHostname = proxyHostname;
  }

  public InlineResponse2007 proxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

   /**
   * Get proxyPort
   * @return proxyPort
  **/
  @Schema(required = true, description = "")
  public Integer getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
  }

  public InlineResponse2007 proxyUsername(String proxyUsername) {
    this.proxyUsername = proxyUsername;
    return this;
  }

   /**
   * Get proxyUsername
   * @return proxyUsername
  **/
  @Schema(required = true, description = "")
  public String getProxyUsername() {
    return proxyUsername;
  }

  public void setProxyUsername(String proxyUsername) {
    this.proxyUsername = proxyUsername;
  }

  public InlineResponse2007 proxyPassword(String proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

   /**
   * Get proxyPassword
   * @return proxyPassword
  **/
  @Schema(required = true, description = "")
  public String getProxyPassword() {
    return proxyPassword;
  }

  public void setProxyPassword(String proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public InlineResponse2007 proxyBypassFilter(String proxyBypassFilter) {
    this.proxyBypassFilter = proxyBypassFilter;
    return this;
  }

   /**
   * Get proxyBypassFilter
   * @return proxyBypassFilter
  **/
  @Schema(required = true, description = "")
  public String getProxyBypassFilter() {
    return proxyBypassFilter;
  }

  public void setProxyBypassFilter(String proxyBypassFilter) {
    this.proxyBypassFilter = proxyBypassFilter;
  }

  public InlineResponse2007 proxyBypassLocalAddresses(Boolean proxyBypassLocalAddresses) {
    this.proxyBypassLocalAddresses = proxyBypassLocalAddresses;
    return this;
  }

   /**
   * Get proxyBypassLocalAddresses
   * @return proxyBypassLocalAddresses
  **/
  @Schema(required = true, description = "")
  public Boolean isProxyBypassLocalAddresses() {
    return proxyBypassLocalAddresses;
  }

  public void setProxyBypassLocalAddresses(Boolean proxyBypassLocalAddresses) {
    this.proxyBypassLocalAddresses = proxyBypassLocalAddresses;
  }

  public InlineResponse2007 certificateValidation(String certificateValidation) {
    this.certificateValidation = certificateValidation;
    return this;
  }

   /**
   * Get certificateValidation
   * @return certificateValidation
  **/
  @Schema(required = true, description = "")
  public String getCertificateValidation() {
    return certificateValidation;
  }

  public void setCertificateValidation(String certificateValidation) {
    this.certificateValidation = certificateValidation;
  }

  public InlineResponse2007 backupFolder(String backupFolder) {
    this.backupFolder = backupFolder;
    return this;
  }

   /**
   * Get backupFolder
   * @return backupFolder
  **/
  @Schema(required = true, description = "")
  public String getBackupFolder() {
    return backupFolder;
  }

  public void setBackupFolder(String backupFolder) {
    this.backupFolder = backupFolder;
  }

  public InlineResponse2007 backupInterval(Integer backupInterval) {
    this.backupInterval = backupInterval;
    return this;
  }

   /**
   * Get backupInterval
   * @return backupInterval
  **/
  @Schema(required = true, description = "")
  public Integer getBackupInterval() {
    return backupInterval;
  }

  public void setBackupInterval(Integer backupInterval) {
    this.backupInterval = backupInterval;
  }

  public InlineResponse2007 backupRetention(Integer backupRetention) {
    this.backupRetention = backupRetention;
    return this;
  }

   /**
   * Get backupRetention
   * @return backupRetention
  **/
  @Schema(required = true, description = "")
  public Integer getBackupRetention() {
    return backupRetention;
  }

  public void setBackupRetention(Integer backupRetention) {
    this.backupRetention = backupRetention;
  }

  public InlineResponse2007 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.bindAddress, inlineResponse2007.bindAddress) &&
        Objects.equals(this.port, inlineResponse2007.port) &&
        Objects.equals(this.sslPort, inlineResponse2007.sslPort) &&
        Objects.equals(this.enableSsl, inlineResponse2007.enableSsl) &&
        Objects.equals(this.launchBrowser, inlineResponse2007.launchBrowser) &&
        Objects.equals(this.authenticationMethod, inlineResponse2007.authenticationMethod) &&
        Objects.equals(this.analyticsEnabled, inlineResponse2007.analyticsEnabled) &&
        Objects.equals(this.username, inlineResponse2007.username) &&
        Objects.equals(this.password, inlineResponse2007.password) &&
        Objects.equals(this.logLevel, inlineResponse2007.logLevel) &&
        Objects.equals(this.consoleLogLevel, inlineResponse2007.consoleLogLevel) &&
        Objects.equals(this.branch, inlineResponse2007.branch) &&
        Objects.equals(this.apiKey, inlineResponse2007.apiKey) &&
        Objects.equals(this.sslCertPath, inlineResponse2007.sslCertPath) &&
        Objects.equals(this.sslCertPassword, inlineResponse2007.sslCertPassword) &&
        Objects.equals(this.urlBase, inlineResponse2007.urlBase) &&
        Objects.equals(this.updateAutomatically, inlineResponse2007.updateAutomatically) &&
        Objects.equals(this.updateMechanism, inlineResponse2007.updateMechanism) &&
        Objects.equals(this.updateScriptPath, inlineResponse2007.updateScriptPath) &&
        Objects.equals(this.proxyEnabled, inlineResponse2007.proxyEnabled) &&
        Objects.equals(this.proxyType, inlineResponse2007.proxyType) &&
        Objects.equals(this.proxyHostname, inlineResponse2007.proxyHostname) &&
        Objects.equals(this.proxyPort, inlineResponse2007.proxyPort) &&
        Objects.equals(this.proxyUsername, inlineResponse2007.proxyUsername) &&
        Objects.equals(this.proxyPassword, inlineResponse2007.proxyPassword) &&
        Objects.equals(this.proxyBypassFilter, inlineResponse2007.proxyBypassFilter) &&
        Objects.equals(this.proxyBypassLocalAddresses, inlineResponse2007.proxyBypassLocalAddresses) &&
        Objects.equals(this.certificateValidation, inlineResponse2007.certificateValidation) &&
        Objects.equals(this.backupFolder, inlineResponse2007.backupFolder) &&
        Objects.equals(this.backupInterval, inlineResponse2007.backupInterval) &&
        Objects.equals(this.backupRetention, inlineResponse2007.backupRetention) &&
        Objects.equals(this.id, inlineResponse2007.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindAddress, port, sslPort, enableSsl, launchBrowser, authenticationMethod, analyticsEnabled, username, password, logLevel, consoleLogLevel, branch, apiKey, sslCertPath, sslCertPassword, urlBase, updateAutomatically, updateMechanism, updateScriptPath, proxyEnabled, proxyType, proxyHostname, proxyPort, proxyUsername, proxyPassword, proxyBypassFilter, proxyBypassLocalAddresses, certificateValidation, backupFolder, backupInterval, backupRetention, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    bindAddress: ").append(toIndentedString(bindAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sslPort: ").append(toIndentedString(sslPort)).append("\n");
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    launchBrowser: ").append(toIndentedString(launchBrowser)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    analyticsEnabled: ").append(toIndentedString(analyticsEnabled)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    consoleLogLevel: ").append(toIndentedString(consoleLogLevel)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    sslCertPath: ").append(toIndentedString(sslCertPath)).append("\n");
    sb.append("    sslCertPassword: ").append(toIndentedString(sslCertPassword)).append("\n");
    sb.append("    urlBase: ").append(toIndentedString(urlBase)).append("\n");
    sb.append("    updateAutomatically: ").append(toIndentedString(updateAutomatically)).append("\n");
    sb.append("    updateMechanism: ").append(toIndentedString(updateMechanism)).append("\n");
    sb.append("    updateScriptPath: ").append(toIndentedString(updateScriptPath)).append("\n");
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyHostname: ").append(toIndentedString(proxyHostname)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyUsername: ").append(toIndentedString(proxyUsername)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyBypassFilter: ").append(toIndentedString(proxyBypassFilter)).append("\n");
    sb.append("    proxyBypassLocalAddresses: ").append(toIndentedString(proxyBypassLocalAddresses)).append("\n");
    sb.append("    certificateValidation: ").append(toIndentedString(certificateValidation)).append("\n");
    sb.append("    backupFolder: ").append(toIndentedString(backupFolder)).append("\n");
    sb.append("    backupInterval: ").append(toIndentedString(backupInterval)).append("\n");
    sb.append("    backupRetention: ").append(toIndentedString(backupRetention)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
