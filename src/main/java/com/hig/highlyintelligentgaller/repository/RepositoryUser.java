package com.hig.highlyintelligentgaller.repository;

import com.hig.highlyintelligentgaller.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Integer> {
}
