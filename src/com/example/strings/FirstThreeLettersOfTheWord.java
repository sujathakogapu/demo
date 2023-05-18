package com.example.strings;

import java.util.Scanner;

/*
17. Write a program that prompts the user to enter a word, and then prints
    out the first three letters of the word using the substring() method.
    Input:
    Enter a word: Elephant
    Output:
    First three letters: Ele
*/
public class FirstThreeLettersOfTheWord {
	public String getFirstThreeLettersInWord(String inputStr) {
		String outputStr = "";
		outputStr = inputStr.substring(0, 3);
		return outputStr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inputStr = scanner.nextLine();
		FirstThreeLettersOfTheWord obj = new FirstThreeLettersOfTheWord();
		String outputString = obj.getFirstThreeLettersInWord(inputStr);
		System.out.print("First three letters:" + outputString);
		scanner.close();
	}
}
