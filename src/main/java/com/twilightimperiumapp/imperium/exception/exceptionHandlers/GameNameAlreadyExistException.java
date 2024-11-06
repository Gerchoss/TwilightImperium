package com.twilightimperiumapp.imperium.exception.exceptionHandlers;

public class GameNameAlreadyExistException extends RuntimeException{
    public GameNameAlreadyExistException(String message){
        super(message);
    }

    public GameNameAlreadyExistException(String message, Throwable cause){
        super(message, cause);
    }
}
