package com.bookmate.exception;

public class IssueNotFoundException extends RuntimeException{
	public IssueNotFoundException(String msg) {
		super(msg);
	}
}
