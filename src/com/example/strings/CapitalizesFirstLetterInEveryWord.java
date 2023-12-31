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
	public String capitalizeEachWord(String inputStr) {
		String outputStr = " ";
		String[] words = inputStr.split(" ");
		for (int i = 0; i < words.length; i++) {// java
			String word = words[i];
			outputStr = outputStr + " " + word.substring(0, 1).toUpperCase() + word.substring(1);
		}
		return outputStr.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inputStr = scanner.nextLine();
		CapitalizesFirstLetterInEveryWord obj = new CapitalizesFirstLetterInEveryWord();
		String output = obj.capitalizeEachWord(inputStr);
		System.out.println(output);
		scanner.close();
	}
}
