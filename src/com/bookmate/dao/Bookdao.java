package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Book;

public class Bookdao {
	
    private List<Book> books = new ArrayList<>();
     // Find book by ID
    public Book findById(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    // Delete book by ID
    public void deleteBook(String bookId) {

        books.removeIf(book ->
                book.getBookId().equals(bookId));
    }

    // Search books
    public List<Book> search(String keyword) {

        List<Book> result = new ArrayList<>();

        String searchKeyword = keyword.toLowerCase().trim();

        for (Book book : books) {

            if ((book.getTitle() != null &&
                    book.getTitle().toLowerCase().contains(searchKeyword))

                    || (book.getIsbn() != null &&
                    book.getIsbn().toLowerCase().contains(searchKeyword))

                    || (book.getDescription() != null &&
                    book.getDescription().toLowerCase().contains(searchKeyword))) {

                result.add(book);
            }
        }

        return result;
    }
}

