package com.example.strings;

import java.util.Scanner;
/*
8.Write a program to convert a string to lowercase.
  Input:
  Enter a string: HELLO WORLD
  Output:
  The string in lowercase is: hello world
*/
public class ConvertAStringToLowercase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//Hello World
		String inputStr = scanner.next();
		scanner.close();
		System.out.print("The string in lowercase is:" + inputStr.toLowerCase());//Hello World->hello world
	}
}
