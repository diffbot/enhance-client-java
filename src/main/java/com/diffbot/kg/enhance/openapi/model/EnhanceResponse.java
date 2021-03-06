/*
 * Diffbot Enhance Service
 * Enhance is an API to find a person or organization in the Knowledge Graph using partial data
 *
 * The version of the OpenAPI document: v1.0.0
 * Contact: support@diffbot.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.diffbot.kg.enhance.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnhanceResponse
 */

public class EnhanceResponse {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Object score;

  public static final String SERIALIZED_NAME_ENHANCED = "enhanced";
  @SerializedName(SERIALIZED_NAME_ENHANCED)
  private Object enhanced;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Object query;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private Object warnings;


  public EnhanceResponse score(Object score) {
    
    this.score = score;
    return this;
  }

   /**
   * Enhance score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enhance score")

  public Object getScore() {
    return score;
  }


  public void setScore(Object score) {
    this.score = score;
  }


  public EnhanceResponse enhanced(Object enhanced) {
    
    this.enhanced = enhanced;
    return this;
  }

   /**
   * Enhanced entity. Can be null if no entity was found.
   * @return enhanced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enhanced entity. Can be null if no entity was found.")

  public Object getEnhanced() {
    return enhanced;
  }


  public void setEnhanced(Object enhanced) {
    this.enhanced = enhanced;
  }


  public EnhanceResponse query(Object query) {
    
    this.query = query;
    return this;
  }

   /**
   * Submitted Enhance query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Submitted Enhance query")

  public Object getQuery() {
    return query;
  }


  public void setQuery(Object query) {
    this.query = query;
  }


  public EnhanceResponse warnings(Object warnings) {
    
    this.warnings = warnings;
    return this;
  }

   /**
   * Any warnings while enhancing entity
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any warnings while enhancing entity")

  public Object getWarnings() {
    return warnings;
  }


  public void setWarnings(Object warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhanceResponse enhanceResponse = (EnhanceResponse) o;
    return Objects.equals(this.score, enhanceResponse.score) &&
        Objects.equals(this.enhanced, enhanceResponse.enhanced) &&
        Objects.equals(this.query, enhanceResponse.query) &&
        Objects.equals(this.warnings, enhanceResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, enhanced, query, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhanceResponse {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    enhanced: ").append(toIndentedString(enhanced)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

