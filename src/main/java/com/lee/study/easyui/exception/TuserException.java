package com.lee.study.easyui.exception;

public class TuserException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public TuserException(String message) {
		super(message);
		}
	
	public TuserException(String message,Throwable throwable ){
		super(message, throwable);
	}
}
