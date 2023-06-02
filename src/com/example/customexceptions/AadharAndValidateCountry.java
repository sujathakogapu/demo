package com.example.customexceptions;

import java.util.Scanner;

/*
 * Create a class called Aadhar and validate country. 
 * If country is not "India" throw the custom exception called InvalidCountryException
 * if country is "India" then return Aadhar number
 */
public class AadharAndValidateCountry {
	public String getCountryName(String countryName) throws InvalidCountryException {
		if (!countryName.equals("India")) {
			throw new InvalidCountryException("Invalid country");
		} else {
			return "123456789A";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a country name: ");
		String countryName = scanner.nextLine();
		scanner.close();
		AadharAndValidateCountry obj = new AadharAndValidateCountry();
		String output = null;
		try {
			output = obj.getCountryName(countryName);
			System.out.println("country name: " + output);
		} catch (InvalidCountryException ivc) {
			System.out.println(ivc.getMessage());
		}

	}

}
