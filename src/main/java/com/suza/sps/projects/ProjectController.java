package com.suza.sps.projects;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProjectController {
    private final ProjectRepository repository;

    ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/projects")
    List<Project> all() {
        return repository.findAll();
    }

    @PostMapping("/projects")
    Project newProject(@RequestBody Project newProject){
        return repository.save(newProject);
    }

    // Single item

    @GetMapping("/projects/{id}")
    Project one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
    }

    @PutMapping("/projects/{id}")
    Project replaceProject(@RequestBody Project newProject, @PathVariable Long id){

        return repository.findById(id).map(project -> {
            project.setTitle(newProject.getTitle());
            project.setDescription(newProject.getDescription());
            project.setGithubUrl(newProject.getGithubUrl());
            project.setWebPageUrl(newProject.getWebPageUrl());
            project.setVideoUrl(newProject.getWebPageUrl());
            project.setAuthor(newProject.getAuthor());
            project.setPhotoUrl(newProject.getPhotoUrl());
            return repository.save(newProject);
        })
        .orElseGet(() -> {
            newProject.setId(id);
            return repository.save(newProject);
        });
    }

    @DeleteMapping("/projects/{id}")
    void deleteEmployee(@PathVariable Long id){
        repository.deleteById(id);
    }
    
}
