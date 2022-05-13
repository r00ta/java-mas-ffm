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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroupAllOf
 */
@JsonPropertyOrder({
  AccountGroupAllOf.JSON_PROPERTY_CREATED_AT,
  AccountGroupAllOf.JSON_PROPERTY_DESCRIPTION,
  AccountGroupAllOf.JSON_PROPERTY_MANAGED_BY,
  AccountGroupAllOf.JSON_PROPERTY_NAME,
  AccountGroupAllOf.JSON_PROPERTY_ORGANIZATION_ID,
  AccountGroupAllOf.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-21T14:46:15.841437+02:00[Europe/Prague]")
public class AccountGroupAllOf {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets managedBy
   */
  public enum ManagedByEnum {
    SSO("SSO"),
    
    OCM("OCM");

    private String value;

    ManagedByEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ManagedByEnum fromValue(String value) {
      for (ManagedByEnum b : ManagedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MANAGED_BY = "managed_by";
  private ManagedByEnum managedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AccountGroupAllOf() { 
  }

  public AccountGroupAllOf createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AccountGroupAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AccountGroupAllOf managedBy(ManagedByEnum managedBy) {
    this.managedBy = managedBy;
    return this;
  }

   /**
   * Get managedBy
   * @return managedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MANAGED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ManagedByEnum getManagedBy() {
    return managedBy;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManagedBy(ManagedByEnum managedBy) {
    this.managedBy = managedBy;
  }


  public AccountGroupAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AccountGroupAllOf organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public AccountGroupAllOf updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this AccountGroup_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupAllOf accountGroupAllOf = (AccountGroupAllOf) o;
    return Objects.equals(this.createdAt, accountGroupAllOf.createdAt) &&
        Objects.equals(this.description, accountGroupAllOf.description) &&
        Objects.equals(this.managedBy, accountGroupAllOf.managedBy) &&
        Objects.equals(this.name, accountGroupAllOf.name) &&
        Objects.equals(this.organizationId, accountGroupAllOf.organizationId) &&
        Objects.equals(this.updatedAt, accountGroupAllOf.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, managedBy, name, organizationId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupAllOf {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

