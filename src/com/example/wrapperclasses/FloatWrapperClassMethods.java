package com.example.wrapperclasses;

import java.util.Scanner;

public class FloatWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		float num1=scanner.nextFloat();
		System.out.println("ENter a second number: ");
		float num2=scanner.nextFloat();
        Float number1 = new Float(num1);
        Float number2 = new Float(num2);
        System.out.println("Equals method: "+number1.equals(number2));
        System.out.println("compareTo method: "+number1.compareTo(number2));
        System.out.println("Float to string: "+Float.toString(num2));
        System.out.println("float value: "+Float.valueOf(num1));
        System.out.println("parse float: "+Float.parseFloat(number1.toString()));
        System.out.println("floats in bytes: "+Float.BYTES);
        System.out.println("floats nan method: "+Float.isNaN(num2));
        System.out.println("floats negitive infinity method: "+Float.NEGATIVE_INFINITY);
        System.out.println("floats positive infinity: "+Float.POSITIVE_INFINITY);
        System.out.println("compare to floats: "+Float.compare(num1, num2));
        System.out.println("hexa string: "+Float.toHexString(number2));
        System.out.println("floats infinity: "+Float.isFinite(number1));
        System.out.println("float to in bits method: "+Float.floatToIntBits(num1));
        System.out.println("float max exponnent: "+Float.MAX_EXPONENT);
        scanner.close();
	}
}
