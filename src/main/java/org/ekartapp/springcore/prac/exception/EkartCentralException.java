package org.ekartapp.springcore.prac.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class EkartCentralException {
	
	Logger LOGGER=LoggerFactory.getLogger("EkartCentralException.class");
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(OrderIdIsNotPresentException.class)
	public String  OrderIdIsNotPresentException(OrderIdIsNotPresentException e) {
		System.out.println("orderID doesnt exist in db");
		LOGGER.info("{}OrderIdIsNotPresentException",e.getMessage());
		return e.getMessage();
	}
	
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmailIdException.class)
	public String EmailIdException(EmailIdException e) {
		
		System.out.println("invalid EMailId");
		LOGGER.info("{}EmailIdException",e.getMessage());
		return e.getMessage();
	}
}
