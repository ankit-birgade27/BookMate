package com.bookmate.exception;

public class InvalidBookException extends RuntimeException{
	public InvalidBookException(String msg) {
		super(msg);
	}
}
