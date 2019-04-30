package com.bridgelabz.fundoo.note.exception;

public class TokenException extends RuntimeException{
	
	int code;
	
	public TokenException(String message) {
		super(message);
	}
	
	public TokenException(int code, String message) {
		super(message);
		this.code = code;
	}
}
