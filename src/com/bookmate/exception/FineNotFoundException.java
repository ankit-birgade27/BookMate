package com.bookmate.exception;

public class FineNotFoundException extends RuntimeException{
	public FineNotFoundException(String msg) {
		super(msg);
	}
}
