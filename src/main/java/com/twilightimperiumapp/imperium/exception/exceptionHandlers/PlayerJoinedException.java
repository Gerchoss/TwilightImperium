package com.twilightimperiumapp.imperium.exception.exceptionHandlers;

public class PlayerJoinedException extends RuntimeException{
    public PlayerJoinedException(String message){
        super(message);
    }

    public PlayerJoinedException(String message, Throwable cause){
        super(message, cause);
    }
}
