package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class TechnicalIssue {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;

    String nameOfProject;

    Date planingStartData;

    Date planingEndData;

    String comment;
}
