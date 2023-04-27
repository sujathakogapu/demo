package com.example.strings;

import java.util.Scanner;
/*
14. Write a program to remove all the vowels from a string.
    Input:
    Enter a string: Hello World
    Output:
    The string without vowels is: Hll Wrl
*/
public class RemoveAllVowels {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence:");//HI hello
		String inputStr=scanner.nextLine();
		String outputStr=inputStr;
		outputStr=outputStr.replace("a", "");//false
		outputStr=outputStr.replace("e", "");//true->""->means remove the this vowel
		outputStr=outputStr.replace("i", "");//false->small i
		outputStr=outputStr.replace("o", "");//true->""
		outputStr=outputStr.replace("u", "");//false
		outputStr=outputStr.replace("A", "");//false
		outputStr=outputStr.replace("E", "");//false->capital E
		outputStr=outputStr.replace("I", "");//true->""
		outputStr=outputStr.replace("O", "");//false->capital o
		outputStr=outputStr.replace("U", "");//false->capital U
		System.out.print("The string without vowels is:"+outputStr);
		scanner.close();
	}
}
