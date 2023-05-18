package com.example.strings;

import java.util.Scanner;

/*
16. Write a program that prompts the user to enter a sentence, and then
    splits the sentence into individual words using the split() method. The
    program should then print out each word on a separate line.
    Input:
    Enter a sentence: The quick brown fox jumps over the lazy dog.
    Output:
    The
    quick
    brown
    fox
    jumps
    over
    the
    lazy
    dog
*/
public class WordSplitMethod {
	public String[] getWordSplit(String inputStr) {
		String[] words = inputStr.split(" ");// split() will divide the line based on given character and converts into
												// string array
		return words;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");// hi hello world
		String inputStr = scanner.nextLine();
		WordSplitMethod obj = new WordSplitMethod();
		String[] outputStrings = obj.getWordSplit(inputStr);
		for(int i=0;i< outputStrings.length;i++) {
			System.out.println(outputStrings[i]);
		}
		scanner.close();
	}
}
