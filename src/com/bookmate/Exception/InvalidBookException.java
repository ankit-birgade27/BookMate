package com.bookmate.Exception;

public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String msg){
        super(msg);
    }
}
