package com.bridgelabz.fundoo.note.exception;

public class NoteException extends RuntimeException{
	
	int code;
	
	public NoteException(String message) {
		super(message);
	}
	
	public NoteException(int code, String message) {
		super(message);
		this.code = code;
	}
}
