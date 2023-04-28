package com.example.strings;

import java.util.Scanner;

/*
21. Write a Java program to find the number of occurrences of a given
    substring in a string.
    Input:
    Enter a string: hello world
    Enter a substring: llo
    Output:
    Number of occurrences: 1
 */
public class NumberOfOccurencesSubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.nextLine();
		System.out.println("Enter a sub string:");
		String subStr = scanner.nextLine();
		int occurrence = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.substring(i) == subStr) {
				occurrence++;
			}
		}
		System.out.print("Number of occurrences: " + occurrence);
		scanner.close();
	}
}
