package com.codegus.codegus.dtos.travelagency;

import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.models.apply.phones.TravelAgencyPhone;
import com.codegus.codegus.models.apply.socialmedia.TravelAgencySocialMedia;
import com.codegus.codegus.models.apply.User;

import java.util.List;

public class TravelAgencyRequest {

    private String name;

    private String imageUrl;

    private boolean isPublic;

    private String description;

    private String keyWords;

    private String category;

    private String email;

    private String website;

    private String serviceOpeningInformation;

    private User user;

    private List<TravelAgencyPhone> phones;

    private List<TravelAgencySocialMedia> socialMedia;

    private AddressDto address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getServiceOpeningInformation() {
        return serviceOpeningInformation;
    }

    public void setServiceOpeningInformation(String serviceOpeningInformation) {
        this.serviceOpeningInformation = serviceOpeningInformation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<TravelAgencyPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<TravelAgencyPhone> phones) {
        this.phones = phones;
    }

    public List<TravelAgencySocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<TravelAgencySocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }



}
