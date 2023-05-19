package com.example.strings;

import java.util.Scanner;

/*
13. Write a program to reverse each word in a sentence.
    Input:
    Enter a sentence: The quick brown fox
    Output:
    The reversed sentence is: ehT kciuq nworb xof
 */
public class ReverseEachWordInASentence {
	public String reverseEachWord(String inputStr) {
		String reverseString = "";
		String[] words = inputStr.split(" ");// hi,hello
		for (int i = 0; i < words.length; i++) {// firstword->0<2,second word->hello->0<5
			String word = words[i];// word=hi,hello
			String reverseWord = "";//
			for (int j = word.length() - 1; j >= 0; j--) {// firstword->1.2-1;1>=0;1--,2.2-1;0>=0;second
															// word->1.5-1;4>=0;4--,2.3>=0;3--,3.2>=0;2--,4.1>=0;1--,5.0>=0;0--
				reverseWord = reverseWord + word.charAt(j);// ih olllh
			}
			reverseString = reverseString + reverseWord + " ";// ih
		}
		return reverseString ;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");// hi hello
		String inputStr = scanner.nextLine();
		ReverseEachWordInASentence obj = new ReverseEachWordInASentence();
		String outputStrings = obj.reverseEachWord(inputStr);
		System.out.println("The reversed sentence is:" + outputStrings);
		scanner.close();
	}
}
