package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.dao.Bookdao;
import com.bookmate.model.Book;
import com.bookmate.service.BookService;

public class BookServiceImpl implements BookService {

	
	private Bookdao bookDao;
	public BookServiceImpl(Bookdao bookDAO) {
		  this.bookDao=bookDAO;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(String bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> searchBooks(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByCategory(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByAuthor(String authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookExists(String bookId) {
		// TODO Auto-generated method stub
		return false;
	}

}
