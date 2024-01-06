package com.vakhtang.springbootapp.services;

import com.vakhtang.springbootapp.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AuthorService {

    AuthorEntity save(AuthorEntity authorEntity);
    List<AuthorEntity> findAll();
    Optional<AuthorEntity> findOne(Long id);
    boolean exists(Long id);
    AuthorEntity partialUpdate(Long id, AuthorEntity authorEntity);
    void delete(Long id);
}
