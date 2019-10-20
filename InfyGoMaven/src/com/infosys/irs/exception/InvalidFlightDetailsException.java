package com.infosys.irs.exception;

@SuppressWarnings("serial")
public class InvalidFlightDetailsException extends Exception {
	public InvalidFlightDetailsException(String message){
		super(message);
	}
}
