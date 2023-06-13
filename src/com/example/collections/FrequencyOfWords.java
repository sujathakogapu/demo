package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 13. Write a program to count the frequency of words in a sentence using a
HashMap.
Input:
Sentence: "I love to code and I love to learn."
Output:
Word frequency:
"I": 2
"love": 2
"to": 2
"code": 1
"and": 1
"learn": 1

 */
public class FrequencyOfWords {
	public static void main(String[] args) {
		int[] freq = null;
		Scanner scanner=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<>();
		System.out.println("Enter a sentence: ");
		String inputStr=scanner.nextLine();
		String[] words = inputStr.split(" ");
		for(int i=0;i<inputStr.length();i++) {
			 freq[i]=1;
			 }
			 }
		}
		

