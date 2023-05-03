package com.example.basics;

import java.util.Scanner;

/*
8.Write a program to find the largest of three numbers.
  Input:
  Enter the first number: 7
  Enter the second number: 4
  Enter the third number: 9
  Output:
  The largest number is: 9
 */
public class LargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");// 7
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");// 4
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number:");// 9
		int num3 = scanner.nextInt();
		if ((num1 > num2) && (num1 > num3)) {// (7>4) && (7>9)
			System.out.println("The largest number is: " + num1);// false
		} else if (num2 > num3) {// 7>9
			System.out.println("The largest number is: " + num2);// false

		} else {
			System.out.println("The largest number is: " + num3);// print
		}
		scanner.close();
	}
}
