// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a cloud service extension profile. */
@Fluent
public final class CloudServiceExtensionProfile {
    /*
     * List of extensions for the cloud service.
     */
    @JsonProperty(value = "extensions")
    private List<Extension> extensions;

    /**
     * Get the extensions property: List of extensions for the cloud service.
     *
     * @return the extensions value.
     */
    public List<Extension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: List of extensions for the cloud service.
     *
     * @param extensions the extensions value to set.
     * @return the CloudServiceExtensionProfile object itself.
     */
    public CloudServiceExtensionProfile withExtensions(List<Extension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
