/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The ScreenTextOptionalParameter model.
 */
public class ScreenTextOptionalParameter {
    /**
     * Language of the text.
     */
    private String language;

    /**
     * Autocorrect text.
     */
    private Boolean autocorrect;

    /**
     * Detect personal identifiable information.
     */
    private Boolean pII;

    /**
     * The list Id.
     */
    private String listId;

    /**
     * Classify input.
     */
    private Boolean classify;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the autocorrect value.
     *
     * @return the autocorrect value
     */
    public Boolean autocorrect() {
        return this.autocorrect;
    }

    /**
     * Set the autocorrect value.
     *
     * @param autocorrect the autocorrect value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withAutocorrect(Boolean autocorrect) {
        this.autocorrect = autocorrect;
        return this;
    }

    /**
     * Get the pII value.
     *
     * @return the pII value
     */
    public Boolean pII() {
        return this.pII;
    }

    /**
     * Set the pII value.
     *
     * @param pII the pII value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withPII(Boolean pII) {
        this.pII = pII;
        return this;
    }

    /**
     * Get the listId value.
     *
     * @return the listId value
     */
    public String listId() {
        return this.listId;
    }

    /**
     * Set the listId value.
     *
     * @param listId the listId value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * Get the classify value.
     *
     * @return the classify value
     */
    public Boolean classify() {
        return this.classify;
    }

    /**
     * Set the classify value.
     *
     * @param classify the classify value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withClassify(Boolean classify) {
        this.classify = classify;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the ScreenTextOptionalParameter object itself.
     */
    public ScreenTextOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}