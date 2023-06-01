package com.example.customexceptions;

public class NotAValidVoterException extends Exception{
	public NotAValidVoterException(String message) {
		super(message);//it is passing message to the parent constructor
	}
	 

}
