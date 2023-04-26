package com.example.strings;

import java.util.Scanner;

public class FrequencyOfACharacterInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.nextLine();
		System.out.print("Enter a character:");
		char ch = scanner.nextLine().charAt(0);
		int freq = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == ch) {
				freq++;
			}
		}
		System.out.print("The frequency of 'l' in the string is:" + freq);
		scanner.close();
	}
}
