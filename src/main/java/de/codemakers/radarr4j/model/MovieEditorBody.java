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
 * MovieEditorBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class MovieEditorBody {
  @SerializedName("movieIds")
  private List<Integer> movieIds = new ArrayList<>();

  @SerializedName("monitored")
  private Boolean monitored = null;

  @SerializedName("qualityProfileId")
  private Integer qualityProfileId = null;

  @SerializedName("minimumAvailability")
  private String minimumAvailability = null;

  @SerializedName("rootFolderPath")
  private String rootFolderPath = null;

  @SerializedName("tags")
  private List<Integer> tags = null;

  /**
   * Gets or Sets applyTags
   */
  @JsonAdapter(ApplyTagsEnum.Adapter.class)
  public enum ApplyTagsEnum {
    ADD("add"),
    REMOVE("remove"),
    REPLACE("replace");

    private String value;

    ApplyTagsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ApplyTagsEnum fromValue(String text) {
      for (ApplyTagsEnum b : ApplyTagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ApplyTagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplyTagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplyTagsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ApplyTagsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("applyTags")
  private ApplyTagsEnum applyTags = null;

  @SerializedName("moveFiles")
  private Boolean moveFiles = null;

  public MovieEditorBody movieIds(List<Integer> movieIds) {
    this.movieIds = movieIds;
    return this;
  }

  public MovieEditorBody addMovieIdsItem(Integer movieIdsItem) {
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

  public MovieEditorBody monitored(Boolean monitored) {
    this.monitored = monitored;
    return this;
  }

   /**
   * Get monitored
   * @return monitored
  **/
  @Schema(description = "")
  public Boolean isMonitored() {
    return monitored;
  }

  public void setMonitored(Boolean monitored) {
    this.monitored = monitored;
  }

  public MovieEditorBody qualityProfileId(Integer qualityProfileId) {
    this.qualityProfileId = qualityProfileId;
    return this;
  }

   /**
   * Get qualityProfileId
   * @return qualityProfileId
  **/
  @Schema(description = "")
  public Integer getQualityProfileId() {
    return qualityProfileId;
  }

  public void setQualityProfileId(Integer qualityProfileId) {
    this.qualityProfileId = qualityProfileId;
  }

  public MovieEditorBody minimumAvailability(String minimumAvailability) {
    this.minimumAvailability = minimumAvailability;
    return this;
  }

   /**
   * Get minimumAvailability
   * @return minimumAvailability
  **/
  @Schema(description = "")
  public String getMinimumAvailability() {
    return minimumAvailability;
  }

  public void setMinimumAvailability(String minimumAvailability) {
    this.minimumAvailability = minimumAvailability;
  }

  public MovieEditorBody rootFolderPath(String rootFolderPath) {
    this.rootFolderPath = rootFolderPath;
    return this;
  }

   /**
   * Get rootFolderPath
   * @return rootFolderPath
  **/
  @Schema(description = "")
  public String getRootFolderPath() {
    return rootFolderPath;
  }

  public void setRootFolderPath(String rootFolderPath) {
    this.rootFolderPath = rootFolderPath;
  }

  public MovieEditorBody tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public MovieEditorBody addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public MovieEditorBody applyTags(ApplyTagsEnum applyTags) {
    this.applyTags = applyTags;
    return this;
  }

   /**
   * Get applyTags
   * @return applyTags
  **/
  @Schema(description = "")
  public ApplyTagsEnum getApplyTags() {
    return applyTags;
  }

  public void setApplyTags(ApplyTagsEnum applyTags) {
    this.applyTags = applyTags;
  }

  public MovieEditorBody moveFiles(Boolean moveFiles) {
    this.moveFiles = moveFiles;
    return this;
  }

   /**
   * Get moveFiles
   * @return moveFiles
  **/
  @Schema(description = "")
  public Boolean isMoveFiles() {
    return moveFiles;
  }

  public void setMoveFiles(Boolean moveFiles) {
    this.moveFiles = moveFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieEditorBody movieEditorBody = (MovieEditorBody) o;
    return Objects.equals(this.movieIds, movieEditorBody.movieIds) &&
        Objects.equals(this.monitored, movieEditorBody.monitored) &&
        Objects.equals(this.qualityProfileId, movieEditorBody.qualityProfileId) &&
        Objects.equals(this.minimumAvailability, movieEditorBody.minimumAvailability) &&
        Objects.equals(this.rootFolderPath, movieEditorBody.rootFolderPath) &&
        Objects.equals(this.tags, movieEditorBody.tags) &&
        Objects.equals(this.applyTags, movieEditorBody.applyTags) &&
        Objects.equals(this.moveFiles, movieEditorBody.moveFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieIds, monitored, qualityProfileId, minimumAvailability, rootFolderPath, tags, applyTags, moveFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieEditorBody {\n");
    
    sb.append("    movieIds: ").append(toIndentedString(movieIds)).append("\n");
    sb.append("    monitored: ").append(toIndentedString(monitored)).append("\n");
    sb.append("    qualityProfileId: ").append(toIndentedString(qualityProfileId)).append("\n");
    sb.append("    minimumAvailability: ").append(toIndentedString(minimumAvailability)).append("\n");
    sb.append("    rootFolderPath: ").append(toIndentedString(rootFolderPath)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applyTags: ").append(toIndentedString(applyTags)).append("\n");
    sb.append("    moveFiles: ").append(toIndentedString(moveFiles)).append("\n");
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
