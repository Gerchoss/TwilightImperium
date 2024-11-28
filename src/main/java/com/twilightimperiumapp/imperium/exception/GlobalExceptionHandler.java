package com.twilightimperiumapp.imperium.exception;

import com.twilightimperiumapp.imperium.exception.exceptionHandlers.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(GameNameAlreadyExistException.class)
    public ResponseEntity<ErrorResponse> handleNameGameAlreadyExistException(GameNameAlreadyExistException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse("GAME_NAME_ALREADY_EXIST", ex.getMessage()));
    }

   @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse("NOT_FOUND", ex.getMessage()));
    }

    @ExceptionHandler(GameFullException.class)
    public ResponseEntity<ErrorResponse> handleGameFullException(GameFullException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("GAME_FULL", ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse("INTERNAL_SERVER_ERROR", "Unexpected Error"));
    }

}
