package com.example.strings;

import java.util.Scanner;

public class StringContainsAGivenSubstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String inputStr = scanner.nextLine();
		System.out.println("Enter the substring to search:");
		String subString = scanner.next();
		if (inputStr.contains(subString))
			System.out.print("The string contains the substring");
		else
			System.out.print("The string not contains the substring");
		scanner.close();
	}
}
