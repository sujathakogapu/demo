package com.example.strings;

import java.util.Scanner;

/*
21. Write a Java program to find the number of occurrences of a given
    substring in a string.
    Input:
    Enter a string: hello world
    Enter a substring: llo
    Output:
    Number of occurrences: 1
 */
public class NumberOfOccurencesSubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//sujathapadmavathi
		String inputStr = scanner.nextLine();
		System.out.println("Enter a sub string:");//ath
		String subStr = scanner.nextLine();
		int occurrence = 0;
		int fromIndex=0;
		while(inputStr.indexOf(subStr, fromIndex)!=-1) {//0->ath->3->true,6->ath->13->true,16->ath->-1->false
			occurrence++;//1+1
			fromIndex=inputStr.indexOf(subStr, fromIndex)+subStr.length();//3+3->6,13+3->16
		}
		System.out.print("Number of occurrences: " + occurrence);
		scanner.close();
	}
}
