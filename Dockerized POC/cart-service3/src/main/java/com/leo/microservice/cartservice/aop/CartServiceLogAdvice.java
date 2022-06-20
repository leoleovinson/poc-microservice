package com.leo.microservice.cartservice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class CartServiceLogAdvice {
	
private Logger logger = LoggerFactory.getLogger(CartServiceLogAdvice.class);
	
	@Pointcut(value = "execution (* com.leo.microservice.cartservice.service.*.*(..) )")
	public void cartServicePointCut() {
		//point cut for cart service
	}

	@Around("cartServicePointCut()")
	public Object myCartLogger(ProceedingJoinPoint pcj) throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		String methodName = pcj.getSignature().getName();
		String className = pcj.getTarget().getClass().getSimpleName();
//		
//		//SENDING LOG - Class and method called + arguments sent
//		String argString = mapper.writeValueAsString(pcj.getArgs());
//		System.out.println(pcj.getArgs().toString());
		logger.info("From class: {}", className);
		logger.info("Invoked method: {}", methodName);
//		logger.info("Argumenst passed: {}" , argString);
		Object obj = pcj.proceed();
		
		//SENDING LOG - whole response entity
//		String valueString = obj.toString();
//		logger.info("Resulting Reponse: {} ", valueString);
		
		return obj;
	}
	
	@Pointcut(value = "execution (* com.leo.microservice.cartservice.exception.*.*(..) )")
	public void cartExceptionPointCut() {
		//point cut for cart exception
	}
	
	@Around("cartExceptionPointCut()")
	public Object myCartExceptionLogger(ProceedingJoinPoint pcj) throws Throwable {
		String methodName = pcj.getSignature().getName();
		String className = pcj.getTarget().getClass().getSimpleName();
		
		//SENDING LOG - Class and method called
		logger.info("From class: {}", className);
		logger.info("Invoked method: {}", methodName);
		logger.info("An exception was thrown");

		return pcj.proceed();
	}

}
