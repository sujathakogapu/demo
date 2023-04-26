package com.example.strings;

import java.util.Scanner;

public class LargestWordInSentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String inputStr = scanner.nextLine();
		String[] words = inputStr.split(" ");
		String largestWord = "";
		int largeWordLength = 0;
		for (int i = 0; i <words.length; i++) {
			String word = words[i];
			int length = word.length();
			if (length > largeWordLength) {
				largestWord = word;
				largeWordLength = length;
			}
		}
		System.out.println(largestWord);
		scanner.close();
	}
}
