package com.example.customexceptions;

public class InvalidCountryException extends Exception {
	public InvalidCountryException(String countryname) {
		super(countryname);
	}

}
