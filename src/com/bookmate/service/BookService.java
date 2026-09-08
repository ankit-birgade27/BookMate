package com.bookmate.service;



import java.util.List;

import com.bookmate.model.Book;


public interface BookService {

    Book addBook(Book book);

    Book getBookById(String bookId);

    List<Book> getAllBooks();

    Book updateBook(Book book);

    void deleteBook(String bookId);

    List<Book> searchBooks(String keyword);

    List<Book> getBooksByCategory(String categoryId);

    List<Book> getBooksByAuthor(String authorId);

    boolean bookExists(String bookId);
}