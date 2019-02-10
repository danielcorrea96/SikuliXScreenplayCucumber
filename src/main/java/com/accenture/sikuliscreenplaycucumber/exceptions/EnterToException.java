package com.accenture.sikuliscreenplaycucumber.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class EnterToException extends SerenityManagedException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3274812655016460113L;
	public static final String OPEN_BROWSER_OR_ENTERS_FAILED = "Open browser or enters failed";
	public EnterToException(String message, Throwable testErrorException) {
		super(message, testErrorException);

	}

}
