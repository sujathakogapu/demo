package com.example.strings;

import java.util.Scanner;

public class ConcatenateTwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String inputStr1 = scanner.next();
		System.out.println("Enter the second string:");
		String inputStr2 = scanner.next();
		String outputStr3 = "";
		outputStr3 = inputStr1.concat(inputStr2);
		System.out.print("The concatenated string is:" + outputStr3);
		scanner.close();
	}

}
