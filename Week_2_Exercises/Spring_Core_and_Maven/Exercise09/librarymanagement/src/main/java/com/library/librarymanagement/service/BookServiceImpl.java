package com.library.librarymanagement.service;

import com.library.librarymanagement.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    @Override
    public Book addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Optional<Book> existingBook = getBookById(id);
        if (existingBook.isPresent()) {
            Book b = existingBook.get();
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
            return b;
        }
        return null;
    }

    @Override
    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
