package com.example.wrapperclasses;

import java.util.Scanner;

public class MaximumMinimumValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter a second number: ");
		int number2 = scanner.nextInt();
		System.out.println("The maximim value of two integers is: " + Integer.max(number1, number2));
		System.out.println("The minimum value of two integer is: " + Integer.min(number1, number2));
		scanner.close();
	}
}
