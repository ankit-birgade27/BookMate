package com.bookmate.exception;

public class BookAlreadyReturnedException extends RuntimeException{
	public BookAlreadyReturnedException(String msg) {
		super(msg);
	}

}
