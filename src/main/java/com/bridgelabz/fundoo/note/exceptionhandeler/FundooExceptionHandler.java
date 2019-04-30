package com.bridgelabz.fundoo.note.exceptionhandeler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bridgelabz.fundoo.note.exception.NoteException;
import com.bridgelabz.fundoo.note.exception.TokenException;
import com.bridgelabz.fundoo.note.response.Response;
import com.bridgelabz.fundoo.note.util.StatusUtil;


@RestControllerAdvice
public class FundooExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> globalExceptionHandler(Exception e)
	{
		Response statusInfo = StatusUtil.statusInfo(e.getMessage(), "1000");
		return new ResponseEntity<Response>(statusInfo, HttpStatus.OK);
	}
	
	@ExceptionHandler(NoteException.class)
	public ResponseEntity<Response> noteExceptionHandler(NoteException e)
	{
		Response statusInfo = StatusUtil.statusInfo(e.getMessage(), "2000");
		return new ResponseEntity<Response>(statusInfo, HttpStatus.OK);
	}
	
//	@ExceptionHandler(EmailException.class)
//	public ResponseEntity<Response> emailExceptionHandler(EmailException e)
//	{
//		Response statusInfo = StatusUtil.statusInfo(e.getMessage(), "3000");
//		return new ResponseEntity<Response>(statusInfo, HttpStatus.OK);
//	}
	
//	@ExceptionHandler(TokenException.class)
//	public ResponseEntity<Response> tokenExceptionHandler(TokenException e)
//	{
//		Response statusInfo = StatusUtil.statusInfo(e.getMessage(), "4000");
//		return new ResponseEntity<Response>(statusInfo, HttpStatus.OK);
//	}
	
//	@ExceptionHandler(UserException.class)
//	public ResponseEntity<Response> userExceptionHandler(UserException e)
//	{
//		Response statusInfo = StatusUtil.statusInfo(e.getMessage(), "5000");
//		return new ResponseEntity<Response>(statusInfo, HttpStatus.OK);
//	}
	
}
