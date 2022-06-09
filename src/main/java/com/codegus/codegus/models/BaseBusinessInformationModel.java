package com.codegus.codegus.models;

import com.codegus.codegus.models.apply.User;
import javax.persistence.*;

@MappedSuperclass
public class BaseBusinessInformationModel<ID> extends BaseCommonModel<ID> {

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "service_opening_information")
    private String serviceOpeningInformation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

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

}
