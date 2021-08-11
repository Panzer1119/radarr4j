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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Indexer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-12T01:48:34.579+02:00[Europe/Berlin]")
public class Indexer {
  @SerializedName("enableRss")
  private Boolean enableRss = null;

  @SerializedName("enableAutomaticSearch")
  private Boolean enableAutomaticSearch = null;

  @SerializedName("enableInteractiveSearch")
  private Boolean enableInteractiveSearch = null;

  @SerializedName("supportsRss")
  private Boolean supportsRss = null;

  @SerializedName("supportsSearch")
  private Boolean supportsSearch = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("priority")
  private Integer priority = null;

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
  private List<Object> tags = new ArrayList<>();

  @SerializedName("id")
  private BigDecimal id = null;

  public Indexer enableRss(Boolean enableRss) {
    this.enableRss = enableRss;
    return this;
  }

   /**
   * Get enableRss
   * @return enableRss
  **/
  @Schema(required = true, description = "")
  public Boolean isEnableRss() {
    return enableRss;
  }

  public void setEnableRss(Boolean enableRss) {
    this.enableRss = enableRss;
  }

  public Indexer enableAutomaticSearch(Boolean enableAutomaticSearch) {
    this.enableAutomaticSearch = enableAutomaticSearch;
    return this;
  }

   /**
   * Get enableAutomaticSearch
   * @return enableAutomaticSearch
  **/
  @Schema(required = true, description = "")
  public Boolean isEnableAutomaticSearch() {
    return enableAutomaticSearch;
  }

  public void setEnableAutomaticSearch(Boolean enableAutomaticSearch) {
    this.enableAutomaticSearch = enableAutomaticSearch;
  }

  public Indexer enableInteractiveSearch(Boolean enableInteractiveSearch) {
    this.enableInteractiveSearch = enableInteractiveSearch;
    return this;
  }

   /**
   * Get enableInteractiveSearch
   * @return enableInteractiveSearch
  **/
  @Schema(required = true, description = "")
  public Boolean isEnableInteractiveSearch() {
    return enableInteractiveSearch;
  }

  public void setEnableInteractiveSearch(Boolean enableInteractiveSearch) {
    this.enableInteractiveSearch = enableInteractiveSearch;
  }

  public Indexer supportsRss(Boolean supportsRss) {
    this.supportsRss = supportsRss;
    return this;
  }

   /**
   * Get supportsRss
   * @return supportsRss
  **/
  @Schema(required = true, description = "")
  public Boolean isSupportsRss() {
    return supportsRss;
  }

  public void setSupportsRss(Boolean supportsRss) {
    this.supportsRss = supportsRss;
  }

  public Indexer supportsSearch(Boolean supportsSearch) {
    this.supportsSearch = supportsSearch;
    return this;
  }

   /**
   * Get supportsSearch
   * @return supportsSearch
  **/
  @Schema(required = true, description = "")
  public Boolean isSupportsSearch() {
    return supportsSearch;
  }

  public void setSupportsSearch(Boolean supportsSearch) {
    this.supportsSearch = supportsSearch;
  }

  public Indexer protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(required = true, description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public Indexer priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * minimum: 0
   * maximum: 50
   * @return priority
  **/
  @Schema(required = true, description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Indexer name(String name) {
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

  public Indexer fields(List<ProviderField> fields) {
    this.fields = fields;
    return this;
  }

  public Indexer addFieldsItem(ProviderField fieldsItem) {
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

  public Indexer implementationName(String implementationName) {
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

  public Indexer implementation(String implementation) {
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

  public Indexer configContract(String configContract) {
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

  public Indexer infoLink(String infoLink) {
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

  public Indexer tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public Indexer addTagsItem(Object tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(required = true, description = "")
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public Indexer id(BigDecimal id) {
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
    Indexer indexer = (Indexer) o;
    return Objects.equals(this.enableRss, indexer.enableRss) &&
        Objects.equals(this.enableAutomaticSearch, indexer.enableAutomaticSearch) &&
        Objects.equals(this.enableInteractiveSearch, indexer.enableInteractiveSearch) &&
        Objects.equals(this.supportsRss, indexer.supportsRss) &&
        Objects.equals(this.supportsSearch, indexer.supportsSearch) &&
        Objects.equals(this.protocol, indexer.protocol) &&
        Objects.equals(this.priority, indexer.priority) &&
        Objects.equals(this.name, indexer.name) &&
        Objects.equals(this.fields, indexer.fields) &&
        Objects.equals(this.implementationName, indexer.implementationName) &&
        Objects.equals(this.implementation, indexer.implementation) &&
        Objects.equals(this.configContract, indexer.configContract) &&
        Objects.equals(this.infoLink, indexer.infoLink) &&
        Objects.equals(this.tags, indexer.tags) &&
        Objects.equals(this.id, indexer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableRss, enableAutomaticSearch, enableInteractiveSearch, supportsRss, supportsSearch, protocol, priority, name, fields, implementationName, implementation, configContract, infoLink, tags, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indexer {\n");
    
    sb.append("    enableRss: ").append(toIndentedString(enableRss)).append("\n");
    sb.append("    enableAutomaticSearch: ").append(toIndentedString(enableAutomaticSearch)).append("\n");
    sb.append("    enableInteractiveSearch: ").append(toIndentedString(enableInteractiveSearch)).append("\n");
    sb.append("    supportsRss: ").append(toIndentedString(supportsRss)).append("\n");
    sb.append("    supportsSearch: ").append(toIndentedString(supportsSearch)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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