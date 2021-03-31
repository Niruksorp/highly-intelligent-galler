package com.hig.highlyintelligentgaller.entity.security;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ADMIN,
    GUEST,
    MUNICIPALITY,
    ORGANIZATION,
    OPERATOR;

    @Override
    public String toString() {
        switch (this) {
            case ADMIN:         return "Администратор";
            case GUEST:         return "Посетитель";
            case MUNICIPALITY:  return "Муниципалитет";
            default:    throw new IllegalArgumentException();
        }
    }

    public GrantedAuthority toAuthority() {
        final String roleName = this.name();
        return (GrantedAuthority) () -> String.format("ROLE_%s", roleName);
    }

    @Override
    public String getAuthority() {
        return toAuthority().getAuthority();
    }
}
