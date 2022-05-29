package com.francesc2509.portofolioservice.api.controller.advice;

import com.francesc2509.portofolioservice.model.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionAdvice {
    private static final String INTERNAL_SERVER_ERROR_MSG = "Something went wrong!";
    private static final String NOT_FOUND_MSG = "Not found";
    private static final String METHOD_NOT_ALLOWED_MSG = "Method not allowed";

    @ExceptionHandler(value = {MethodArgumentNotValidException.class })
    protected ResponseEntity<String> handleHttpRequestMethodArgumentNotValidException(Exception e) {
        return ResponseEntity.internalServerError().build();
    }

    @ExceptionHandler(value = { NoHandlerFoundException.class })
    protected ResponseEntity<String> handleHttpRequestNoHandlerFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NOT_FOUND_MSG);
    }

    @ExceptionHandler(value = {HttpRequestMethodNotSupportedException.class})
    protected ResponseEntity<String> handleHttpRequestMethodNotSupportedException() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(METHOD_NOT_ALLOWED_MSG);
    }

    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
    protected ResponseEntity<String> handleHttpRequestException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(INTERNAL_SERVER_ERROR_MSG);
    }
}