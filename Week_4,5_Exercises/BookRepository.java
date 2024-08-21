package com.example.bookstoreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods (if needed) can be defined here
}
