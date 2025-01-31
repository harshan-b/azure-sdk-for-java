// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of custom domain for API portal. */
@Fluent
public final class ApiPortalCustomDomainProperties {
    /*
     * The thumbprint of bound certificate.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Get the thumbprint property: The thumbprint of bound certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The thumbprint of bound certificate.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the ApiPortalCustomDomainProperties object itself.
     */
    public ApiPortalCustomDomainProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
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
