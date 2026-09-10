package com.bookmate.dao;


import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Book;
import com.bookmate.storage.DataStore;

import java.util.List;

import com.bookmate.model.Book;

public class Bookdao {
	
	// Find book by ID
    public Book findById(String bookId) {

        for (Book book : DataStore.getBooks()) {

            if (book.getBookId().equalsIgnoreCase(bookId)) {
                return book;
            }
        }

        return null;
    }

    // Delete book
    public void deleteBook(String bookId) {

        Book book = findById(bookId);

        if (book != null) {
            DataStore.getBooks().remove(book);
        }
    }

    // Search books
    public List<Book> search(String keyword) {

        List<Book> result = new ArrayList<>();

        keyword = keyword.toLowerCase();

        for (Book book : DataStore.getBooks()) {

            // Search by title
            if (book.getTitle() != null &&
                book.getTitle().toLowerCase().contains(keyword)) {

                result.add(book);
            }

            // Search by ISBN
            else if (book.getIsbn() != null &&
                     book.getIsbn().toLowerCase().contains(keyword)) {

                result.add(book);
            }

            // Search by author
            else if (book.getAuthor() != null &&
                     book.getAuthor().getFirstName() != null &&
                     book.getAuthor().getFirstName()
                         .toLowerCase().contains(keyword)) {

                result.add(book);
            }

            // Search by category
            else if (book.getCategory() != null &&
                     book.getCategory().getName() != null &&
                     book.getCategory().getName()
                         .toLowerCase().contains(keyword)) {

                result.add(book);
            }
        }

        return result;
    }
    
    

}
