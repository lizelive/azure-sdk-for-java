/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A CNAME record.
 */
public class CnameRecord {
    /**
     * The canonical name for this CNAME record.
     */
    @JsonProperty(value = "cname")
    private String cname;

    /**
     * Get the canonical name for this CNAME record.
     *
     * @return the cname value
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Set the canonical name for this CNAME record.
     *
     * @param cname the cname value to set
     * @return the CnameRecord object itself.
     */
    public CnameRecord withCname(String cname) {
        this.cname = cname;
        return this;
    }

}
