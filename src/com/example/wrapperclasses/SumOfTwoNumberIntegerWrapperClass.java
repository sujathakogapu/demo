package com.example.wrapperclasses;

import java.util.Scanner;

public class SumOfTwoNumberIntegerWrapperClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter a second number: ");
		int number2 = scanner.nextInt();
		Integer sum = Integer.sum(number1, number2);
		System.out.println("the sum of two integers is: " + sum);
		scanner.close();
	}
}