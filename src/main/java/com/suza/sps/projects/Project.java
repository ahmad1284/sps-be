package com.suza.sps.projects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
    private @Id @GeneratedValue Long id;
    private String name;

    private String description;
    private String githubUrl;
    private String webPageUrl;
    private String photoUrl;
    // private String videoUrl;
    // private String author;
    // private String status;
    
    public Project() {
    }

    public Project(String name, String description, String githubUrl, String webPageUrl, String photoUrl) {
        this.name = name;
        this.description = description;
        this.githubUrl = githubUrl;
        this.webPageUrl = webPageUrl;
        this.photoUrl = photoUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getWebPageUrl() {
        return webPageUrl;
    }

    public void setWebPageUrl(String webPageUrl) {
        this.webPageUrl = webPageUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    

   

}
