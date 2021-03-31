package com.hig.highlyintelligentgaller.entity.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User implements Serializable, UserDetails {
    @Id
    @SequenceGenerator(name = "USER_ID_GENERATOR", sequenceName = "app_user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID_GENERATOR")
    private Long id;

    @Column(unique = true, nullable = false, columnDefinition = "text")
    protected String username;

    @NonNull
    @Column(nullable = false, columnDefinition = "text")
    @JsonIgnore
    protected String password;

    @NonNull
    @Column(name = "is_active", nullable = false)
    @JsonIgnore
    protected Boolean isActive = true;

    @NonNull
    @Column(name = "first_name", nullable = false, columnDefinition = "text")
    protected String firstName;

    @NonNull
    @Column(name = "last_name", nullable = false, columnDefinition = "text")
    protected String lastName = "";

    @NonNull
    @Column(name = "patronymic_name", nullable = false, columnDefinition = "text")
    protected String patronymicName = "";

    @NonNull
    @Column(nullable = false, columnDefinition = "text", unique = true)
    protected String email = "";

    @NonNull
    @Column(name = "create_date_time", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    @JsonIgnore
    private LocalDateTime createDateTime;

    @NonNull
    @ElementCollection(targetClass = UserRole.class, fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "id"))
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    protected List<UserRole> roles = new ArrayList<>();

    private String locations;

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return isActive;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return isActive;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return isActive;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return isActive;
    }
}
