// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.payload.multipart.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import java.util.List;

/**
 * The ComplexPartsRequest model.
 */
@Immutable
public final class ComplexPartsRequest {
    /*
     * The id property.
     */
    @Generated
    private final String id;

    /*
     * The address property.
     */
    @Generated
    private final Address address;

    /*
     * The profileImage property.
     */
    @Generated
    private final ProfileImageFileDetails profileImage;

    /*
     * The previousAddresses property.
     */
    @Generated
    private final List<Address> previousAddresses;

    /*
     * The pictures property.
     */
    @Generated
    private final List<PicturesFileDetails> pictures;

    /**
     * Creates an instance of ComplexPartsRequest class.
     * 
     * @param id the id value to set.
     * @param address the address value to set.
     * @param profileImage the profileImage value to set.
     * @param previousAddresses the previousAddresses value to set.
     * @param pictures the pictures value to set.
     */
    @Generated
    public ComplexPartsRequest(String id, Address address, ProfileImageFileDetails profileImage,
        List<Address> previousAddresses, List<PicturesFileDetails> pictures) {
        this.id = id;
        this.address = address;
        this.profileImage = profileImage;
        this.previousAddresses = previousAddresses;
        this.pictures = pictures;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the address property: The address property.
     * 
     * @return the address value.
     */
    @Generated
    public Address getAddress() {
        return this.address;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    @Generated
    public ProfileImageFileDetails getProfileImage() {
        return this.profileImage;
    }

    /**
     * Get the previousAddresses property: The previousAddresses property.
     * 
     * @return the previousAddresses value.
     */
    @Generated
    public List<Address> getPreviousAddresses() {
        return this.previousAddresses;
    }

    /**
     * Get the pictures property: The pictures property.
     * 
     * @return the pictures value.
     */
    @Generated
    public List<PicturesFileDetails> getPictures() {
        return this.pictures;
    }
}