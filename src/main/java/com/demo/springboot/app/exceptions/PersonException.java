package com.demo.springboot.app.exceptions;


public class PersonException extends InternalErrorException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonException(String message) {
        super(message);
    }

    public PersonException(ErrorType errorType, String message) {
        super(errorType, message);
    }

    public PersonException(ErrorType errorType, String message, Exception exception) {
        super(errorType, message, exception);
    }
}
