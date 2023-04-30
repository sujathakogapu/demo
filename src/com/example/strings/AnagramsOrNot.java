package com.example.strings;

import java.util.Scanner;
/*
20. Write a Java program to check if two given strings are anagrams or
    not.
    Input:
    Enter first string: listen
    Enter second string: silent
    Output:
    Strings are anagrams.
 */
public class AnagramsOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first String:");
		String inputStr1=scanner.nextLine().toLowerCase();
		System.out.print("Enter second string:");
		String inputStr2=scanner.nextLine().toLowerCase();
		int string1=inputStr1.length();
		int string2=inputStr2.length();
		String anagrams=" ";
if(string1==string2) {
	System.out.print("given strings are equal so we can check anagrams:");
		}
//for(int i=0;i<inputStr1.length();i++) {
	//char[] ch1=new char[i];
	//for(int j=0;j<inputStr2.length();j++) {
		//char[] ch2=new char[j];
anagrams=inputStr1
}
}
	}
	

}
