package com.suza.sps.projects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
    private @Id @GeneratedValue Long id;
    private String name;

    // private String description;
    // private String githubUrl;
    // private String webPageUrl;
    // private String videoUrl;
    // private String author;
    // private String photoUrl;
    // private String status;
    
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project {id=" + id + ", name=" + name + "}";
    }

}
