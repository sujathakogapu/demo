package com.example.strings;

import java.util.Scanner;

public class ConvertAStringToLowercase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.next();
		scanner.close();
		for(int i=0;i<inputStr.length();i++) {
		}
		System.out.print("The string in lowercase is:" + inputStr.toLowerCase());
	}
}
