package com.codegus.codegus.models.socialmedia.dto;

import java.util.UUID;

public class SocialMediaItem {

    private UUID id;

    private String name;

    private String url;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
