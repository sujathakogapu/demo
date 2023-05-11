package com.example.wrapperclasses;

import java.util.Scanner;

public class LongWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		long num1 = scanner.nextLong();
		System.out.println("Enter a second number: ");
		long num2 = scanner.nextLong();
		Long number1 = new Long(num1);
		Long number2 = new Long(num2);
		System.out.println("compareTo method: "+number1.compareTo(number2));
		System.out.println("Equals method: "+number1.equals(number2));
		System.out.println("hash code method: "+Long.hashCode(num2));
		System.out.println("ReverseBytes method: "+Long.reverseBytes(num2));
		System.out.println("toString method: "+Long.toString(num2));
		System.out.println("tounsignedInt method: "+Long.compareUnsigned(num1, num2));
		System.out.println("to unsignedLong method: "+Long.divideUnsigned(num1, num2));
		System.out.println("valueOf method"+Long.valueOf(num1));
		System.out.println("class method: "+Long.class);
		System.out.println("long size method: "+Short.SIZE);
		System.out.println("long bytes method: "+Short.BYTES);
		//System.out.println("decode method: "+Long.decode(null));
		System.out.println("getlong method: "+Long.getLong(null, num2));
		System.out.println("binart string: "+Long.toBinaryString(num2));
		System.out.println("hexa string: "+Long.toHexString(num1));
		System.out.println("octal string: "+Long.toOctalString(num2));
		System.out.println("remainderunsigned method: "+Long.remainderUnsigned(num1, num2));
		//System.out.println("parse long: "+Long.parseLong(null, 0));
		System.out.println("number of traling zeros: "+Long.numberOfTrailingZeros(num2));
		//System.out.println("parse un signed long: "+Long.parseUnsignedLong(null, 0));
		scanner.close();
	}
}


