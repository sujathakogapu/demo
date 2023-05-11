package com.example.wrapperclasses;

import java.util.Scanner;

public class DoubleWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("ENter a second number: ");
		double num2 = scanner.nextDouble();
		String string1 = "12345";
		double variable = 22.22;
		Double number1 = new Double(num1);
		Double number2 = new Double(num2);
		System.out.println("byte value method: " + Double.BYTES);
		System.out.println("compare method: " + Double.compare(num1, num2));
		// System.out.println("compare method: "+Double.compareTo(num1, num2));
		System.out.println("double value method: " + Double.doubleToLongBits(variable));
		System.out.println("double value method: " + Double.doubleToRawLongBits(variable));
		System.out.println("is nan  method: " + Double.isNaN(num2));
		System.out.println("infinite value method: " + Double.isInfinite(num2));
		System.out.println("finite value method: " + Double.isFinite(num1));
		System.out.println("valueof method: " + Double.valueOf(string1));
		System.out.println("value of method: " + Double.valueOf(num2));
		System.out.println("To string method: " + Double.toString(variable));
		System.out.println("To hexa string method: " + Double.toHexString(number1));
		System.out.println("sum of two doubles method: " + Double.sum(num1, num2));
		System.out.println("parsedouble method: " + Double.parseDouble(string1));
		System.out.println("long bits value method: " + Double.longBitsToDouble(0));
		System.out.println("hashcode value method: " + Double.hashCode(number2));

		scanner.close();

	}
}