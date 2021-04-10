package com.hig.highlyintelligentgaller.controller;

import com.hig.highlyintelligentgaller.dto.ShortFormProjectDTO;
import com.hig.highlyintelligentgaller.repository.RepositoryProject;
import com.hig.highlyintelligentgaller.service.ShortProjectFormService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController implements ProjectControllerInt{

    private final RepositoryProject repositoryProject;

    private final ShortProjectFormService shortProjectFormService;

    public ProjectController(RepositoryProject repositoryProject, ShortProjectFormService shortProjectFormService) {
        this.repositoryProject = repositoryProject;
        this.shortProjectFormService = shortProjectFormService;
    }

    @GetMapping()
    public ResponseEntity<List<ShortFormProjectDTO>> getList() {
        return ResponseEntity.ok(shortProjectFormService.converterProjectListToDTO(repositoryProject.findAll()));
    }

}
