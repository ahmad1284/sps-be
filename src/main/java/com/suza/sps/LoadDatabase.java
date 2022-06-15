package com.suza.sps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.suza.sps.projects.Project;
import com.suza.sps.projects.ProjectRepository;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProjectRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Project("Student Project Showcase", "Test No 1", "https://github.com/ahmad1284/sps", "https://suzasps.netlify.app", "https://youtube.com", "Ahmad Abdullah", "https://picsum.photos/id/5l/500/350")));

            log.info("Preloading " + repository.save(new Project("Ahmad's portfolio", "Test No 2", "https://github.com/ahmad1284/resume", "https://ahmad1284.github.io/resume", "https://youtube.com", "Ahmad Abdullah", "https://picsum.photos/id/6l/500/350")));
        };
    }
}