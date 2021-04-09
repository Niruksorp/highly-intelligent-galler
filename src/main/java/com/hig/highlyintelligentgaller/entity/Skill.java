package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    private String tag;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    PersonalResume personalResume;

}
