// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DaysOfWeek. */
public final class DaysOfWeek extends ExpandableStringEnum<DaysOfWeek> {
    /** Static value Monday for DaysOfWeek. */
    public static final DaysOfWeek MONDAY = fromString("Monday");

    /** Static value Tuesday for DaysOfWeek. */
    public static final DaysOfWeek TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for DaysOfWeek. */
    public static final DaysOfWeek WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for DaysOfWeek. */
    public static final DaysOfWeek THURSDAY = fromString("Thursday");

    /** Static value Friday for DaysOfWeek. */
    public static final DaysOfWeek FRIDAY = fromString("Friday");

    /** Static value Saturday for DaysOfWeek. */
    public static final DaysOfWeek SATURDAY = fromString("Saturday");

    /** Static value Sunday for DaysOfWeek. */
    public static final DaysOfWeek SUNDAY = fromString("Sunday");

    /**
     * Creates or finds a DaysOfWeek from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DaysOfWeek.
     */
    @JsonCreator
    public static DaysOfWeek fromString(String name) {
        return fromString(name, DaysOfWeek.class);
    }

    /** @return known DaysOfWeek values. */
    public static Collection<DaysOfWeek> values() {
        return values(DaysOfWeek.class);
    }
}
