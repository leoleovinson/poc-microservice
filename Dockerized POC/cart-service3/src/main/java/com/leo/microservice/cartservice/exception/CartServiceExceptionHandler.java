package com.leo.microservice.cartservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.Status;
import io.grpc.StatusException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class CartServiceExceptionHandler {
	
	Logger logger = LoggerFactory.getLogger(CartServiceExceptionHandler.class);
	
	@GrpcExceptionHandler
    public Status handleInvalidArgumentException(IllegalArgumentException e) {
        return Status.INVALID_ARGUMENT.withDescription("Invalid Field Argument").withCause(e);
    }

//    @GrpcExceptionHandler(ResourceNotFoundException.class)
//    public StatusException handleResourceNotFoundException(ResourceNotFoundException e) {
//        Status status = Status.NOT_FOUND.withDescription("Your description").withCause(e);
//        Metadata metadata = ...
//        return status.asException(metadata);
//    }
	
	@GrpcExceptionHandler
    public Status handleInvalidCartException(InvalidCartException e) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }
	
	@GrpcExceptionHandler
    public Status handleInvalidProductException(InvalidProductException e) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }
	
	@GrpcExceptionHandler
    public Status handleCartServiceAPIException(CartServiceAPIException e) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }
	
//	@GrpcExceptionHandler
//    public Status handleInvalidArgument(RuntimeException e) {
//        return Status.INVALID_ARGUMENT.withDescription("Base RuntimeException Reached").withCause(e);
//    }	
	
//	@GrpcExceptionHandler
//    public Status handleInvalidArgument(Exception e) {
//        return Status.INVALID_ARGUMENT.withDescription("Base Exception Reached").withCause(e);
//    }

}
