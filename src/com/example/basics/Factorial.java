package com.example.basics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the sum of  numbers:" + fact);
		scanner.close();
	}

}
