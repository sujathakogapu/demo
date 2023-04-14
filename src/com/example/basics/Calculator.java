package com.example.basics;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter a second number:");
		int num2 = scanner.nextInt();
		int sum = (num1 + num2);
		int sub = (num1 - num2);
		int multi = (num1 * num2);
		int division = (num1 / num2);
		int modules = (num1 % num2);
		System.out.println("The sum of two numbers:" + sum);
		System.out.println("The subtraction of two numbers:" + sub);
		System.out.println("The multiplication of two numers:" + multi);
		System.out.println("the division of two numbers is:" + division);
		System.out.println("The modules of two numbers:" + modules);
		scanner.close();

	}

}
