package com.example.strings;

import java.util.Scanner;
/*
10.Write a program to replace a character in a string.
    Input:
    Enter a string: hello world
    Enter the character to replace: o
    Enter the new character: a
    Output:
    The new string is: hella warld
*/

public class ReplaceACharacterInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hello world
		String inputStr = scanner.nextLine();
		System.out.println("Enter the character to replace:");//o
		char oldCh = scanner.next().charAt(0);
		System.out.println("Enter the new character:");//a
		char newCh=scanner.next().charAt(0);
		System.out.print("The new string is:" + inputStr.replace(oldCh, newCh));//hella warld
		scanner.close();
	}
}
