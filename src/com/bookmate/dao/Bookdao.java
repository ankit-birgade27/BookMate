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
	
	
	public List<Book> getAllBooks(){
		return new ArrayList<>(DataStore.getBooks());
	}


	public List<Book> search(String keyword) {
		
		return null;
	}


	public void deleteBook(String bookId) {
		// TODO Auto-generated method stub
		
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

