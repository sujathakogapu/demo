package com.example.strings;

import java.util.Scanner;

public class ReverseEachWordInASentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inputStr = scanner.nextLine();
		String[] words = inputStr.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("The reversed sentence is:"+reverseString);
		scanner.close();
	}
}
