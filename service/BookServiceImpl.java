package service;

import java.util.List;

import dao.BookDAO;
import exception.AuthorNotFoundException;
import exception.BookOperationException;
import exception.CategoryNotFoundException;
import exception.InvalidAuthorException;
import exception.InvalidCategoryException;
import model.Author;
import model.Book;
import model.Category;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO = new BookDAO();

    @Override
    public Book addBook(Book book) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Book getBookById(String bookId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Book> getAllBooks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Book updateBook(Book book) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void deleteBook(String bookId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Book> searchBooks(String keyword) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean bookExists(String bookId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Book> getBooksByCategory(String categoryId) {
        try {
            if (categoryId == null || categoryId.trim().isEmpty()) {
                throw new InvalidCategoryException("Category ID cannot be null or blank");
            }
            
            Category category = bookDAO.findCategoryById(categoryId);
            if (category == null) {
                throw new CategoryNotFoundException("Category with ID " + categoryId + " not found");
            }
            
            return bookDAO.findByCategoryId(categoryId);
        } catch (InvalidCategoryException | CategoryNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new BookOperationException("An error occurred while fetching books by category", e);
        }
    }

    @Override
    public List<Book> getBooksByAuthor(String authorId) {
        try {
            if (authorId == null || authorId.trim().isEmpty()) {
                throw new InvalidAuthorException("Author ID cannot be null or blank");
            }
            
            Author author = bookDAO.findAuthorById(authorId);
            if (author == null) {
                throw new AuthorNotFoundException("Author with ID " + authorId + " not found");
            }
            
            return bookDAO.findByAuthorId(authorId);
        } catch (InvalidAuthorException | AuthorNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new BookOperationException("An error occurred while fetching books by author", e);
        }
    }
}
