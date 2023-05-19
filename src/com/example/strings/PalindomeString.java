package com.example.strings;

import java.util.Scanner;

/*
4.Write a program to check whether a string is a palindrome or not.
  Input:
  Enter a string: racecar
  Output:
  The string is a palindrome.
*/
public class PalindomeString {
	public boolean isPalindrome(String inputStr) {
		boolean isPalindrome = false;
		String outputStr = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			outputStr = outputStr + inputStr.charAt(i);// m,a,d,a,m
		}
		if (inputStr.equals(outputStr)) {
			isPalindrome = true;// madam.equals(madam)
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr a String:");// madam
		String inputStr = scanner.nextLine();
		PalindomeString obj = new PalindomeString();
		boolean output = obj.isPalindrome(inputStr);
		System.out.println("The string is a palindrome?: " + output);

		scanner.close();
	}

}
