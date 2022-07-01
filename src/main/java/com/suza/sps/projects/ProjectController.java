package com.suza.sps.projects;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {
    private final ProjectRepository repository;

    ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    List<Project> all() {
        return repository.findAll();
    }

    @PostMapping("")
    Project newProject(@RequestBody Project newProject){
        return repository.save(newProject);
    }

    // Single item

    @GetMapping("/{id}")
    Project one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
    }

    @PutMapping("")
    ResponseEntity<Project> replaceProject(@RequestBody Project newProject){

        if(repository.findById(newProject.getId()).isPresent())
            return new ResponseEntity(repository.save(newProject), HttpStatus.OK);
        else
        return new ResponseEntity(newProject, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id){
        repository.deleteById(id);
    }
    
}
