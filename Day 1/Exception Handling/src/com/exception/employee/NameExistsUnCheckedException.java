package com.exception.employee;

@SuppressWarnings("serial")
public class NameExistsUnCheckedException extends RuntimeException {
	public NameExistsUnCheckedException(String message) {
		super(message);
 }
}