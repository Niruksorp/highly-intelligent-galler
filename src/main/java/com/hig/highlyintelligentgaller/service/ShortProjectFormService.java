package com.hig.highlyintelligentgaller.service;

import com.hig.highlyintelligentgaller.dto.ShortFormProjectDTO;
import com.hig.highlyintelligentgaller.entity.Project;

import java.util.List;

public interface ShortProjectFormService {
    List<ShortFormProjectDTO> converterProjectListToDTO(List<Project> projectList);
}
