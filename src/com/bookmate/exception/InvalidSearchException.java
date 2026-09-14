package com.bookmate.exception;

public class InvalidSearchException extends RuntimeException{
    public InvalidSearchException(String msg){
        super(msg);
    }
}
