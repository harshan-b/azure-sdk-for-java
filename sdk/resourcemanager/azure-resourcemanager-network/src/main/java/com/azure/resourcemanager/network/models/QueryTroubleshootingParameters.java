// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the resource to query the troubleshooting result. */
@Fluent
public final class QueryTroubleshootingParameters {
    /*
     * The target resource ID to query the troubleshooting result.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get the targetResourceId property: The target resource ID to query the troubleshooting result.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource ID to query the troubleshooting result.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the QueryTroubleshootingParameters object itself.
     */
    public QueryTroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model QueryTroubleshootingParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryTroubleshootingParameters.class);
}
