package com.example.CRUD.model;

import com.example.CRUD.Validation.ValidCreatedBy;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

public class Album {

    @Id
    private String id;
    @Length(max = 10)
    public String name;
    @ValidCreatedBy
    public String createdBy;
    private String coverPicUrl, dateCreated;

    public Album(String name, String coverPicUrl, String createdBy, String dateCreated) {
        this.name = name;
        this.coverPicUrl = coverPicUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
