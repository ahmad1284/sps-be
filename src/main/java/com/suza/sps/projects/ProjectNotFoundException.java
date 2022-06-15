package com.suza.sps.projects;

public class ProjectNotFoundException extends RuntimeException {
    
    ProjectNotFoundException(Long id) {
        super("Could not find project " + id);
    }
}
