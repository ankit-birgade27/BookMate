package com.bookmate.Exception;

public class InvalidIssueException extends RuntimeException{
	public InvalidIssueException(String msg) {
		super(msg);
	}
}
