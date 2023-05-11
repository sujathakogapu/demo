package com.example.wrapperclasses;

import java.util.Scanner;

public class IntegerWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter a second number: ");
		int num2 = scanner.nextInt();
		Integer number1 = new Integer(num1);
		Integer number2 = new Integer(num2);
		System.out.println("Equals method: "+number1.equals(number2));
		System.out.println("compareTo method: "+number1.compareTo(number2));
		System.out.println("string method: " + Integer.toString(number1));
		System.out.println("Hexastring: " + Integer.toHexString(number2));
		System.out.println("octalstring: " + Integer.toOctalString(number1));
		System.out.println("binary string: " + Integer.toBinaryString(number2));
		System.out.println("Integer value: " + Integer.valueOf(number2));
		// System.out.println(Integer.valueOf(string2, num2));
		System.out.println("String value: " + Integer.valueOf(Integer.toString(number1)));
		System.out.println("parse string to int: " + Integer.parseInt(Integer.toString(number1)));
		System.out.println("Decode string: " + Integer.decode(Integer.toString(number2)));
		System.out.println("Rotate left to number: " + Integer.rotateLeft(num1, 2));
		System.out.println("Rotate right to number: " + Integer.rotateRight(num2, 3));
		scanner.close();
	}
}
