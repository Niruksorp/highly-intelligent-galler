package com.hig.highlyintelligentgaller.service;

import com.hig.highlyintelligentgaller.entity.Project;
import com.hig.highlyintelligentgaller.repository.RepositoryProject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService implements CustomCRUDApplication<Project>{
    private final RepositoryProject repositoryProject;

    public ProjectService(RepositoryProject repositoryProject) {
        this.repositoryProject = repositoryProject;
    }

    @Override
    public Optional<Project> getOne(Integer id) {
        return Optional.of(repositoryProject.getOne(id));
    }

    @Override
    public List<Project> getAll() {
        return repositoryProject.findAll();
    }
}
