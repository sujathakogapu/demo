package com.example.strings;

import java.util.Scanner;

public class PalindomeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr a String:");
		String inputStr = scanner.next();
		String outputStr = "";
		for (int i = inputStr.length() - 1;i>=0; i--) {
			outputStr = outputStr + inputStr.charAt(i);
		}
		if (inputStr.equals(outputStr))
			System.out.print("The string is a palindrome:" + outputStr);
		 else 
			System.out.print("The string not a palindrome:" + outputStr);
		scanner.close();
	}

}
