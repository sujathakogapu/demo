package com.example.basics;

import java.util.Scanner;

public class Calculator {
	int a = 0;
	int b =0;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a+this.b;
	}

	public int sub() {
		return this.a-this.b;
	}

	public int mul() {
		return this.a*this.b;
	}

	public int division() {
		return this.a/this.b;
	}

	public int modulus() {
		return this.a%this.b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter a second number:");
		int num2 = scanner.nextInt();
		Calculator calculator = new Calculator(num1, num2);
		int sum = calculator.sum();
		System.out.println("The sum of two numbers:" + sum);
		int sub = calculator.sub();
		System.out.println("The subtraction of two numbers:" + sub);
		int mul = calculator.mul();
		System.out.println("The multiplication of two numers:" + mul);
		int division = calculator.division();
		System.out.println("The division of two numbers is:" + division);
		int modulus = calculator.modulus();
		System.out.println("The modulus of two numbers:" + modulus);
		scanner.close();

	}

}
