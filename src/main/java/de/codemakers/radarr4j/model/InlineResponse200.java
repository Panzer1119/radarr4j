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
 * InlineResponse200
 */

public class InlineResponse200 {
  @SerializedName("version")
  private String version = null;

  @SerializedName("buildTime")
  private String buildTime = null;

  @SerializedName("isDebug")
  private Boolean isDebug = null;

  @SerializedName("isProduction")
  private Boolean isProduction = null;

  @SerializedName("isAdmin")
  private Boolean isAdmin = null;

  @SerializedName("isUserInteractive")
  private Boolean isUserInteractive = null;

  @SerializedName("startupPath")
  private String startupPath = null;

  @SerializedName("appData")
  private String appData = null;

  @SerializedName("osName")
  private String osName = null;

  @SerializedName("osVersion")
  private String osVersion = null;

  @SerializedName("isNetCore")
  private Boolean isNetCore = null;

  @SerializedName("isMono")
  private Boolean isMono = null;

  @SerializedName("isLinux")
  private Boolean isLinux = null;

  @SerializedName("isOsx")
  private Boolean isOsx = null;

  @SerializedName("isWindows")
  private Boolean isWindows = null;

  @SerializedName("isDocker")
  private Boolean isDocker = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("authentication")
  private String authentication = null;

  @SerializedName("sqliteVersion")
  private String sqliteVersion = null;

  @SerializedName("migrationVersion")
  private Integer migrationVersion = null;

  @SerializedName("urlBase")
  private String urlBase = null;

  @SerializedName("runtimeVersion")
  private String runtimeVersion = null;

  @SerializedName("runtimeName")
  private String runtimeName = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("packageUpdateMechanism")
  private String packageUpdateMechanism = null;

  public InlineResponse200 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse200 buildTime(String buildTime) {
    this.buildTime = buildTime;
    return this;
  }

