package com.example.basics;

import java.util.Scanner;

public class Calculator {
	public int sum(int a, int b) {
		return a+b;
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}

	public int division(int a, int b) {
		return a/b;
	}

	public int modulus(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter a second number:");
		int num2 = scanner.nextInt();
		Calculator calculator = new Calculator();
		int sum = calculator.sum(num1, num2);
		System.out.println("The sum of two numbers:" + sum);
		int sub = calculator.sub(num1, num2);
		System.out.println("The subtraction of two numbers:" + sub);
		int mul = calculator.mul(num1, num2);
		System.out.println("The multiplication of two numers:" + mul);
		int division = calculator.division(num1, num2);
		System.out.println("The division of two numbers is:" + division);
		int modulus = calculator.modulus(num1, num2);
		System.out.println("The modules of two numbers:" + modulus);
		scanner.close();

	}

}
