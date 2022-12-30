package com.example.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleException(MethodArgumentNotValidException ex){
        var errors = ex.getFieldErrors();
        Map<String,String> er = new HashMap<>();
        for (var error: errors){
            er.put(error.getField(), error.getDefaultMessage());
            System.out.println();

        }
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }


}
