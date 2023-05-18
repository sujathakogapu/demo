package com.example.strings;

import java.util.Scanner;

/*
12. Write a program to find the largest word in a sentence.
    Input:
    Enter a sentence: The quick brown fox jumps over the lazy dog
    Output:
    The largest word in the sentence is: jumps
*/
public class LargestWordInSentence {
	public String getlargestWord(String inputStr) {
		String[] words = inputStr.split(" ");
		String largestWord = "";
		int largeWordLength = 0;
		for (int i = 0; i < words.length; i++) {// hi good morning
			String word = words[i];// 1.hi,2.good,3.morning
			int length = word.length();// 1.length=2,2.length=4,3.length=7
			if (length > largeWordLength) {// 1.2>0->true,2.4>2->true,3.7>4->true
				largestWord = word;// 1.largestWord=hi,2.good,3.morning
				largeWordLength = length;// 1.largestWordLength=2,2.largestWordLength=4,3.largestWordLength=7
			}
		}
		return largestWord;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");// hi good morning
		String inputStr = scanner.nextLine();
		LargestWordInSentence obj = new LargestWordInSentence();
		String outputString = obj.getlargestWord(inputStr);
		System.out.println("the largest word in the sentence:" + outputString);// morning
		scanner.close();
	}
}
