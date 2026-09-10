package controller;

import java.util.List;

import exception.AuthorNotFoundException;
import exception.BookOperationException;
import exception.CategoryNotFoundException;
import exception.InvalidAuthorException;
import exception.InvalidCategoryException;
import model.Book;
import service.BookService;
import service.BookServiceImpl;

public class BookController {

    private BookService bookService = new BookServiceImpl();

    public void getBooksByCategory(String categoryId) {
        try {
            System.out.println("Fetching books for Category ID: " + categoryId);
            List<Book> books = bookService.getBooksByCategory(categoryId);
            if (books.isEmpty()) {
                System.out.println("No books found for this category.");
            } else {
                System.out.println("Books found:");
                for (Book book : books) {
                    System.out.println("- [" + book.getId() + "] " + book.getTitle());
                }
            }
        } catch (InvalidCategoryException | CategoryNotFoundException | BookOperationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void getBooksByAuthor(String authorId) {
        try {
            System.out.println("Fetching books for Author ID: " + authorId);
            List<Book> books = bookService.getBooksByAuthor(authorId);
            if (books.isEmpty()) {
                System.out.println("No books found for this author.");
            } else {
                System.out.println("Books found:");
                for (Book book : books) {
                    System.out.println("- [" + book.getId() + "] " + book.getTitle());
                }
            }
        } catch (InvalidAuthorException | AuthorNotFoundException | BookOperationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
