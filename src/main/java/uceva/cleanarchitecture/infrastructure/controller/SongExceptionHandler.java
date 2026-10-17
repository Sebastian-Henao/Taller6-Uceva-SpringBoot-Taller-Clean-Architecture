package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import uceva.cleanarchitecture.application.usecase.exception.SongNotFoundException;

@RestControllerAdvice(assignableTypes = SongController.class)
public class SongExceptionHandler {
    @ExceptionHandler(SongNotFoundException.class)
    public ResponseEntity<String> handleSongNotFound(SongNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleInvalidSong(IllegalArgumentException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}
