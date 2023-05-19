package com.example.strings;

import java.util.Scanner;

/*
15. Write a program to check whether a string contains a given substring
    or not.
    Input:
    Enter a string: Hello World
    Enter the substring to search: World
    Output:
    The string contains the substring.
*/
public class StringContainsAGivenSubstring {
	public boolean hasSubString(String inputStr, String subString) {
		boolean hasSubString = false;
		if (inputStr.contains(subString)) {
			hasSubString = true;
		}
		return hasSubString;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");// hello world
		String inputStr = scanner.nextLine();
		System.out.println("Enter the substring to search:");// world
		String subString = scanner.next();
		StringContainsAGivenSubstring obj = new StringContainsAGivenSubstring();
		boolean output = obj.hasSubString(inputStr, subString);
		System.out.print("The string not contains the substring?: " + output);
		scanner.close();
	}
}
