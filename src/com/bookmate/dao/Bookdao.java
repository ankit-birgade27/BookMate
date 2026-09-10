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
}
