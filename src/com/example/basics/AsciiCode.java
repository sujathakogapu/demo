package com.example.basics;

import java.util.Scanner;

public class AsciiCode {
	public int getAsciiCode(char chr) {
		int asciiValue = chr;
		return asciiValue;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char chr = scanner.next().charAt(0);
		AsciiCode obj = new AsciiCode();
		int output = obj.getAsciiCode(chr);
		System.out.println("ASCII value of " + chr + " is: " + output);
		scanner.close();
	}
}
