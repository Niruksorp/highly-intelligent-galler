package com.hig.highlyintelligentgaller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class PersonalResume {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    String  name;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    String surname;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    String patronymic;

    @Column(name = "full_name",nullable = false, columnDefinition = "text", unique = true)
    String fullName = name + " " + surname + " " + patronymic;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    private String email = "";

    @Column(nullable = false, columnDefinition = "text", unique = true)
    String linkToSocial = "";

    @OneToMany
    Set<Skill> skillLis;

    @Column(nullable = false, columnDefinition = "text", unique = true)
    String BIO;
}
