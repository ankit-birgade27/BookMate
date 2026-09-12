package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.dao.Bookdao;
import com.bookmate.exception.DuplicateISBNException;
import com.bookmate.exception.InvalidBookException;
import com.bookmate.model.Book;
import com.bookmate.service.BookService;

import com.bookmate.Exception.InvalidBookException;
import com.bookmate.Exception.BookNotFoundException;
import com.bookmate.Exception.BookOperationException;
import com.bookmate.Exception.InvalidSearchException;

public class BookServiceImpl implements BookService {

	
	private Bookdao bookDao;
	public BookServiceImpl(Bookdao bookDAO) {
		  this.bookDao=bookDAO;
	}

	@Override
	public Book addBook(Book book) {
		if(book == null) {
			throw new InvalidBookException("Invalid Book");
		}
		
		if(bookExists(book.getBookId())) {
			throw new InvalidBookException("Book already exist.");
		}
		
		if(isISBNExist(book.getIsbn())) {
			throw new DuplicateISBNException("ISBN already exist.");
		}
		
		bookDao.saveBook(book);
		
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

		 if (bookId == null || bookId.trim().isEmpty()) {

        throw new InvalidBookException(
                "Book ID is required.");
    }

    try {

        Book book = bookDao.findById(bookId);

        if (book == null) {

            throw new BookNotFoundException(
                    "Book not found with ID: " + bookId);
        }

        bookDao.deleteBook(bookId);

    } catch (BookNotFoundException e) {

        throw e;

    } catch (Exception e) {

        throw new BookOperationException(
                "Unable to delete book.");
    }
}
	

	@Override
	public List<Book> searchBooks(String keyword) {
		  // 1. Validate keyword
    if (keyword == null || keyword.trim().isEmpty()) {
        throw new InvalidSearchException(
                "Search keyword is required.");
    }

    try {

        // 2. Search books using DAO
        return bookDao.search(keyword);

    } catch (Exception e) {

        throw new BookOperationException(
                "Unable to search books.");
    }
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
		if(bookDao.findById(bookId) != null) {
			return true;
		}
		return false;
	}
	
	

	@Override
	public boolean isISBNExist(String isbn) {
		// TODO Auto-generated method stub
		if(bookDao.findByISBN(isbn) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isBookTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAuthorExist(String author) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCategoryExist(String category) {
		// TODO Auto-generated method stub
		return false;
	}

}
