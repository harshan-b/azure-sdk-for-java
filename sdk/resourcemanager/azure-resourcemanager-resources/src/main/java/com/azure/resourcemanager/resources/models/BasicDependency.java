// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment dependency information. */
@Fluent
public final class BasicDependency {
    /*
     * The ID of the dependency.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The dependency resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The dependency resource name.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the id property: The ID of the dependency.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the dependency.
     *
     * @param id the id value to set.
     * @return the BasicDependency object itself.
     */
    public BasicDependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the resourceType property: The dependency resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The dependency resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the BasicDependency object itself.
     */
    public BasicDependency withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceName property: The dependency resource name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The dependency resource name.
     *
     * @param resourceName the resourceName value to set.
     * @return the BasicDependency object itself.
     */
    public BasicDependency withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
