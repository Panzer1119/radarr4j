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
import de.codemakers.radarr4j.model.ProviderField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Metadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class Metadata {
  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fields")
  private List<ProviderField> fields = new ArrayList<>();

  @SerializedName("implementationName")
  private String implementationName = null;

  @SerializedName("implementation")
  private String implementation = null;

  @SerializedName("configContract")
  private String configContract = null;

  @SerializedName("infoLink")
  private String infoLink = null;

  @SerializedName("tags")
  private List<Integer> tags = new ArrayList<>();

  @SerializedName("id")
  private Integer id = null;

  public Metadata enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(required = true, description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public Metadata name(String name) {
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

  public Metadata fields(List<ProviderField> fields) {
    this.fields = fields;
    return this;
  }

  public Metadata addFieldsItem(ProviderField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @Schema(required = true, description = "")
  public List<ProviderField> getFields() {
    return fields;
  }

  public void setFields(List<ProviderField> fields) {
    this.fields = fields;
  }

  public Metadata implementationName(String implementationName) {
    this.implementationName = implementationName;
    return this;
  }

   /**
   * Get implementationName
   * @return implementationName
  **/
  @Schema(required = true, description = "")
  public String getImplementationName() {
    return implementationName;
  }

  public void setImplementationName(String implementationName) {
    this.implementationName = implementationName;
  }

  public Metadata implementation(String implementation) {
    this.implementation = implementation;
    return this;
  }

   /**
   * Get implementation
   * @return implementation
  **/
  @Schema(required = true, description = "")
  public String getImplementation() {
    return implementation;
  }

  public void setImplementation(String implementation) {
    this.implementation = implementation;
  }

  public Metadata configContract(String configContract) {
    this.configContract = configContract;
    return this;
  }

   /**
   * Get configContract
   * @return configContract
  **/
  @Schema(required = true, description = "")
  public String getConfigContract() {
    return configContract;
  }

  public void setConfigContract(String configContract) {
    this.configContract = configContract;
  }

  public Metadata infoLink(String infoLink) {
    this.infoLink = infoLink;
    return this;
  }

   /**
   * Get infoLink
   * @return infoLink
  **/
  @Schema(required = true, description = "")
  public String getInfoLink() {
    return infoLink;
  }

  public void setInfoLink(String infoLink) {
    this.infoLink = infoLink;
  }

  public Metadata tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public Metadata addTagsItem(Integer tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(required = true, description = "")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public Metadata id(Integer id) {
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
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.enable, metadata.enable) &&
        Objects.equals(this.name, metadata.name) &&
        Objects.equals(this.fields, metadata.fields) &&
        Objects.equals(this.implementationName, metadata.implementationName) &&
        Objects.equals(this.implementation, metadata.implementation) &&
        Objects.equals(this.configContract, metadata.configContract) &&
        Objects.equals(this.infoLink, metadata.infoLink) &&
        Objects.equals(this.tags, metadata.tags) &&
        Objects.equals(this.id, metadata.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, name, fields, implementationName, implementation, configContract, infoLink, tags, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    implementationName: ").append(toIndentedString(implementationName)).append("\n");
    sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
    sb.append("    configContract: ").append(toIndentedString(configContract)).append("\n");
    sb.append("    infoLink: ").append(toIndentedString(infoLink)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
