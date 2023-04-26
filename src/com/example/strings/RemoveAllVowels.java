package com.example.strings;

import java.util.Scanner;

public class RemoveAllVowels {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String inputStr=scanner.nextLine();
		String outputStr="";
		for(int i=0;i<inputStr.length();i++) {
	        outputStr = inputStr.replaceAll("[AEIOUaeiou]","");
		}
		System.out.print("The string without vowels is:"+outputStr);
		scanner.close();
	}
}
