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
import de.codemakers.radarr4j.model.InlineResponse2001Changes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class InlineResponse2001 {
  @SerializedName("version")
  private String version = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("releaseDate")
  private String releaseDate = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("installed")
  private Boolean installed = null;

  @SerializedName("installable")
  private Boolean installable = null;

  @SerializedName("latest")
  private Boolean latest = null;

  @SerializedName("changes")
  private InlineResponse2001Changes changes = null;

  @SerializedName("hash")
  private String hash = null;

  public InlineResponse2001 version(String version) {
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

  public InlineResponse2001 branch(String branch) {
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

  public InlineResponse2001 releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @Schema(description = "")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public InlineResponse2001 fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public InlineResponse2001 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InlineResponse2001 installed(Boolean installed) {
    this.installed = installed;
    return this;
  }

   /**
   * Get installed
   * @return installed
  **/
  @Schema(description = "")
  public Boolean isInstalled() {
    return installed;
  }

  public void setInstalled(Boolean installed) {
    this.installed = installed;
  }

  public InlineResponse2001 installable(Boolean installable) {
    this.installable = installable;
    return this;
  }

   /**
   * Get installable
   * @return installable
  **/
  @Schema(description = "")
  public Boolean isInstallable() {
    return installable;
  }

  public void setInstallable(Boolean installable) {
    this.installable = installable;
  }

  public InlineResponse2001 latest(Boolean latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @Schema(description = "")
  public Boolean isLatest() {
    return latest;
  }

  public void setLatest(Boolean latest) {
    this.latest = latest;
  }

  public InlineResponse2001 changes(InlineResponse2001Changes changes) {
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @Schema(description = "")
  public InlineResponse2001Changes getChanges() {
    return changes;
  }

  public void setChanges(InlineResponse2001Changes changes) {
    this.changes = changes;
  }

  public InlineResponse2001 hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @Schema(description = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.version, inlineResponse2001.version) &&
        Objects.equals(this.branch, inlineResponse2001.branch) &&
        Objects.equals(this.releaseDate, inlineResponse2001.releaseDate) &&
        Objects.equals(this.fileName, inlineResponse2001.fileName) &&
        Objects.equals(this.url, inlineResponse2001.url) &&
        Objects.equals(this.installed, inlineResponse2001.installed) &&
        Objects.equals(this.installable, inlineResponse2001.installable) &&
        Objects.equals(this.latest, inlineResponse2001.latest) &&
        Objects.equals(this.changes, inlineResponse2001.changes) &&
        Objects.equals(this.hash, inlineResponse2001.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, branch, releaseDate, fileName, url, installed, installable, latest, changes, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
    sb.append("    installable: ").append(toIndentedString(installable)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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