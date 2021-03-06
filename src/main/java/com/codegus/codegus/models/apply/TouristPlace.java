package com.codegus.codegus.models.apply;

import com.codegus.codegus.models.BaseCommonModel;
import com.codegus.codegus.models.apply.address.TouristPlaceAddress;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tourist_places")
public class TouristPlace extends BaseCommonModel<UUID> {

    @Column(name = "category")
    private String category;

    @Column(name = "resume")
    private String resume;

    @OneToMany(mappedBy = "touristPlace", fetch = FetchType.EAGER)
    private List<Like> likes;

    @OneToMany(mappedBy = "touristPlace")
    private List<TouristPlaceAddress> addresses;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Like> getVotes() {
        return likes;
    }

    public void setVotes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<TouristPlaceAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<TouristPlaceAddress> addresses) {
        this.addresses = addresses;
    }

}
