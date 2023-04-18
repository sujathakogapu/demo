package com.example.basics;

import java.util.Scanner;

public class AsciiCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char chr = scanner.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII value of " + chr + " is: " + asciiValue);
		scanner.close();
	}
}
