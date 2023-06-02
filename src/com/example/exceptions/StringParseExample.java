package com.example.exceptions;

import java.util.Scanner;

/*
 * Assignment: Write a Java program that reads a string from the user and converts it to an integer.
 *  Handle the exception when the user enters a non-numeric value.
 */
public class StringParseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.next();
		try {
			int number = Integer.parseInt(str);
			System.out.println(number);
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		} finally {
			scanner.close();
		}
		System.out.println("Rest of the program");
	}

}
