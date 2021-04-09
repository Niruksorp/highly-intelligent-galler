package com.hig.highlyintelligentgaller.controller;

import com.hig.highlyintelligentgaller.entity.Project;
import com.hig.highlyintelligentgaller.repository.RepositoryProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final RepositoryProject repositoryProject;

    public ProjectController(RepositoryProject repositoryProject) {
        this.repositoryProject = repositoryProject;
    }

    @GetMapping
    public List<Project> list(Pageable pageable) {
        return repositoryProject.findAll();
    }

}
