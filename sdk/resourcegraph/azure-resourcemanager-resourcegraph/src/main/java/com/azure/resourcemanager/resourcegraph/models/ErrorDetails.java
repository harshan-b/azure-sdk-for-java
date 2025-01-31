// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Error details. */
@Fluent
public final class ErrorDetails {
    /*
     * Error code identifying the specific error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human readable error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error details.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the code property: Error code identifying the specific error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code identifying the specific error.
     *
     * @param code the code value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A human readable error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A human readable error message.
     *
     * @param message the message value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the additionalProperties property: Error details.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Error details.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property code in model ErrorDetails"));
        }
        if (message() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property message in model ErrorDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ErrorDetails.class);
}
