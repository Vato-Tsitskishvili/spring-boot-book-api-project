package com.vakhtang.springbootapp.services;

import com.vakhtang.springbootapp.domain.entities.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    BookEntity createUpdateBook(String isbn, BookEntity book);
    List<BookEntity> findAll();
    Page<BookEntity> findAll(Pageable pageable);
    Optional<BookEntity> findOne(String isbn);
    boolean exists(String isbn);
    BookEntity partialUpdate(String isbn, BookEntity bookEntity);
    void delete(String isbn);
}
