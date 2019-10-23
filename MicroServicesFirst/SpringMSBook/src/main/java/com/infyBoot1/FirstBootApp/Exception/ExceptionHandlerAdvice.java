package com.infyBoot1.FirstBootApp.Exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(EntityNotFoundException.class)
	public String HandleEntityNotFoundException(EntityNotFoundException e) {
		return e.getMessage()+"Yes";
	}

}
