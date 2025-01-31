// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.FlowLogInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of flow logs. */
@Fluent
public final class FlowLogListResult {
    /*
     * Information about flow log resource.
     */
    @JsonProperty(value = "value")
    private List<FlowLogInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Information about flow log resource.
     *
     * @return the value value.
     */
    public List<FlowLogInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about flow log resource.
     *
     * @param value the value value to set.
     * @return the FlowLogListResult object itself.
     */
    public FlowLogListResult withValue(List<FlowLogInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
