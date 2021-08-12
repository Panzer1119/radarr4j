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
import de.codemakers.radarr4j.model.Blacklist;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2006
 */

public class InlineResponse2006 {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("sortDirection")
  private String sortDirection = null;

  @SerializedName("sortKey")
  private String sortKey = null;

  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  @SerializedName("records")
  private List<Blacklist> records = null;

  public InlineResponse2006 page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * 1
   * @return page
  **/
  @Schema(required = true, description = "1")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public InlineResponse2006 pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 20
   * @return pageSize
  **/
  @Schema(required = true, description = "20")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public InlineResponse2006 sortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * descending
   * @return sortDirection
  **/
  @Schema(required = true, description = "descending")
  public String getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
  }

  public InlineResponse2006 sortKey(String sortKey) {
    this.sortKey = sortKey;
    return this;
  }

   /**
   * date
   * @return sortKey
  **/
  @Schema(required = true, description = "date")
  public String getSortKey() {
    return sortKey;
  }

  public void setSortKey(String sortKey) {
    this.sortKey = sortKey;
  }

  public InlineResponse2006 totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Get totalRecords
   * @return totalRecords
  **/
  @Schema(description = "")
  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public InlineResponse2006 records(List<Blacklist> records) {
    this.records = records;
    return this;
  }

  public InlineResponse2006 addRecordsItem(Blacklist recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @Schema(description = "")
  public List<Blacklist> getRecords() {
    return records;
  }

  public void setRecords(List<Blacklist> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.page, inlineResponse2006.page) &&
        Objects.equals(this.pageSize, inlineResponse2006.pageSize) &&
        Objects.equals(this.sortDirection, inlineResponse2006.sortDirection) &&
        Objects.equals(this.sortKey, inlineResponse2006.sortKey) &&
        Objects.equals(this.totalRecords, inlineResponse2006.totalRecords) &&
        Objects.equals(this.records, inlineResponse2006.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, sortDirection, sortKey, totalRecords, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
