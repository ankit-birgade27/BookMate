package com.bookmate.exception;

public class BookCopyNotFoundException extends RuntimeException {
	public BookCopyNotFoundException(String msg) {
		super(msg);
	}

}
