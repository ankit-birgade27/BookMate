package com.bookmate.Exception;

public class IssueNotFoundException extends RuntimeException{
	public IssueNotFoundException(String msg) {
		super(msg);
	}
}
