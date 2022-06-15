package com.suza.sps.projects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
    private @Id @GeneratedValue Long id;
    private String title;
    private String description;
    private String githubUrl;
    private String webPageUrl;
    private String videoUrl;
    private String author;
    private String photoUrl;
    // private String status;
    
    public Project() {
    }

    public Project(String title, String description, String githubUrl, String webPageUrl, String videoUrl,
            String author, String photoUrl/*, String status*/) {
        this.title = title;
        this.description = description;
        this.githubUrl = githubUrl;
        this.webPageUrl = webPageUrl;
        this.videoUrl = videoUrl;
        this.author = author;
        this.photoUrl = photoUrl;
        // this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /*
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    */
    
    
}
