package com.example.strings;

import java.util.Scanner;
/*
2.Write a program to reverse a string.
  Input:
  Enter a string: hello world
  Output:
  The reversed string is: dlrow olleh
*/

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr = scanner.nextLine();
		String outputStr = "";
		for (int lastIndex = inputStr.length() - 1; lastIndex >= 0; lastIndex--) {
			outputStr = outputStr + inputStr.charAt(lastIndex);//d->d,l->dl,r->dlr,o->dlro,w->dlrow, ->dlrow ,o->dlrow o,l->dlrow ol,l->dlrow oll,e->dlrow olle,h->dlrow olleh
		}
		System.out.print("The reversed string is:" + outputStr);
		scanner.close();

	}
}
