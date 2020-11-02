package com.demo.springboot.app.exceptions;


public class PoemsException extends InternalErrorException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PoemsException(String message) {
        super(message);
    }

    public PoemsException(ErrorType errorType, String message) {
        super(errorType, message);
    }

    public PoemsException(ErrorType errorType, String message, Exception exception) {
        super(errorType, message, exception);
    }
}
