package com.example.strings;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.next();
		for (int i = 0; i < inputStr.length(); i++) {
		}
		System.out.print("The string after removing white spaces is:" +inputStr.replaceAll("//s",""));
		scanner.close();
	}
}
