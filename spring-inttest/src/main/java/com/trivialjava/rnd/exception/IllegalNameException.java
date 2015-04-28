package com.trivialjava.rnd.exception;

public class IllegalNameException extends RuntimeException {
	
	

	public IllegalNameException(String value) {
		super(value);
	}
	
	

	public IllegalNameException() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IllegalNameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}



	public IllegalNameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
