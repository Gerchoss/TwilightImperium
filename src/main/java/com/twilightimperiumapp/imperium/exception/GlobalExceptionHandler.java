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
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("GAME_NAME_ALREADY_EXIST", ex.getMessage()));
    }

   @ExceptionHandler(GameNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleGameNotFoundException(GameNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("GAME_NOT_FOUND", ex.getMessage()));
    }

    @ExceptionHandler(PlayerJoinedException.class)
    public ResponseEntity<ErrorResponse> handlePlayerJoinedException(PlayerJoinedException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("PLAYER_JOINED", ex.getMessage()));
    }

    @ExceptionHandler(GameFullException.class)
    public ResponseEntity<ErrorResponse> handleGameFullException(GameFullException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("GAME_FULL", ex.getMessage()));
    }

    @ExceptionHandler(GameStartedFinishedException.class)
    public ResponseEntity<ErrorResponse> handleGameStartedFinishedException(GameStartedFinishedException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse("GAME_STARTED_FINISHED", ex.getMessage()));
    }

}
