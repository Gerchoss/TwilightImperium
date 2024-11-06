package com.twilightimperiumapp.imperium.exception.exceptionHandlers;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException(String message){
        super(message);
    }

    public GameNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
