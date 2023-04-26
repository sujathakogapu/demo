package com.example.strings;

import java.util.Scanner;

public class ReplaceACharacterInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.nextLine();
		System.out.println("Enter the character to replace:");
		String ch = scanner.next();
		System.out.println("the replace charcter is:"+ch);
		System.out.print("The new string is:" + inputStr.replace('o', 'a'));
		scanner.close();
	}
}
