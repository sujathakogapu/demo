package com.example.strings;

import java.util.Scanner;
/*
6.Write a program to check whether a string is a valid palindrome ignoring
  case sensitivity and white spaces.
  Input:
  Enter a string: A man a plan a canal Panama
  Output:
  The string is a valid palindrome
*/
public class PalindromeRemoveWhiteSpace {
	public boolean isValidPalindrome(String inputStr) {
		String outputStr=" ";
		boolean isPalindrome=false;
		for (int i = inputStr.length() - 1; i >= 0; i--) {//m,o,m, ,i,h
			outputStr = outputStr + inputStr.charAt(i);//mom ih.replace(" ","")->momhi
		}
		if (inputStr.equalsIgnoreCase(outputStr)) {
			isPalindrome=true;
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hi mom 
		String inputStr = scanner.nextLine();
		inputStr=inputStr.replace(" ", "");
		scanner.close();
		PalindromeRemoveWhiteSpace obj=new PalindromeRemoveWhiteSpace();
		boolean output=obj.isValidPalindrome(inputStr);
		System.out.println("The string is a valid palindrome?: "+output);
	}
}
