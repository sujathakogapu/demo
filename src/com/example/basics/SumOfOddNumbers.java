package com.example.basics;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {

			if (i % 2 != 0) {

				sum = sum + i;
			}

		}
		System.out.println("the sum of odd numbers:" + sum);

		scanner.close();
	}

}
