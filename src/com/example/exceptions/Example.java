package com.example.exceptions;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numerator: ");
		int numerator = scanner.nextInt();
		System.out.println("Enter a denominator: ");
		int denominator = scanner.nextInt();
		try {
			int output = numerator / denominator;
			System.out.println("The output is: " + output);
			System.out.println("Enter a name: ");
			String name = scanner.next();
			System.out.println(name.charAt(2));
			int[] arr = new int[Integer.MAX_VALUE];

		} catch (ArithmeticException | StringIndexOutOfBoundsException | OutOfMemoryError e ) {
			System.out.println(e.getMessage());//this line will be executed in case of exception
		} finally {
			scanner.close();//this line will be executed irrespective of exception 
		}
		
		System.out.println("Rest of the program");
	}

}
