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
import java.math.BigDecimal;
/**
 * ConfigHostBody
 */

public class ConfigHostBody {
  @SerializedName("bindAddress")
  private String bindAddress = null;

  @SerializedName("port")
  private BigDecimal port = null;

  @SerializedName("sslPort")
  private BigDecimal sslPort = null;

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
  private BigDecimal proxyPort = null;

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
  private BigDecimal backupInterval = null;

  @SerializedName("backupRetention")
  private BigDecimal backupRetention = null;

  @SerializedName("id")
  private BigDecimal id = null;

  public ConfigHostBody bindAddress(String bindAddress) {
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

  public ConfigHostBody port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }

  public ConfigHostBody sslPort(BigDecimal sslPort) {
    this.sslPort = sslPort;
    return this;
  }

   /**
   * Get sslPort
   * @return sslPort
  **/
  @Schema(required = true, description = "")
  public BigDecimal getSslPort() {
    return sslPort;
  }

  public void setSslPort(BigDecimal sslPort) {
    this.sslPort = sslPort;
  }

  public ConfigHostBody enableSsl(Boolean enableSsl) {
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

  public ConfigHostBody launchBrowser(Boolean launchBrowser) {
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

  public ConfigHostBody authenticationMethod(String authenticationMethod) {
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

  public ConfigHostBody analyticsEnabled(Boolean analyticsEnabled) {
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

  public ConfigHostBody username(String username) {
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

  public ConfigHostBody password(String password) {
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

  public ConfigHostBody logLevel(String logLevel) {
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

  public ConfigHostBody consoleLogLevel(String consoleLogLevel) {
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

  public ConfigHostBody branch(String branch) {
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

  public ConfigHostBody apiKey(String apiKey) {
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

  public ConfigHostBody sslCertPath(String sslCertPath) {
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

  public ConfigHostBody sslCertPassword(String sslCertPassword) {
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

  public ConfigHostBody urlBase(String urlBase) {
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

  public ConfigHostBody updateAutomatically(Boolean updateAutomatically) {
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

  public ConfigHostBody updateMechanism(String updateMechanism) {
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

  public ConfigHostBody updateScriptPath(String updateScriptPath) {
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

  public ConfigHostBody proxyEnabled(Boolean proxyEnabled) {
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

  public ConfigHostBody proxyType(String proxyType) {
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

  public ConfigHostBody proxyHostname(String proxyHostname) {
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

  public ConfigHostBody proxyPort(BigDecimal proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

   /**
   * Get proxyPort
   * @return proxyPort
  **/
  @Schema(required = true, description = "")
  public BigDecimal getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(BigDecimal proxyPort) {
    this.proxyPort = proxyPort;
  }

  public ConfigHostBody proxyUsername(String proxyUsername) {
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

  public ConfigHostBody proxyPassword(String proxyPassword) {
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

  public ConfigHostBody proxyBypassFilter(String proxyBypassFilter) {
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

  public ConfigHostBody proxyBypassLocalAddresses(Boolean proxyBypassLocalAddresses) {
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

  public ConfigHostBody certificateValidation(String certificateValidation) {
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

  public ConfigHostBody backupFolder(String backupFolder) {
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

  public ConfigHostBody backupInterval(BigDecimal backupInterval) {
    this.backupInterval = backupInterval;
    return this;
  }

   /**
   * Get backupInterval
   * @return backupInterval
  **/
  @Schema(required = true, description = "")
  public BigDecimal getBackupInterval() {
    return backupInterval;
  }

  public void setBackupInterval(BigDecimal backupInterval) {
    this.backupInterval = backupInterval;
  }

  public ConfigHostBody backupRetention(BigDecimal backupRetention) {
    this.backupRetention = backupRetention;
    return this;
  }

   /**
   * Get backupRetention
   * @return backupRetention
  **/
  @Schema(required = true, description = "")
  public BigDecimal getBackupRetention() {
    return backupRetention;
  }

  public void setBackupRetention(BigDecimal backupRetention) {
    this.backupRetention = backupRetention;
  }

  public ConfigHostBody id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
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
    ConfigHostBody configHostBody = (ConfigHostBody) o;
    return Objects.equals(this.bindAddress, configHostBody.bindAddress) &&
        Objects.equals(this.port, configHostBody.port) &&
        Objects.equals(this.sslPort, configHostBody.sslPort) &&
        Objects.equals(this.enableSsl, configHostBody.enableSsl) &&
        Objects.equals(this.launchBrowser, configHostBody.launchBrowser) &&
        Objects.equals(this.authenticationMethod, configHostBody.authenticationMethod) &&
        Objects.equals(this.analyticsEnabled, configHostBody.analyticsEnabled) &&
        Objects.equals(this.username, configHostBody.username) &&
        Objects.equals(this.password, configHostBody.password) &&
        Objects.equals(this.logLevel, configHostBody.logLevel) &&
        Objects.equals(this.consoleLogLevel, configHostBody.consoleLogLevel) &&
        Objects.equals(this.branch, configHostBody.branch) &&
        Objects.equals(this.apiKey, configHostBody.apiKey) &&
        Objects.equals(this.sslCertPath, configHostBody.sslCertPath) &&
        Objects.equals(this.sslCertPassword, configHostBody.sslCertPassword) &&
        Objects.equals(this.urlBase, configHostBody.urlBase) &&
        Objects.equals(this.updateAutomatically, configHostBody.updateAutomatically) &&
        Objects.equals(this.updateMechanism, configHostBody.updateMechanism) &&
        Objects.equals(this.updateScriptPath, configHostBody.updateScriptPath) &&
        Objects.equals(this.proxyEnabled, configHostBody.proxyEnabled) &&
        Objects.equals(this.proxyType, configHostBody.proxyType) &&
        Objects.equals(this.proxyHostname, configHostBody.proxyHostname) &&
        Objects.equals(this.proxyPort, configHostBody.proxyPort) &&
        Objects.equals(this.proxyUsername, configHostBody.proxyUsername) &&
        Objects.equals(this.proxyPassword, configHostBody.proxyPassword) &&
        Objects.equals(this.proxyBypassFilter, configHostBody.proxyBypassFilter) &&
        Objects.equals(this.proxyBypassLocalAddresses, configHostBody.proxyBypassLocalAddresses) &&
        Objects.equals(this.certificateValidation, configHostBody.certificateValidation) &&
        Objects.equals(this.backupFolder, configHostBody.backupFolder) &&
        Objects.equals(this.backupInterval, configHostBody.backupInterval) &&
        Objects.equals(this.backupRetention, configHostBody.backupRetention) &&
        Objects.equals(this.id, configHostBody.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindAddress, port, sslPort, enableSsl, launchBrowser, authenticationMethod, analyticsEnabled, username, password, logLevel, consoleLogLevel, branch, apiKey, sslCertPath, sslCertPassword, urlBase, updateAutomatically, updateMechanism, updateScriptPath, proxyEnabled, proxyType, proxyHostname, proxyPort, proxyUsername, proxyPassword, proxyBypassFilter, proxyBypassLocalAddresses, certificateValidation, backupFolder, backupInterval, backupRetention, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigHostBody {\n");
    
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
