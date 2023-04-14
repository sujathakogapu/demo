package com.example.basics;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("the sum of even numbers:" + sum);

		scanner.close();
	}

}
