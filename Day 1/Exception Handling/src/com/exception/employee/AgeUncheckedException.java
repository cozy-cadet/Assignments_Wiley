package com.exception.employee;

@SuppressWarnings("serial")
public class AgeUncheckedException extends RuntimeException {
	public AgeUncheckedException(String message) {
		super(message);
	}
}