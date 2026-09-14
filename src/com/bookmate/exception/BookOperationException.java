package com.bookmate.exception;

public class BookOperationException extends RuntimeException {
    public BookOperationException(String msg){
        super(msg);
    }
}

