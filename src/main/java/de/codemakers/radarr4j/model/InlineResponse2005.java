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
 * InlineResponse2005
 */

public class InlineResponse2005 {
  @SerializedName("host")
  private String host = null;

  @SerializedName("remotePath")
  private String remotePath = null;

  @SerializedName("localPath")
  private String localPath = null;

  @SerializedName("id")
  private Integer id = null;

  public InlineResponse2005 host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public InlineResponse2005 remotePath(String remotePath) {
    this.remotePath = remotePath;
    return this;
  }

   /**
   * Get remotePath
   * @return remotePath
  **/
  @Schema(required = true, description = "")
  public String getRemotePath() {
    return remotePath;
  }

  public void setRemotePath(String remotePath) {
    this.remotePath = remotePath;
  }

  public InlineResponse2005 localPath(String localPath) {
    this.localPath = localPath;
    return this;
  }

   /**
   * Get localPath
   * @return localPath
  **/
  @Schema(required = true, description = "")
  public String getLocalPath() {
    return localPath;
  }

  public void setLocalPath(String localPath) {
    this.localPath = localPath;
  }

  public InlineResponse2005 id(Integer id) {
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
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.host, inlineResponse2005.host) &&
        Objects.equals(this.remotePath, inlineResponse2005.remotePath) &&
        Objects.equals(this.localPath, inlineResponse2005.localPath) &&
        Objects.equals(this.id, inlineResponse2005.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, remotePath, localPath, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    remotePath: ").append(toIndentedString(remotePath)).append("\n");
    sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
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
