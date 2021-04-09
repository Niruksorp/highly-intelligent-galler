package com.hig.highlyintelligentgaller.service;

import com.hig.highlyintelligentgaller.dto.ShortFormProjectDTO;
import com.hig.highlyintelligentgaller.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShortProjectFormServiceImpl implements ShortProjectFormService {
    @Override
    public List<ShortFormProjectDTO> converterProjectListToDTO(List<Project> projectList) {
        return projectList
                .stream()
                .map(ShortFormProjectDTO::new)
                .collect(Collectors.toList());
    }
}
