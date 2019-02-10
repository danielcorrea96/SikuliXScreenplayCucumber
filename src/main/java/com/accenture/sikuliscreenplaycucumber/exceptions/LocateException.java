package com.accenture.sikuliscreenplaycucumber.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class LocateException extends SerenityManagedException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6615954675855321626L;
	public static final String LOCATE_FAILED = "Locate failed";
	public LocateException(String message, Throwable testErrorException) {
		super(message, testErrorException);

	}

}
