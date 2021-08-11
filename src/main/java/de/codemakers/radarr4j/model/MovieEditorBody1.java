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
import java.util.ArrayList;
import java.util.List;
/**
 * MovieEditorBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class MovieEditorBody1 {
  @SerializedName("movieIds")
  private List<Integer> movieIds = new ArrayList<>();

  @SerializedName("deleteFIles")
  private Boolean deleteFIles = null;

  @SerializedName("addImportExclusion")
  private Boolean addImportExclusion = null;

  public MovieEditorBody1 movieIds(List<Integer> movieIds) {
    this.movieIds = movieIds;
    return this;
  }

  public MovieEditorBody1 addMovieIdsItem(Integer movieIdsItem) {
    this.movieIds.add(movieIdsItem);
    return this;
  }

   /**
   * Get movieIds
   * @return movieIds
  **/
  @Schema(required = true, description = "")
  public List<Integer> getMovieIds() {
    return movieIds;
  }

  public void setMovieIds(List<Integer> movieIds) {
    this.movieIds = movieIds;
  }

  public MovieEditorBody1 deleteFIles(Boolean deleteFIles) {
    this.deleteFIles = deleteFIles;
    return this;
  }

   /**
   * Get deleteFIles
   * @return deleteFIles
  **/
  @Schema(required = true, description = "")
  public Boolean isDeleteFIles() {
    return deleteFIles;
  }

  public void setDeleteFIles(Boolean deleteFIles) {
    this.deleteFIles = deleteFIles;
  }

  public MovieEditorBody1 addImportExclusion(Boolean addImportExclusion) {
    this.addImportExclusion = addImportExclusion;
    return this;
  }

   /**
   * Get addImportExclusion
   * @return addImportExclusion
  **/
  @Schema(required = true, description = "")
  public Boolean isAddImportExclusion() {
    return addImportExclusion;
  }

  public void setAddImportExclusion(Boolean addImportExclusion) {
    this.addImportExclusion = addImportExclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieEditorBody1 movieEditorBody1 = (MovieEditorBody1) o;
    return Objects.equals(this.movieIds, movieEditorBody1.movieIds) &&
        Objects.equals(this.deleteFIles, movieEditorBody1.deleteFIles) &&
        Objects.equals(this.addImportExclusion, movieEditorBody1.addImportExclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieIds, deleteFIles, addImportExclusion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieEditorBody1 {\n");
    
    sb.append("    movieIds: ").append(toIndentedString(movieIds)).append("\n");
    sb.append("    deleteFIles: ").append(toIndentedString(deleteFIles)).append("\n");
    sb.append("    addImportExclusion: ").append(toIndentedString(addImportExclusion)).append("\n");
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
