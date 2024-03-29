package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;

    ProjectType projectType;

    //Техническое видение проекта
    @OneToOne
    @JoinColumn(name = "key_ap")
    ProjectVision technicalIssue;


}
