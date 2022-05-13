/*
 * Account Management Service API
 * Manage user subscriptions and clusters
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.redhat.services.ffm.amsclient.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.redhat.services.ffm.amsclient.models.LandingPageCTLItemShape;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LandingPageCTLItem
 */
@JsonPropertyOrder({
  LandingPageCTLItem.JSON_PROPERTY_SHAPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class LandingPageCTLItem {
  public static final String JSON_PROPERTY_SHAPE = "shape";
  private LandingPageCTLItemShape shape;

  public LandingPageCTLItem() { 
  }

  public LandingPageCTLItem shape(LandingPageCTLItemShape shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LandingPageCTLItemShape getShape() {
    return shape;
  }


  @JsonProperty(JSON_PROPERTY_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShape(LandingPageCTLItemShape shape) {
    this.shape = shape;
  }


  /**
   * Return true if this LandingPageCTLItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageCTLItem landingPageCTLItem = (LandingPageCTLItem) o;
    return Objects.equals(this.shape, landingPageCTLItem.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPageCTLItem {\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

