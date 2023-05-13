package com.example.wrapperclasses;

import java.util.Scanner;

public class CharacterWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first String: ");
		char char1 = scanner.nextLine().charAt(0);
		System.out.println("Enter a second String: ");
		char char2 = scanner.nextLine().charAt(0);
		Character char3 = new Character(char1);
		Character char4 = new Character(char2);
		System.out.println("Digit method: "+Character.isDigit('A'));
		System.out.println("Digit method2: "+Character.isDigit('0'));
		System.out.println("value of method: "+Character.valueOf(char2));
		System.out.println("Compare method: "+Character.compare(char1, char2));
		System.out.println("byte method: "+Character.BYTES);
		System.out.println("currency method: "+Character.CURRENCY_SYMBOL);
		System.out.println("max value method: "+Character.MAX_VALUE);
		System.out.println("size method: "+Character.SIZE);
		System.out.println("char count method: "+Character.charCount(char2));
		System.out.println("Digit method: "+Character.digit(char1, char2));
		System.out.println("For digit method: "+Character.forDigit(char1, char2));
		System.out.println("lower case method: "+Character.LOWERCASE_LETTER);
		System.out.println("touppercase method: "+Character.toUpperCase(char2));
		System.out.println("To title case: "+Character.toTitleCase(char3));
		System.out.println("tochars method: "+Character.toChars(char4));
		System.out.println("getdirectionality: "+Character.getDirectionality(char2));
		System.out.println("size method: "+Character.SIZE);
		System.out.println("format method: "+Character.FORMAT);
		System.out.println("max high surrogate method: "+Character.MAX_HIGH_SURROGATE);
		System.out.println("min high surrogate: "+Character.MIN_HIGH_SURROGATE);
		System.out.println("digit method: "+Character.digit(char2, char1));
		System.out.println("math symbol method: "+Character.MATH_SYMBOL);
		System.out.println("type method: "+Character.TYPE);
		scanner.close();

	}
}
