package com.example.wrapperclasses;

import java.util.Scanner;

public class ShortWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		short num1 = scanner.nextShort();
		System.out.println("Enter a second number: ");
		short num2 = scanner.nextShort();
		Short number1 = new Short(num1);
		Short number2 = new Short(num2);
		System.out.println("compareTo method: "+number1.compareTo(number2));
		System.out.println("Equals method: "+number1.equals(number2));
		System.out.println("hash code method: "+Short.hashCode(num2));
		//System.out.print("parseShort method: "+Short.parseShort(null));
		//System.out.print("parseShort method2"+Short.parseShort(null, num2));
		System.out.println("ReverseBytes method: "+Short.reverseBytes(num2));
		System.out.println("toString method: "+Short.toString(num2));
		System.out.println("tounsignedInt method: "+Short.toUnsignedInt(num1));
		System.out.println("to unsignedLong method: "+Short.toUnsignedLong(num2));
		//System.out.print("Decode method: "+Short.decode(null));
		System.out.println("valueOf method"+Short.valueOf(num1));
		System.out.println("class method: "+Short.class);
		System.out.println("short size method: "+Short.SIZE);
		System.out.println("short bytes method: "+Short.BYTES);
		scanner.close();
	}
}
