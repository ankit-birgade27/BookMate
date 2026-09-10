package dao;

import java.util.ArrayList;
import java.util.List;

import model.Author;
import model.Book;
import model.Category;

public class BookDAO {
    
    // In-memory data store for demonstration
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    
    public BookDAO() {
        // Sample data
        authors.add(new Author("A1", "Author One"));
        categories.add(new Category("C1", "Category One"));
        books.add(new Book("B1", "Book One", "ISBN1", "A1", "C1"));
        books.add(new Book("B2", "Book Two", "ISBN2", "A1", "C1"));
    }

    public Category findCategoryById(String categoryId) {
        for (Category category : categories) {
            if (category.getId().equals(categoryId)) {
                return category;
            }
        }
        return null;
    }

    public List<Book> findByCategoryId(String categoryId) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategoryId() != null && book.getCategoryId().equals(categoryId)) {
                result.add(book);
            }
        }
        return result;
    }

    public Author findAuthorById(String authorId) {
        for (Author author : authors) {
            if (author.getId().equals(authorId)) {
                return author;
            }
        }
        return null;
    }

    public List<Book> findByAuthorId(String authorId) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorId() != null && book.getAuthorId().equals(authorId)) {
                result.add(book);
            }
        }
        return result;
    }
}
