package com.example.strings;

import java.util.Scanner;
/*
5.Write a program to remove all the white spaces from a string.
  Input:
  Enter a string: hello world
  Output:
  The string after removing white spaces is: helloworld
 */
public class RemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hi hello
		String inputStr = scanner.nextLine();
		System.out.print("The string after removing white spaces is:" +inputStr.replace(" ",""));//inpuStr.replace("space->means old char","no space->means new char")
		scanner.close();
	}
}
