package com.example.wrapperclasses;

import java.util.Scanner;

public class SumOfTwoNumberInDoubleWrapperClass {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		double number1 = scanner.nextDouble();
		System.out.println("Enter a second number: ");
		double number2 = scanner.nextDouble();
		Double sum = Double.sum(number1, number2);
		System.out.println("the sum of two integers is: " + sum);
		scanner.close();
	}
	}

