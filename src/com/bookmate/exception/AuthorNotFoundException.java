package com.bookmate.Exception;

public class AuthorNotFoundException extends RuntimeException{
	public AuthorNotFoundException(String msg) {
		super(msg);
	}
}