   /**
   * Get buildTime
   * @return buildTime
  **/
  @Schema(description = "")
  public String getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }

  public InlineResponse200 isDebug(Boolean isDebug) {
    this.isDebug = isDebug;
    return this;
  }

   /**
   * Get isDebug
   * @return isDebug
  **/
  @Schema(description = "")
  public Boolean isIsDebug() {
    return isDebug;
  }

  public void setIsDebug(Boolean isDebug) {
    this.isDebug = isDebug;
  }

  public InlineResponse200 isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

   /**
   * Get isProduction
   * @return isProduction
  **/
  @Schema(description = "")
  public Boolean isIsProduction() {
    return isProduction;
  }

  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }

  public InlineResponse200 isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @Schema(description = "")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public InlineResponse200 isUserInteractive(Boolean isUserInteractive) {
    this.isUserInteractive = isUserInteractive;
    return this;
  }

   /**
   * Get isUserInteractive
   * @return isUserInteractive
  **/
  @Schema(description = "")
  public Boolean isIsUserInteractive() {
    return isUserInteractive;
  }

  public void setIsUserInteractive(Boolean isUserInteractive) {
    this.isUserInteractive = isUserInteractive;
  }

  public InlineResponse200 startupPath(String startupPath) {
    this.startupPath = startupPath;
    return this;
  }

   /**
   * Get startupPath
   * @return startupPath
  **/
  @Schema(description = "")
  public String getStartupPath() {
    return startupPath;
  }

  public void setStartupPath(String startupPath) {
    this.startupPath = startupPath;
  }

  public InlineResponse200 appData(String appData) {
    this.appData = appData;
    return this;
  }

   /**
   * Get appData
   * @return appData
  **/
  @Schema(description = "")
  public String getAppData() {
    return appData;
  }

  public void setAppData(String appData) {
    this.appData = appData;
  }

  public InlineResponse200 osName(String osName) {
    this.osName = osName;
    return this;
  }

   /**
   * Get osName
   * @return osName
  **/
  @Schema(description = "")
  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public InlineResponse200 osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @Schema(description = "")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public InlineResponse200 isNetCore(Boolean isNetCore) {
    this.isNetCore = isNetCore;
    return this;
  }

   /**
   * Get isNetCore
   * @return isNetCore
  **/
  @Schema(description = "")
  public Boolean isIsNetCore() {
    return isNetCore;
  }

  public void setIsNetCore(Boolean isNetCore) {
    this.isNetCore = isNetCore;
  }

  public InlineResponse200 isMono(Boolean isMono) {
    this.isMono = isMono;
    return this;
  }

   /**
   * Get isMono
   * @return isMono
  **/
  @Schema(description = "")
  public Boolean isIsMono() {
    return isMono;
  }

  public void setIsMono(Boolean isMono) {
    this.isMono = isMono;
  }

  public InlineResponse200 isLinux(Boolean isLinux) {
    this.isLinux = isLinux;
    return this;
  }

   /**
   * Get isLinux
   * @return isLinux
  **/
  @Schema(description = "")
  public Boolean isIsLinux() {
    return isLinux;
  }

  public void setIsLinux(Boolean isLinux) {
    this.isLinux = isLinux;
  }

  public InlineResponse200 isOsx(Boolean isOsx) {
    this.isOsx = isOsx;
    return this;
  }

   /**
   * Get isOsx
   * @return isOsx
  **/
  @Schema(description = "")
  public Boolean isIsOsx() {
    return isOsx;
  }

  public void setIsOsx(Boolean isOsx) {
    this.isOsx = isOsx;
  }

  public InlineResponse200 isWindows(Boolean isWindows) {
    this.isWindows = isWindows;
    return this;
  }

   /**
   * Get isWindows
   * @return isWindows
  **/
  @Schema(description = "")
  public Boolean isIsWindows() {
    return isWindows;
  }

  public void setIsWindows(Boolean isWindows) {
    this.isWindows = isWindows;
  }

  public InlineResponse200 isDocker(Boolean isDocker) {
    this.isDocker = isDocker;
    return this;
  }

   /**
   * Get isDocker
   * @return isDocker
  **/
  @Schema(description = "")
  public Boolean isIsDocker() {
    return isDocker;
  }

  public void setIsDocker(Boolean isDocker) {
    this.isDocker = isDocker;
  }

  public InlineResponse200 mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public InlineResponse200 branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @Schema(description = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public InlineResponse200 authentication(String authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @Schema(description = "")
  public String getAuthentication() {
    return authentication;
  }

  public void setAuthentication(String authentication) {
    this.authentication = authentication;
  }

  public InlineResponse200 sqliteVersion(String sqliteVersion) {
    this.sqliteVersion = sqliteVersion;
    return this;
  }

   /**
   * Get sqliteVersion
   * @return sqliteVersion
  **/
  @Schema(description = "")
  public String getSqliteVersion() {
    return sqliteVersion;
  }

  public void setSqliteVersion(String sqliteVersion) {
    this.sqliteVersion = sqliteVersion;
  }

  public InlineResponse200 migrationVersion(Integer migrationVersion) {
    this.migrationVersion = migrationVersion;
    return this;
  }

   /**
   * Get migrationVersion
   * @return migrationVersion
  **/
  @Schema(description = "")
  public Integer getMigrationVersion() {
    return migrationVersion;
  }

  public void setMigrationVersion(Integer migrationVersion) {
    this.migrationVersion = migrationVersion;
  }

  public InlineResponse200 urlBase(String urlBase) {
    this.urlBase = urlBase;
    return this;
  }

   /**
   * Get urlBase
   * @return urlBase
  **/
  @Schema(description = "")
  public String getUrlBase() {
    return urlBase;
  }

  public void setUrlBase(String urlBase) {
    this.urlBase = urlBase;
  }

  public InlineResponse200 runtimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

   /**
   * Get runtimeVersion
   * @return runtimeVersion
  **/
  @Schema(description = "")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  public InlineResponse200 runtimeName(String runtimeName) {
    this.runtimeName = runtimeName;
    return this;
  }

   /**
   * Get runtimeName
   * @return runtimeName
  **/
  @Schema(description = "")
  public String getRuntimeName() {
    return runtimeName;
  }

  public void setRuntimeName(String runtimeName) {
    this.runtimeName = runtimeName;
  }

  public InlineResponse200 startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public InlineResponse200 packageUpdateMechanism(String packageUpdateMechanism) {
    this.packageUpdateMechanism = packageUpdateMechanism;
    return this;
  }

   /**
   * Get packageUpdateMechanism
   * @return packageUpdateMechanism
  **/
  @Schema(description = "")
  public String getPackageUpdateMechanism() {
    return packageUpdateMechanism;
  }

  public void setPackageUpdateMechanism(String packageUpdateMechanism) {
    this.packageUpdateMechanism = packageUpdateMechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.version, inlineResponse200.version) &&
        Objects.equals(this.buildTime, inlineResponse200.buildTime) &&
        Objects.equals(this.isDebug, inlineResponse200.isDebug) &&
        Objects.equals(this.isProduction, inlineResponse200.isProduction) &&
        Objects.equals(this.isAdmin, inlineResponse200.isAdmin) &&
        Objects.equals(this.isUserInteractive, inlineResponse200.isUserInteractive) &&
        Objects.equals(this.startupPath, inlineResponse200.startupPath) &&
        Objects.equals(this.appData, inlineResponse200.appData) &&
        Objects.equals(this.osName, inlineResponse200.osName) &&
        Objects.equals(this.osVersion, inlineResponse200.osVersion) &&
        Objects.equals(this.isNetCore, inlineResponse200.isNetCore) &&
        Objects.equals(this.isMono, inlineResponse200.isMono) &&
        Objects.equals(this.isLinux, inlineResponse200.isLinux) &&
        Objects.equals(this.isOsx, inlineResponse200.isOsx) &&
        Objects.equals(this.isWindows, inlineResponse200.isWindows) &&
        Objects.equals(this.isDocker, inlineResponse200.isDocker) &&
        Objects.equals(this.mode, inlineResponse200.mode) &&
        Objects.equals(this.branch, inlineResponse200.branch) &&
        Objects.equals(this.authentication, inlineResponse200.authentication) &&
        Objects.equals(this.sqliteVersion, inlineResponse200.sqliteVersion) &&
        Objects.equals(this.migrationVersion, inlineResponse200.migrationVersion) &&
        Objects.equals(this.urlBase, inlineResponse200.urlBase) &&
        Objects.equals(this.runtimeVersion, inlineResponse200.runtimeVersion) &&
        Objects.equals(this.runtimeName, inlineResponse200.runtimeName) &&
        Objects.equals(this.startTime, inlineResponse200.startTime) &&
        Objects.equals(this.packageUpdateMechanism, inlineResponse200.packageUpdateMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, buildTime, isDebug, isProduction, isAdmin, isUserInteractive, startupPath, appData, osName, osVersion, isNetCore, isMono, isLinux, isOsx, isWindows, isDocker, mode, branch, authentication, sqliteVersion, migrationVersion, urlBase, runtimeVersion, runtimeName, startTime, packageUpdateMechanism);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
    sb.append("    isDebug: ").append(toIndentedString(isDebug)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isUserInteractive: ").append(toIndentedString(isUserInteractive)).append("\n");
    sb.append("    startupPath: ").append(toIndentedString(startupPath)).append("\n");
    sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    isNetCore: ").append(toIndentedString(isNetCore)).append("\n");
    sb.append("    isMono: ").append(toIndentedString(isMono)).append("\n");
    sb.append("    isLinux: ").append(toIndentedString(isLinux)).append("\n");
    sb.append("    isOsx: ").append(toIndentedString(isOsx)).append("\n");
    sb.append("    isWindows: ").append(toIndentedString(isWindows)).append("\n");
    sb.append("    isDocker: ").append(toIndentedString(isDocker)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    sqliteVersion: ").append(toIndentedString(sqliteVersion)).append("\n");
    sb.append("    migrationVersion: ").append(toIndentedString(migrationVersion)).append("\n");
    sb.append("    urlBase: ").append(toIndentedString(urlBase)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    packageUpdateMechanism: ").append(toIndentedString(packageUpdateMechanism)).append("\n");
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
