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
 * ConfigUiBody
 */

public class ConfigUiBody {
  @SerializedName("firstDayOfWeek")
  private Integer firstDayOfWeek = null;

  @SerializedName("calendarWeekColumnHeader")
  private String calendarWeekColumnHeader = null;

  /**
   * Gets or Sets movieRuntimeFormat
   */
  @JsonAdapter(MovieRuntimeFormatEnum.Adapter.class)
  public enum MovieRuntimeFormatEnum {
    HOURSMINUTES("hoursMinutes"),
    MINUTES("minutes");

    private String value;

    MovieRuntimeFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MovieRuntimeFormatEnum fromValue(String text) {
      for (MovieRuntimeFormatEnum b : MovieRuntimeFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MovieRuntimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MovieRuntimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MovieRuntimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MovieRuntimeFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("movieRuntimeFormat")
  private MovieRuntimeFormatEnum movieRuntimeFormat = null;

  @SerializedName("shortDateFormat")
  private String shortDateFormat = null;

  @SerializedName("longDateFormat")
  private String longDateFormat = null;

  @SerializedName("timeFormat")
  private String timeFormat = null;

  @SerializedName("showRelativeDates")
  private Boolean showRelativeDates = null;

  @SerializedName("enableColorImpairedMode")
  private Boolean enableColorImpairedMode = null;

  @SerializedName("movieInfoLanguage")
  private BigDecimal movieInfoLanguage = null;

  @SerializedName("id")
  private Integer id = null;

  public ConfigUiBody firstDayOfWeek(Integer firstDayOfWeek) {
    this.firstDayOfWeek = firstDayOfWeek;
    return this;
  }

   /**
   * Get firstDayOfWeek
   * @return firstDayOfWeek
  **/
  @Schema(description = "")
  public Integer getFirstDayOfWeek() {
    return firstDayOfWeek;
  }

  public void setFirstDayOfWeek(Integer firstDayOfWeek) {
    this.firstDayOfWeek = firstDayOfWeek;
  }

  public ConfigUiBody calendarWeekColumnHeader(String calendarWeekColumnHeader) {
    this.calendarWeekColumnHeader = calendarWeekColumnHeader;
    return this;
  }

   /**
   * Get calendarWeekColumnHeader
   * @return calendarWeekColumnHeader
  **/
  @Schema(description = "")
  public String getCalendarWeekColumnHeader() {
    return calendarWeekColumnHeader;
  }

  public void setCalendarWeekColumnHeader(String calendarWeekColumnHeader) {
    this.calendarWeekColumnHeader = calendarWeekColumnHeader;
  }

  public ConfigUiBody movieRuntimeFormat(MovieRuntimeFormatEnum movieRuntimeFormat) {
    this.movieRuntimeFormat = movieRuntimeFormat;
    return this;
  }

   /**
   * Get movieRuntimeFormat
   * @return movieRuntimeFormat
  **/
  @Schema(description = "")
  public MovieRuntimeFormatEnum getMovieRuntimeFormat() {
    return movieRuntimeFormat;
  }

  public void setMovieRuntimeFormat(MovieRuntimeFormatEnum movieRuntimeFormat) {
    this.movieRuntimeFormat = movieRuntimeFormat;
  }

  public ConfigUiBody shortDateFormat(String shortDateFormat) {
    this.shortDateFormat = shortDateFormat;
    return this;
  }

   /**
   * Get shortDateFormat
   * @return shortDateFormat
  **/
  @Schema(description = "")
  public String getShortDateFormat() {
    return shortDateFormat;
  }

  public void setShortDateFormat(String shortDateFormat) {
    this.shortDateFormat = shortDateFormat;
  }

  public ConfigUiBody longDateFormat(String longDateFormat) {
    this.longDateFormat = longDateFormat;
    return this;
  }

   /**
   * Get longDateFormat
   * @return longDateFormat
  **/
  @Schema(description = "")
  public String getLongDateFormat() {
    return longDateFormat;
  }

  public void setLongDateFormat(String longDateFormat) {
    this.longDateFormat = longDateFormat;
  }

  public ConfigUiBody timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * Get timeFormat
   * @return timeFormat
  **/
  @Schema(description = "")
  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public ConfigUiBody showRelativeDates(Boolean showRelativeDates) {
    this.showRelativeDates = showRelativeDates;
    return this;
  }

   /**
   * Get showRelativeDates
   * @return showRelativeDates
  **/
  @Schema(description = "")
  public Boolean isShowRelativeDates() {
    return showRelativeDates;
  }

  public void setShowRelativeDates(Boolean showRelativeDates) {
    this.showRelativeDates = showRelativeDates;
  }

  public ConfigUiBody enableColorImpairedMode(Boolean enableColorImpairedMode) {
    this.enableColorImpairedMode = enableColorImpairedMode;
    return this;
  }

   /**
   * Get enableColorImpairedMode
   * @return enableColorImpairedMode
  **/
  @Schema(description = "")
  public Boolean isEnableColorImpairedMode() {
    return enableColorImpairedMode;
  }

  public void setEnableColorImpairedMode(Boolean enableColorImpairedMode) {
    this.enableColorImpairedMode = enableColorImpairedMode;
  }

  public ConfigUiBody movieInfoLanguage(BigDecimal movieInfoLanguage) {
    this.movieInfoLanguage = movieInfoLanguage;
    return this;
  }

   /**
   * Get movieInfoLanguage
   * @return movieInfoLanguage
  **/
  @Schema(description = "")
  public BigDecimal getMovieInfoLanguage() {
    return movieInfoLanguage;
  }

  public void setMovieInfoLanguage(BigDecimal movieInfoLanguage) {
    this.movieInfoLanguage = movieInfoLanguage;
  }

  public ConfigUiBody id(Integer id) {
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
    ConfigUiBody configUiBody = (ConfigUiBody) o;
    return Objects.equals(this.firstDayOfWeek, configUiBody.firstDayOfWeek) &&
        Objects.equals(this.calendarWeekColumnHeader, configUiBody.calendarWeekColumnHeader) &&
        Objects.equals(this.movieRuntimeFormat, configUiBody.movieRuntimeFormat) &&
        Objects.equals(this.shortDateFormat, configUiBody.shortDateFormat) &&
        Objects.equals(this.longDateFormat, configUiBody.longDateFormat) &&
        Objects.equals(this.timeFormat, configUiBody.timeFormat) &&
        Objects.equals(this.showRelativeDates, configUiBody.showRelativeDates) &&
        Objects.equals(this.enableColorImpairedMode, configUiBody.enableColorImpairedMode) &&
        Objects.equals(this.movieInfoLanguage, configUiBody.movieInfoLanguage) &&
        Objects.equals(this.id, configUiBody.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDayOfWeek, calendarWeekColumnHeader, movieRuntimeFormat, shortDateFormat, longDateFormat, timeFormat, showRelativeDates, enableColorImpairedMode, movieInfoLanguage, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigUiBody {\n");
    
    sb.append("    firstDayOfWeek: ").append(toIndentedString(firstDayOfWeek)).append("\n");
    sb.append("    calendarWeekColumnHeader: ").append(toIndentedString(calendarWeekColumnHeader)).append("\n");
    sb.append("    movieRuntimeFormat: ").append(toIndentedString(movieRuntimeFormat)).append("\n");
    sb.append("    shortDateFormat: ").append(toIndentedString(shortDateFormat)).append("\n");
    sb.append("    longDateFormat: ").append(toIndentedString(longDateFormat)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    showRelativeDates: ").append(toIndentedString(showRelativeDates)).append("\n");
    sb.append("    enableColorImpairedMode: ").append(toIndentedString(enableColorImpairedMode)).append("\n");
    sb.append("    movieInfoLanguage: ").append(toIndentedString(movieInfoLanguage)).append("\n");
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
