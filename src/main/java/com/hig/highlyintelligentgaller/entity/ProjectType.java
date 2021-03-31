package com.hig.highlyintelligentgaller.entity;

public enum ProjectType {

    COMMERCE("Коммерческий проекь"),
    NOT_COMMERCIAL("Некоммерческий проект"),
    PET_PROJECT("Вообще хз, что это"),
    SCIENTIFIC("Научный проект");
    private final String name;

    ProjectType(String name) {
        this.name = name;
    }


}
