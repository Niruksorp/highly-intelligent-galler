package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ProjectVision {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;

    //Техническое видение проекта
    @OneToOne
    @JoinColumn(name = "key_ap")
    TechnicalIssue technicalIssue;

}
