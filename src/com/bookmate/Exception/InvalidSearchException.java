package com.bookmate.Exception;

public class InvalidSearchException extends RuntimeException{
    public InvalidSearchException(String msg){
        super(msg);
    }
}
