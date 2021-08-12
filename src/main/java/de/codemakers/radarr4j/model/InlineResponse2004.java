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
 * InlineResponse2004
 */

public class InlineResponse2004 {
  @SerializedName("firstDayOfWeek")
  private Integer firstDayOfWeek = null;

  @SerializedName("calendarWeekColumnHeader")
  private String calendarWeekColumnHeader = null;

  @SerializedName("movieRuntimeFormat")
  private String movieRuntimeFormat = null;

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
  private Integer movieInfoLanguage = null;

  @SerializedName("id")
  private Integer id = null;

  public InlineResponse2004 firstDayOfWeek(Integer firstDayOfWeek) {
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

  public InlineResponse2004 calendarWeekColumnHeader(String calendarWeekColumnHeader) {
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

  public InlineResponse2004 movieRuntimeFormat(String movieRuntimeFormat) {
    this.movieRuntimeFormat = movieRuntimeFormat;
    return this;
  }

   /**
   * Get movieRuntimeFormat
   * @return movieRuntimeFormat
  **/
  @Schema(description = "")
  public String getMovieRuntimeFormat() {
    return movieRuntimeFormat;
  }

  public void setMovieRuntimeFormat(String movieRuntimeFormat) {
    this.movieRuntimeFormat = movieRuntimeFormat;
  }

  public InlineResponse2004 shortDateFormat(String shortDateFormat) {
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

  public InlineResponse2004 longDateFormat(String longDateFormat) {
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

  public InlineResponse2004 timeFormat(String timeFormat) {
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

  public InlineResponse2004 showRelativeDates(Boolean showRelativeDates) {
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

  public InlineResponse2004 enableColorImpairedMode(Boolean enableColorImpairedMode) {
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

  public InlineResponse2004 movieInfoLanguage(Integer movieInfoLanguage) {
    this.movieInfoLanguage = movieInfoLanguage;
    return this;
  }

   /**
   * Get movieInfoLanguage
   * @return movieInfoLanguage
  **/
  @Schema(description = "")
  public Integer getMovieInfoLanguage() {
    return movieInfoLanguage;
  }

  public void setMovieInfoLanguage(Integer movieInfoLanguage) {
    this.movieInfoLanguage = movieInfoLanguage;
  }

  public InlineResponse2004 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
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
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.firstDayOfWeek, inlineResponse2004.firstDayOfWeek) &&
        Objects.equals(this.calendarWeekColumnHeader, inlineResponse2004.calendarWeekColumnHeader) &&
        Objects.equals(this.movieRuntimeFormat, inlineResponse2004.movieRuntimeFormat) &&
        Objects.equals(this.shortDateFormat, inlineResponse2004.shortDateFormat) &&
        Objects.equals(this.longDateFormat, inlineResponse2004.longDateFormat) &&
        Objects.equals(this.timeFormat, inlineResponse2004.timeFormat) &&
        Objects.equals(this.showRelativeDates, inlineResponse2004.showRelativeDates) &&
        Objects.equals(this.enableColorImpairedMode, inlineResponse2004.enableColorImpairedMode) &&
        Objects.equals(this.movieInfoLanguage, inlineResponse2004.movieInfoLanguage) &&
        Objects.equals(this.id, inlineResponse2004.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDayOfWeek, calendarWeekColumnHeader, movieRuntimeFormat, shortDateFormat, longDateFormat, timeFormat, showRelativeDates, enableColorImpairedMode, movieInfoLanguage, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
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
