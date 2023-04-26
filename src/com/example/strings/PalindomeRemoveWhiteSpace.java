package com.example.strings;

import java.util.Scanner;

public class PalindomeRemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.next();
		scanner.close();
		String outputStr = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			// inputStr=inputStr.replaceAll("//s", "");
			outputStr = outputStr + inputStr.replaceAll("//s", "");
		}
		if (inputStr.equals(outputStr))
			System.out.print("The string is a valid palindrome");
		else
			System.out.print("The string is not valid palindrome");
	}
}
