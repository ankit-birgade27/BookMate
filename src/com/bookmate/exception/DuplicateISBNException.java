package com.bookmate.exception;

public class DuplicateISBNException extends RuntimeException{
	public DuplicateISBNException(String msg) {
		super(msg);
	}
}
