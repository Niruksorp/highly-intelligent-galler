package com.hig.highlyintelligentgaller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hig.highlyintelligentgaller.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShortFormProjectDTO {
    private final Integer id;
    private final String info;

    public ShortFormProjectDTO(Project project) {
        id = project.getId();
        info = "Очень полезная информация о проекте!";
    }
}
