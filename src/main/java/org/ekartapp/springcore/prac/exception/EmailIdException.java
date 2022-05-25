package org.ekartapp.springcore.prac.exception;

public class EmailIdException extends RuntimeException {
	
	private String message;

	public EmailIdException(String message) {
		super();
		this.message = message;
	}

	public EmailIdException() {
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
		return "EmailIdException [message=" + message + "]";
	}
	
	

}
