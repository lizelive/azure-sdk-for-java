/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Json write settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = JsonWriteSettings.class)
@JsonTypeName("JsonWriteSettings")
public class JsonWriteSettings extends FormatWriteSettings {
    /**
     * File pattern of JSON. This setting controls the way a collection of JSON
     * objects will be treated. The default value is 'setOfObjects'. It is
     * case-sensitive. Possible values include: 'setOfObjects',
     * 'arrayOfObjects'.
     */
    @JsonProperty(value = "filePattern")
    private JsonWriteFilePattern filePattern;

    /**
     * Get file pattern of JSON. This setting controls the way a collection of JSON objects will be treated. The default value is 'setOfObjects'. It is case-sensitive. Possible values include: 'setOfObjects', 'arrayOfObjects'.
     *
     * @return the filePattern value
     */
    public JsonWriteFilePattern filePattern() {
        return this.filePattern;
    }

    /**
     * Set file pattern of JSON. This setting controls the way a collection of JSON objects will be treated. The default value is 'setOfObjects'. It is case-sensitive. Possible values include: 'setOfObjects', 'arrayOfObjects'.
     *
     * @param filePattern the filePattern value to set
     * @return the JsonWriteSettings object itself.
     */
    public JsonWriteSettings withFilePattern(JsonWriteFilePattern filePattern) {
        this.filePattern = filePattern;
        return this;
    }

}
