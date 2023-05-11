package com.example.wrapperclasses;

import java.util.Scanner;

public class IntegerWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = scanner.nextInt();
		System.out.println("ENter a second number: ");
		int num2 = scanner.nextInt();
		String string1 = "12345";
		String string2 = "6789";
		Integer number1 = new Integer(num1);
		Integer number2 = new Integer(num2);
		System.out.println("string method: " + Integer.toString(number1));
		System.out.println("Hexastring: " + Integer.toHexString(number2));
		System.out.println("octelstring: " + Integer.toOctalString(number1));
		System.out.println("binary string: " + Integer.toBinaryString(number2));
		System.out.println("Integer value: " + Integer.valueOf(number2));
		// System.out.println(Integer.valueOf(string2, num2));
		System.out.println("String value: " + Integer.valueOf(string2));
		System.out.println("parse int to string: " + Integer.parseInt(string1));
		System.out.println("Get integrt to string: " + Integer.getInteger(string2));
		System.out.println("Decode string: " + Integer.decode(string1));
		System.out.println("Retote left to number: " + Integer.rotateLeft(num1, 2));
		System.out.println("Retote right to number: " + Integer.rotateRight(num2, 3));
		scanner.close();
	}
}
