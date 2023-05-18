package com.example.strings;

import java.util.Scanner;

/*
7.Write a program to concatenate two strings.
  Input:
  Enter the first string: hello
  Enter the second string: world
  Output:
  The concatenated string is: helloworld
*/
public class ConcatenateTwoStrings {
	public String getConcatenateTwoStrings(String inputStr1, String inputStr2) {
		String outputStr3 = "";
		outputStr3 = inputStr1.concat(inputStr2);// hello sir.concate(gud morning)
		System.out.print("The concatenated string is:" + outputStr3);// hello sir gud morning
		return outputStr3;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");// hello sir
		String inputStr1 = scanner.next();
		System.out.println("Enter the second string:");// gud morning
		String inputStr2 = scanner.next();
		ConcatenateTwoStrings obj = new ConcatenateTwoStrings();
		String outputString = obj.getConcatenateTwoStrings(inputStr1, inputStr2);
		System.out.println("The concatenated string is: " + outputString);
		scanner.close();
	}

}
