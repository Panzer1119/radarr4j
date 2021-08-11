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
import de.codemakers.radarr4j.model.CustomFormatSpecifications;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomFormat
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class CustomFormat {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("includeCustomFormatWhenRenaming")
  private Boolean includeCustomFormatWhenRenaming = null;

  @SerializedName("specifications")
  private List<CustomFormatSpecifications> specifications = new ArrayList<>();

  public CustomFormat id(Integer id) {
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

  public CustomFormat name(String name) {
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

  public CustomFormat includeCustomFormatWhenRenaming(Boolean includeCustomFormatWhenRenaming) {
    this.includeCustomFormatWhenRenaming = includeCustomFormatWhenRenaming;
    return this;
  }

   /**
   * Get includeCustomFormatWhenRenaming
   * @return includeCustomFormatWhenRenaming
  **/
  @Schema(required = true, description = "")
  public Boolean isIncludeCustomFormatWhenRenaming() {
    return includeCustomFormatWhenRenaming;
  }

  public void setIncludeCustomFormatWhenRenaming(Boolean includeCustomFormatWhenRenaming) {
    this.includeCustomFormatWhenRenaming = includeCustomFormatWhenRenaming;
  }

  public CustomFormat specifications(List<CustomFormatSpecifications> specifications) {
    this.specifications = specifications;
    return this;
  }

  public CustomFormat addSpecificationsItem(CustomFormatSpecifications specificationsItem) {
    this.specifications.add(specificationsItem);
    return this;
  }

   /**
   * Get specifications
   * @return specifications
  **/
  @Schema(required = true, description = "")
  public List<CustomFormatSpecifications> getSpecifications() {
    return specifications;
  }

  public void setSpecifications(List<CustomFormatSpecifications> specifications) {
    this.specifications = specifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormat customFormat = (CustomFormat) o;
    return Objects.equals(this.id, customFormat.id) &&
        Objects.equals(this.name, customFormat.name) &&
        Objects.equals(this.includeCustomFormatWhenRenaming, customFormat.includeCustomFormatWhenRenaming) &&
        Objects.equals(this.specifications, customFormat.specifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, includeCustomFormatWhenRenaming, specifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    includeCustomFormatWhenRenaming: ").append(toIndentedString(includeCustomFormatWhenRenaming)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
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