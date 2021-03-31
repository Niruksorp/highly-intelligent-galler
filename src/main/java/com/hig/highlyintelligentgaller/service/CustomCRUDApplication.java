package com.hig.highlyintelligentgaller.service;

import java.util.List;
import java.util.Optional;

public interface CustomCRUDApplication<G> {
    Optional<G> getOne(Integer id);

    List<G> getAll();
}
