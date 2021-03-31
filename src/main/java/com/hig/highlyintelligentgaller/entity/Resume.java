package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Resume {
    @Id
    private Integer id;

}
