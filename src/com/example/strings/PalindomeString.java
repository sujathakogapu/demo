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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr a String:");//madam
		String inputStr = scanner.nextLine();
		String outputStr = "";
		for (int i = inputStr.length() - 1;i>=0; i--) {
			outputStr = outputStr + inputStr.charAt(i);//m,a,d,a,m
		}
		if (inputStr.equals(outputStr))//madam.equals(madam)
			System.out.print("The string is a palindrome");//true
		 else 
			System.out.print("The string not a palindrome:");
		scanner.close();
	}

}
