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
 * QualityProfileFormatItems
 */

public class QualityProfileFormatItems {
  @SerializedName("format")
  private Integer format = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("score")
  private Integer score = null;

  public QualityProfileFormatItems format(Integer format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(required = true, description = "")
  public Integer getFormat() {
    return format;
  }

  public void setFormat(Integer format) {
    this.format = format;
  }

  public QualityProfileFormatItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QualityProfileFormatItems score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(required = true, description = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityProfileFormatItems qualityProfileFormatItems = (QualityProfileFormatItems) o;
    return Objects.equals(this.format, qualityProfileFormatItems.format) &&
        Objects.equals(this.name, qualityProfileFormatItems.name) &&
        Objects.equals(this.score, qualityProfileFormatItems.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, name, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityProfileFormatItems {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
