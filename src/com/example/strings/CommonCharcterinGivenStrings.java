package com.example.strings;

import java.util.Scanner;

public class CommonCharcterinGivenStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String inputStr1 = scanner.nextLine();
		System.out.println("Enter the second string:");
		String inputStr2 = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < inputStr1.length(); i++) {
			for (int j = 0; j < inputStr2.length(); j++) {
				if (inputStr1.charAt(i) == inputStr2.charAt(j)) {
					count++;
				}
			}
		}
		System.out.print("Common characters:" + count);
		scanner.close();
	}
}
