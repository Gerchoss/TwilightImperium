package com.twilightimperiumapp.imperium.exception.exceptionHandlers;

public class GameFullException extends RuntimeException{
    public GameFullException(String message){
        super(message);
    }

    public GameFullException(String message, Throwable cause){
        super(message, cause);
    }
}
