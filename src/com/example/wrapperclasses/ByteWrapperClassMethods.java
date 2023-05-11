package com.example.wrapperclasses;

import java.util.Scanner;

public class ByteWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		byte num1 = scanner.nextByte();
		System.out.println("Enter a second number: ");
		byte num2 = scanner.nextByte();
		Byte number1 = new Byte(num1);
		Byte number2 = new Byte(num2);
		System.out.println("compareTo method: "+number1.compareTo(number2));
		System.out.println("Equals method: "+number1.equals(number2));
		System.out.println("hash code method: "+Byte.hashCode(num2));
		//System.out.println("ReverseBytes method: "+Byte.parseByte(null, num2));
		System.out.println("toString method: "+Byte.toString(num2));
		System.out.println("tounsignedInt method: "+Byte.toUnsignedInt(num1));
		System.out.println("to unsignedLong method: "+Byte.toUnsignedLong(num2));
		System.out.println("valueOf method"+Byte.valueOf(num1));
		System.out.println("class method: "+Byte.class);
		System.out.println(" size method: "+Byte.SIZE);
		System.out.println(" bytes method: "+Byte.BYTES);
		System.out.println("bytes: "+Byte.BYTES);
		scanner.close();


		}
	}
