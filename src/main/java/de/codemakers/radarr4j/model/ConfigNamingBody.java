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
 * ConfigNamingBody
 */

public class ConfigNamingBody {
  @SerializedName("renameMovies")
  private Boolean renameMovies = null;

  @SerializedName("replaceIllegalCharacters")
  private Boolean replaceIllegalCharacters = null;

  @SerializedName("colonReplacementFormat")
  private String colonReplacementFormat = null;

  @SerializedName("standardMovieFormat")
  private String standardMovieFormat = null;

  @SerializedName("movieFolderFormat")
  private String movieFolderFormat = null;

  @SerializedName("includeQuality")
  private Boolean includeQuality = null;

  @SerializedName("replaceSpaces")
  private Boolean replaceSpaces = null;

  @SerializedName("id")
  private BigDecimal id = null;

  public ConfigNamingBody renameMovies(Boolean renameMovies) {
    this.renameMovies = renameMovies;
    return this;
  }

   /**
   * Get renameMovies
   * @return renameMovies
  **/
  @Schema(required = true, description = "")
  public Boolean isRenameMovies() {
    return renameMovies;
  }

  public void setRenameMovies(Boolean renameMovies) {
    this.renameMovies = renameMovies;
  }

  public ConfigNamingBody replaceIllegalCharacters(Boolean replaceIllegalCharacters) {
    this.replaceIllegalCharacters = replaceIllegalCharacters;
    return this;
  }

   /**
   * Get replaceIllegalCharacters
   * @return replaceIllegalCharacters
  **/
  @Schema(required = true, description = "")
  public Boolean isReplaceIllegalCharacters() {
    return replaceIllegalCharacters;
  }

  public void setReplaceIllegalCharacters(Boolean replaceIllegalCharacters) {
    this.replaceIllegalCharacters = replaceIllegalCharacters;
  }

  public ConfigNamingBody colonReplacementFormat(String colonReplacementFormat) {
    this.colonReplacementFormat = colonReplacementFormat;
    return this;
  }

   /**
   * Get colonReplacementFormat
   * @return colonReplacementFormat
  **/
  @Schema(required = true, description = "")
  public String getColonReplacementFormat() {
    return colonReplacementFormat;
  }

  public void setColonReplacementFormat(String colonReplacementFormat) {
    this.colonReplacementFormat = colonReplacementFormat;
  }

  public ConfigNamingBody standardMovieFormat(String standardMovieFormat) {
    this.standardMovieFormat = standardMovieFormat;
    return this;
  }

   /**
   * Get standardMovieFormat
   * @return standardMovieFormat
  **/
  @Schema(required = true, description = "")
  public String getStandardMovieFormat() {
    return standardMovieFormat;
  }

  public void setStandardMovieFormat(String standardMovieFormat) {
    this.standardMovieFormat = standardMovieFormat;
  }

  public ConfigNamingBody movieFolderFormat(String movieFolderFormat) {
    this.movieFolderFormat = movieFolderFormat;
    return this;
  }

   /**
   * Get movieFolderFormat
   * @return movieFolderFormat
  **/
  @Schema(required = true, description = "")
  public String getMovieFolderFormat() {
    return movieFolderFormat;
  }

  public void setMovieFolderFormat(String movieFolderFormat) {
    this.movieFolderFormat = movieFolderFormat;
  }

  public ConfigNamingBody includeQuality(Boolean includeQuality) {
    this.includeQuality = includeQuality;
    return this;
  }

   /**
   * Get includeQuality
   * @return includeQuality
  **/
  @Schema(required = true, description = "")
  public Boolean isIncludeQuality() {
    return includeQuality;
  }

  public void setIncludeQuality(Boolean includeQuality) {
    this.includeQuality = includeQuality;
  }

  public ConfigNamingBody replaceSpaces(Boolean replaceSpaces) {
    this.replaceSpaces = replaceSpaces;
    return this;
  }

   /**
   * Get replaceSpaces
   * @return replaceSpaces
  **/
  @Schema(required = true, description = "")
  public Boolean isReplaceSpaces() {
    return replaceSpaces;
  }

  public void setReplaceSpaces(Boolean replaceSpaces) {
    this.replaceSpaces = replaceSpaces;
  }

  public ConfigNamingBody id(BigDecimal id) {
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
    ConfigNamingBody configNamingBody = (ConfigNamingBody) o;
    return Objects.equals(this.renameMovies, configNamingBody.renameMovies) &&
        Objects.equals(this.replaceIllegalCharacters, configNamingBody.replaceIllegalCharacters) &&
        Objects.equals(this.colonReplacementFormat, configNamingBody.colonReplacementFormat) &&
        Objects.equals(this.standardMovieFormat, configNamingBody.standardMovieFormat) &&
        Objects.equals(this.movieFolderFormat, configNamingBody.movieFolderFormat) &&
        Objects.equals(this.includeQuality, configNamingBody.includeQuality) &&
        Objects.equals(this.replaceSpaces, configNamingBody.replaceSpaces) &&
        Objects.equals(this.id, configNamingBody.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renameMovies, replaceIllegalCharacters, colonReplacementFormat, standardMovieFormat, movieFolderFormat, includeQuality, replaceSpaces, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNamingBody {\n");
    
    sb.append("    renameMovies: ").append(toIndentedString(renameMovies)).append("\n");
    sb.append("    replaceIllegalCharacters: ").append(toIndentedString(replaceIllegalCharacters)).append("\n");
    sb.append("    colonReplacementFormat: ").append(toIndentedString(colonReplacementFormat)).append("\n");
    sb.append("    standardMovieFormat: ").append(toIndentedString(standardMovieFormat)).append("\n");
    sb.append("    movieFolderFormat: ").append(toIndentedString(movieFolderFormat)).append("\n");
    sb.append("    includeQuality: ").append(toIndentedString(includeQuality)).append("\n");
    sb.append("    replaceSpaces: ").append(toIndentedString(replaceSpaces)).append("\n");
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
