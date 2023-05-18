package com.example.strings;

import java.util.Scanner;

/*
18. Write a program that prompts the user to enter a string and then
    capitalizes the first letter of each word.
    Input:
    Enter a string: java programming is fun
    Output:
    Java Programming Is Fun
*/
public class CapitalizesFirstLetterInEveryWord {
	public String getCapitalizesFirstLetterOfEachWord(String inputStr) {
		String outputStr = " ";
		String[] words = null;
		for (int i = 0; i < words.length; i++) {// java
			String word = words[i];
			outputStr = outputStr + " " + word.substring(0, 1).toUpperCase() + word.substring(1);
		}
		System.out.println(outputStr.trim());
		return outputStr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inputStr = scanner.nextLine();
		String[] words = inputStr.split(" ");
		CapitalizesFirstLetterInEveryWord obj = new CapitalizesFirstLetterInEveryWord();
		String output=obj.getCapitalizesFirstLetterOfEachWord(inputStr);
		System.out.println(output);
		scanner.close();
	}
}
