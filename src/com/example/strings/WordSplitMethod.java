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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");//hi hello world
		String inputStr = scanner.nextLine();
		String[] words = inputStr.split(" ");
		String splitWords = "";
		for (int i = 0; i < words.length; i++) {
		    splitWords = splitWords + words[i];
		}
		System.out.println(splitWords);
		scanner.close();
	}

}
