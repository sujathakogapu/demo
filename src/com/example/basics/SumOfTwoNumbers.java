package com.example.basics;

import java.util.Scanner;

/*
3.Write a program to calculate and print the sum of two numbers.
  Input:
  Enter the first number: 5
  Enter the second number: 7
  Output:
  The sum of 5 and 7 is: 12
*/
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.print("The sum of given nos is:" + sum);
		scanner.close();
	}
}
