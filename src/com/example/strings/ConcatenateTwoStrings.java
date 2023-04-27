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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");//hello sir
		String inputStr1 = scanner.next();
		System.out.println("Enter the second string:");// gud morning
		String inputStr2 = scanner.next();
		String outputStr3 = "";
		outputStr3 = inputStr1.concat(inputStr2);//hello sir.concate(gud morning)
		System.out.print("The concatenated string is:" + outputStr3);//hello sir gud morning
		scanner.close();
	}

}
