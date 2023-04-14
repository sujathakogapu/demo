package com.example.basics;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int originalNumber, remainder, result = 0;
		Scanner scanner = new Scanner("System.in");
		System.out.println("Enter a number:");
		int num = scanner.nextInt();

		originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

		scanner.close();

	}

}
