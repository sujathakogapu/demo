package com.example.strings;

import java.util.Scanner;

public class LengthOfAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.nextLine();
		System.out.print("The length of a string is:" + inputStr.length());
		scanner.close();
	}
}
