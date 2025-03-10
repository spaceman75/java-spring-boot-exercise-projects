package com.example.mysql.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.mysql.advice.exceptions.NotFoundException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> handleNotFoundException() {
		return ResponseEntity.notFound().build();
	}

}
