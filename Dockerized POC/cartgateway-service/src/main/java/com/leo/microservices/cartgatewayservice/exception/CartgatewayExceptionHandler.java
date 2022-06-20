package com.leo.microservices.cartgatewayservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.leo.microservices.cartgatewayservice.dto.ErrorDto;

import io.grpc.StatusRuntimeException;



@ControllerAdvice
public class CartgatewayExceptionHandler {
	
	@Autowired
	private ErrorDto errorDto;
	
	@ExceptionHandler(InvalidCartException.class)
	public ResponseEntity<ErrorDto> invalidCartExceptionHandler(InvalidCartException error,
			WebRequest request) {

		errorDto = errorDto.builder()
				.withTitle("Invalid Cart")
				.withDetails(error.getMessage())
				.withErrorType(InvalidCartException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidCartItemException.class)
	public ResponseEntity<ErrorDto> invalidCartItemExceptionHandler(InvalidCartItemException error,
			WebRequest request) {

		errorDto = errorDto.builder()
				.withTitle("Invalid Cart Item")
				.withDetails(error.getMessage())
				.withErrorType(InvalidCartItemException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CartgatewayAPIException.class)
	public ResponseEntity<ErrorDto> cartgatewayAPIExceptionHandler(CartgatewayAPIException error,
			WebRequest request) {

		errorDto = errorDto.builder()
				.withTitle("Cartgateway Exception")
				.withDetails(error.getMessage())
				.withErrorType(CartgatewayExceptionHandler.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<ErrorDto> httpClientErrorExceptionHandler(HttpClientErrorException error,
			WebRequest request) {
		
		errorDto = errorDto.builder()
				.withTitle("Client Error Exception")
				.withDetails(error.getMessage())
				.withErrorType(HttpClientErrorException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorDto> httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException error,
			WebRequest request) {
		
		errorDto = errorDto.builder()
				.withTitle("Message Not Readable Exception")
				.withDetails(error.getMessage())
				.withErrorType(HttpMessageNotReadableException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ErrorDto> httpRequestMethodNotSupportedExceptionHandler(HttpRequestMethodNotSupportedException error,
			WebRequest request) {
		
		errorDto = errorDto.builder()
				.withTitle("Request method not supported/ Invalid Request")
				.withDetails(error.getMessage())
				.withErrorType(HttpRequestMethodNotSupportedException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorDto> methodArgumentTypeMismatchExceptionHandler(MethodArgumentTypeMismatchException error,
			WebRequest request) {
		
		errorDto = errorDto.builder()
				.withTitle("Argument type mismatch")
				.withDetails(error.getMessage())
				.withErrorType(MethodArgumentTypeMismatchException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(StatusRuntimeException.class)
	public ResponseEntity<ErrorDto> statusRuntimeExceptionHandler(StatusRuntimeException error,
			WebRequest request) {
		
		errorDto = errorDto.builder()
				.withTitle("Status Runtime Exception")
				.withDetails(error.getMessage())
				.withErrorType(StatusRuntimeException.class.getSimpleName())
				.withErrorCode("P404")
				.build();
		
		return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorDto> globalExceptionHandler(Exception error, WebRequest request) {
//
//		logger.info(error.getLocalizedMessage());
//		
//		errorDto = errorDto.builder()
//				.withTitle("Unexpected Error")
//				.withDetails(error.getClass().getSimpleName())
//				.withErrorType(Exception.class.getSimpleName())
//				.withErrorCode("P500")
//				.build();
//
//		return new ResponseEntity<>(errorDto, HttpStatus.INTERNAL_SERVER_ERROR);
//	}

}
