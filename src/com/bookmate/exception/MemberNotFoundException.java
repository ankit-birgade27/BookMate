package com.bookmate.exception;

public class MemberNotFoundException extends RuntimeException{
	public MemberNotFoundException(String msg) {
		super(msg);
	}

}
