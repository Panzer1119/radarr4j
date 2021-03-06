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
import de.codemakers.radarr4j.model.Collection;
import de.codemakers.radarr4j.model.Image;
import de.codemakers.radarr4j.model.Rating;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Movie
 */

public class Movie {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("sortTitle")
  private String sortTitle = null;

  @SerializedName("sizeOnDisk")
  private BigDecimal sizeOnDisk = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("inCinemas")
  private String inCinemas = null;

  @SerializedName("physicalRelease")
  private String physicalRelease = null;

  @SerializedName("images")
  private List<Image> images = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("year")
  private Integer year = null;

  @SerializedName("hasFile")
  private Boolean hasFile = null;

  @SerializedName("youTubeTrailerId")
  private String youTubeTrailerId = null;

  @SerializedName("studio")
  private String studio = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("rootFolderPath")
  private String rootFolderPath = null;

  @SerializedName("qualityProfileId")
  private Integer qualityProfileId = null;

  @SerializedName("monitored")
  private Boolean monitored = null;

  /**
   * Gets or Sets minimumAvailability
   */
  @JsonAdapter(MinimumAvailabilityEnum.Adapter.class)
  public enum MinimumAvailabilityEnum {
    ANNOUNCED("announced"),
    INCINEMA("inCinema"),
    RELEASED("released");

    private String value;

    MinimumAvailabilityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MinimumAvailabilityEnum fromValue(String text) {
      for (MinimumAvailabilityEnum b : MinimumAvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MinimumAvailabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinimumAvailabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinimumAvailabilityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MinimumAvailabilityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("minimumAvailability")
  private MinimumAvailabilityEnum minimumAvailability = null;

  @SerializedName("isAvailable")
  private Boolean isAvailable = null;

  @SerializedName("folderName")
  private String folderName = null;

  @SerializedName("runtime")
  private Integer runtime = null;

  @SerializedName("cleanTitle")
  private String cleanTitle = null;

  @SerializedName("imdbId")
  private String imdbId = null;

  @SerializedName("tmdbId")
  private Integer tmdbId = null;

  @SerializedName("titleSlug")
  private String titleSlug = null;

  @SerializedName("certification")
  private String certification = null;

  @SerializedName("genres")
  private List<String> genres = null;

  @SerializedName("tags")
  private List<Integer> tags = null;

  @SerializedName("added")
  private String added = null;

  @SerializedName("ratings")
  private Rating ratings = null;

  @SerializedName("collection")
  private Collection collection = null;

  /**
   * movie status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DELETED("deleted"),
    TBA("tba"),
    ANNOUNCED("announced"),
    INCINEMA("inCinema"),
    RELEASED("released");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  public Movie id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Movie title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(example = "Dark Phoenix", required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Movie sortTitle(String sortTitle) {
    this.sortTitle = sortTitle;
    return this;
  }

   /**
   * Get sortTitle
   * @return sortTitle
  **/
  @Schema(example = "dark phoenix", description = "")
  public String getSortTitle() {
    return sortTitle;
  }

  public void setSortTitle(String sortTitle) {
    this.sortTitle = sortTitle;
  }

  public Movie sizeOnDisk(BigDecimal sizeOnDisk) {
    this.sizeOnDisk = sizeOnDisk;
    return this;
  }

   /**
   * Get sizeOnDisk
   * @return sizeOnDisk
  **/
  @Schema(description = "")
  public BigDecimal getSizeOnDisk() {
    return sizeOnDisk;
  }

  public void setSizeOnDisk(BigDecimal sizeOnDisk) {
    this.sizeOnDisk = sizeOnDisk;
  }

  public Movie overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public Movie inCinemas(String inCinemas) {
    this.inCinemas = inCinemas;
    return this;
  }

   /**
   * Get inCinemas
   * @return inCinemas
  **/
  @Schema(description = "")
  public String getInCinemas() {
    return inCinemas;
  }

  public void setInCinemas(String inCinemas) {
    this.inCinemas = inCinemas;
  }

  public Movie physicalRelease(String physicalRelease) {
    this.physicalRelease = physicalRelease;
    return this;
  }

   /**
   * Get physicalRelease
   * @return physicalRelease
  **/
  @Schema(description = "")
  public String getPhysicalRelease() {
    return physicalRelease;
  }

  public void setPhysicalRelease(String physicalRelease) {
    this.physicalRelease = physicalRelease;
  }

  public Movie images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Movie addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @Schema(description = "")
  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public Movie website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(example = "http://darkphoenix.com", description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Movie year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Movie hasFile(Boolean hasFile) {
    this.hasFile = hasFile;
    return this;
  }

   /**
   * Get hasFile
   * @return hasFile
  **/
  @Schema(description = "")
  public Boolean isHasFile() {
    return hasFile;
  }

  public void setHasFile(Boolean hasFile) {
    this.hasFile = hasFile;
  }

  public Movie youTubeTrailerId(String youTubeTrailerId) {
    this.youTubeTrailerId = youTubeTrailerId;
    return this;
  }

   /**
   * Get youTubeTrailerId
   * @return youTubeTrailerId
  **/
  @Schema(description = "")
  public String getYouTubeTrailerId() {
    return youTubeTrailerId;
  }

  public void setYouTubeTrailerId(String youTubeTrailerId) {
    this.youTubeTrailerId = youTubeTrailerId;
  }

  public Movie studio(String studio) {
    this.studio = studio;
    return this;
  }

   /**
   * Get studio
   * @return studio
  **/
  @Schema(description = "")
  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public Movie path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Movie rootFolderPath(String rootFolderPath) {
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

  public Movie qualityProfileId(Integer qualityProfileId) {
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

  public Movie monitored(Boolean monitored) {
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

  public Movie minimumAvailability(MinimumAvailabilityEnum minimumAvailability) {
    this.minimumAvailability = minimumAvailability;
    return this;
  }

   /**
   * Get minimumAvailability
   * @return minimumAvailability
  **/
  @Schema(description = "")
  public MinimumAvailabilityEnum getMinimumAvailability() {
    return minimumAvailability;
  }

  public void setMinimumAvailability(MinimumAvailabilityEnum minimumAvailability) {
    this.minimumAvailability = minimumAvailability;
  }

  public Movie isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Get isAvailable
   * @return isAvailable
  **/
  @Schema(description = "")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public Movie folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

   /**
   * Get folderName
   * @return folderName
  **/
  @Schema(description = "")
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public Movie runtime(Integer runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @Schema(description = "")
  public Integer getRuntime() {
    return runtime;
  }

  public void setRuntime(Integer runtime) {
    this.runtime = runtime;
  }

  public Movie cleanTitle(String cleanTitle) {
    this.cleanTitle = cleanTitle;
    return this;
  }

   /**
   * Get cleanTitle
   * @return cleanTitle
  **/
  @Schema(description = "")
  public String getCleanTitle() {
    return cleanTitle;
  }

  public void setCleanTitle(String cleanTitle) {
    this.cleanTitle = cleanTitle;
  }

  public Movie imdbId(String imdbId) {
    this.imdbId = imdbId;
    return this;
  }

   /**
   * Get imdbId
   * @return imdbId
  **/
  @Schema(description = "")
  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public Movie tmdbId(Integer tmdbId) {
    this.tmdbId = tmdbId;
    return this;
  }

   /**
   * Get tmdbId
   * @return tmdbId
  **/
  @Schema(description = "")
  public Integer getTmdbId() {
    return tmdbId;
  }

  public void setTmdbId(Integer tmdbId) {
    this.tmdbId = tmdbId;
  }

  public Movie titleSlug(String titleSlug) {
    this.titleSlug = titleSlug;
    return this;
  }

   /**
   * Get titleSlug
   * @return titleSlug
  **/
  @Schema(description = "")
  public String getTitleSlug() {
    return titleSlug;
  }

  public void setTitleSlug(String titleSlug) {
    this.titleSlug = titleSlug;
  }

  public Movie certification(String certification) {
    this.certification = certification;
    return this;
  }

   /**
   * Get certification
   * @return certification
  **/
  @Schema(description = "")
  public String getCertification() {
    return certification;
  }

  public void setCertification(String certification) {
    this.certification = certification;
  }

  public Movie genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public Movie addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @Schema(description = "")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public Movie tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public Movie addTagsItem(Integer tagsItem) {
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

  public Movie added(String added) {
    this.added = added;
    return this;
  }

   /**
   * Get added
   * @return added
  **/
  @Schema(description = "")
  public String getAdded() {
    return added;
  }

  public void setAdded(String added) {
    this.added = added;
  }

  public Movie ratings(Rating ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/
  @Schema(description = "")
  public Rating getRatings() {
    return ratings;
  }

  public void setRatings(Rating ratings) {
    this.ratings = ratings;
  }

  public Movie collection(Collection collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @Schema(description = "")
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  public Movie status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * movie status
   * @return status
  **/
  @Schema(description = "movie status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(this.id, movie.id) &&
        Objects.equals(this.title, movie.title) &&
        Objects.equals(this.sortTitle, movie.sortTitle) &&
        Objects.equals(this.sizeOnDisk, movie.sizeOnDisk) &&
        Objects.equals(this.overview, movie.overview) &&
        Objects.equals(this.inCinemas, movie.inCinemas) &&
        Objects.equals(this.physicalRelease, movie.physicalRelease) &&
        Objects.equals(this.images, movie.images) &&
        Objects.equals(this.website, movie.website) &&
        Objects.equals(this.year, movie.year) &&
        Objects.equals(this.hasFile, movie.hasFile) &&
        Objects.equals(this.youTubeTrailerId, movie.youTubeTrailerId) &&
        Objects.equals(this.studio, movie.studio) &&
        Objects.equals(this.path, movie.path) &&
        Objects.equals(this.rootFolderPath, movie.rootFolderPath) &&
        Objects.equals(this.qualityProfileId, movie.qualityProfileId) &&
        Objects.equals(this.monitored, movie.monitored) &&
        Objects.equals(this.minimumAvailability, movie.minimumAvailability) &&
        Objects.equals(this.isAvailable, movie.isAvailable) &&
        Objects.equals(this.folderName, movie.folderName) &&
        Objects.equals(this.runtime, movie.runtime) &&
        Objects.equals(this.cleanTitle, movie.cleanTitle) &&
        Objects.equals(this.imdbId, movie.imdbId) &&
        Objects.equals(this.tmdbId, movie.tmdbId) &&
        Objects.equals(this.titleSlug, movie.titleSlug) &&
        Objects.equals(this.certification, movie.certification) &&
        Objects.equals(this.genres, movie.genres) &&
        Objects.equals(this.tags, movie.tags) &&
        Objects.equals(this.added, movie.added) &&
        Objects.equals(this.ratings, movie.ratings) &&
        Objects.equals(this.collection, movie.collection) &&
        Objects.equals(this.status, movie.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, sortTitle, sizeOnDisk, overview, inCinemas, physicalRelease, images, website, year, hasFile, youTubeTrailerId, studio, path, rootFolderPath, qualityProfileId, monitored, minimumAvailability, isAvailable, folderName, runtime, cleanTitle, imdbId, tmdbId, titleSlug, certification, genres, tags, added, ratings, collection, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sortTitle: ").append(toIndentedString(sortTitle)).append("\n");
    sb.append("    sizeOnDisk: ").append(toIndentedString(sizeOnDisk)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    inCinemas: ").append(toIndentedString(inCinemas)).append("\n");
    sb.append("    physicalRelease: ").append(toIndentedString(physicalRelease)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    hasFile: ").append(toIndentedString(hasFile)).append("\n");
    sb.append("    youTubeTrailerId: ").append(toIndentedString(youTubeTrailerId)).append("\n");
    sb.append("    studio: ").append(toIndentedString(studio)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rootFolderPath: ").append(toIndentedString(rootFolderPath)).append("\n");
    sb.append("    qualityProfileId: ").append(toIndentedString(qualityProfileId)).append("\n");
    sb.append("    monitored: ").append(toIndentedString(monitored)).append("\n");
    sb.append("    minimumAvailability: ").append(toIndentedString(minimumAvailability)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    cleanTitle: ").append(toIndentedString(cleanTitle)).append("\n");
    sb.append("    imdbId: ").append(toIndentedString(imdbId)).append("\n");
    sb.append("    tmdbId: ").append(toIndentedString(tmdbId)).append("\n");
    sb.append("    titleSlug: ").append(toIndentedString(titleSlug)).append("\n");
    sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
