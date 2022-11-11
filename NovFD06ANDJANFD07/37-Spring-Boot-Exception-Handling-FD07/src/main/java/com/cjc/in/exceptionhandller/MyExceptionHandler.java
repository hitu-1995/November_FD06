package com.cjc.in.exceptionhandller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cjc.in.exceptions.IdLengthNotMatchException;
import com.cjc.in.exceptions.IdNotFoundException;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nameInvalidException() {
		return new ResponseEntity<String>("Name Should Not Empty", HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> idNotFoundException() {
		return new ResponseEntity<String>("Invalid Id ", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(IdLengthNotMatchException.class)
	public ResponseEntity<String> idLengthNotMatchException() {
		return new ResponseEntity<String>("Id should be greater than 99 and less than 999", HttpStatus.BAD_REQUEST);
	}
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return new ResponseEntity<Object>("Method Not Allowed", HttpStatus.NOT_ACCEPTABLE);
	}

}
