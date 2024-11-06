package com.twilightimperiumapp.imperium.exception.exceptionHandlers;

public class GameStartedFinishedException extends RuntimeException{
    public GameStartedFinishedException(String message){
        super(message);
    }

    public GameStartedFinishedException(String message, Throwable cause){
        super(message, cause);
    }
}
