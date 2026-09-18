package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Author;
import com.bookmate.model.Book;
import com.bookmate.model.Category;
import com.bookmate.storage.DataStore;

public class Bookdao {
	public void saveBook(Book book) {
		DataStore.getBooks().add(book);
	}
	
	
	public Book findByISBN(String isbn) {
		List<Book> books = DataStore.getBooks();
		for(Book book: books) {
			if(book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	
	public Book findById(String bookId) {
		List<Book> books = DataStore.getBooks();
		for(Book book: books) {
			if(book.getBookId().equals(bookId)) {
				return book;
			}
		}
		return null;
	}
	
	
	public Author findAuthorById(String authorId) {
		List<Author> authors = DataStore.getAuthors();
		for(Author author:authors) {
			if(author.getAuthorId().equals(authorId)) {
				return author;
			}
		}
		return null;
	}
	
	public Category findCategoryById(String categoryId) {
		List<Category> categories = DataStore.getCategories();
		for(Category category: categories) {
			if(category.getCategoryId().equals(categoryId)) {
				return category;
			}
		}
		return null;
	}
	
	public List<Book> findAll() {
		List<Book> books = DataStore.getBooks();
		if (books == null) {
			return new ArrayList<>();
		}
		return new ArrayList<>(books);
	}

	public List<Book> getAllBooks(){
		return findAll();
	}

	public List<Book> findByCategory(String categoryId) {
		List<Book> result = new ArrayList<>();
		if (categoryId == null) return result;
		for (Book book : DataStore.getBooks()) {
			if (book.getCategory() != null && book.getCategory().getCategoryId() != null
					&& book.getCategory().getCategoryId().equalsIgnoreCase(categoryId.trim())) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> findByAuthor(String authorId) {
		List<Book> result = new ArrayList<>();
		if (authorId == null) return result;
		for (Book book : DataStore.getBooks()) {
			if (book.getAuthor() != null && book.getAuthor().getAuthorId() != null
					&& book.getAuthor().getAuthorId().equalsIgnoreCase(authorId.trim())) {
				result.add(book);
			}
		}
		return result;
	}


	
	public List<Book> search(String keyword) {
	    List<Book> result = new ArrayList<>();
	    String searchKeyword = keyword.toLowerCase().trim();
	    for (Book book : DataStore.getBooks()) {
	        if ((book.getTitle() != null && book.getTitle().toLowerCase().contains(searchKeyword))
	                || (book.getIsbn() != null && book.getIsbn().toLowerCase().contains(searchKeyword))
	                || (book.getDescription() != null && book.getDescription().toLowerCase().contains(searchKeyword))) {
	            result.add(book);
	        }
	    }
	    return result;
	}

	public void deleteBook(String bookId) {
	    DataStore.getBooks().removeIf(book -> book.getBookId().equals(bookId));
	}
	
	public void updateBook(Book book) {
		List<Book> books = DataStore.getBooks();
		
		for(int i = 0; i < books.size(); i++) {
			Book existingBook = books.get(i);
			
			if(existingBook.getBookId().equals(book.getBookId())) {
				existingBook.setIsbn(book.getIsbn());
				existingBook.setTitle(book.getTitle());
	            existingBook.setDescription(book.getDescription());
	            existingBook.setPublicationYear(book.getPublicationYear());
	            existingBook.setAuthor(book.getAuthor());
	            existingBook.setPublisher(book.getPublisher());
	            existingBook.setCategory(book.getCategory());

	            return;
			}
		}
	}
	
}

