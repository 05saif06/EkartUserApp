package org.ekartapp.springcore.prac.exception;

public class OrderIdIsNotPresentException extends RuntimeException {
	
	private String message;

	public OrderIdIsNotPresentException(String message) {
		super();
		this.message = message;
	}

	public OrderIdIsNotPresentException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OrderIdIsNotPresentException [message=" + message + "]";
	}
	
	

}
