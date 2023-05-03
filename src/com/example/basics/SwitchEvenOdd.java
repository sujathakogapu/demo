package com.example.basics;

import java.util.Scanner;

/*
7.Write a program to determine whether a number is even or odd.
  Input:
  Enter a number: 9
  Output:
  9 is an odd number.
*/
public class SwitchEvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entera number:");
		int number = scanner.nextInt();
		switch (number % 2) {
		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		scanner.close();
	}
}
