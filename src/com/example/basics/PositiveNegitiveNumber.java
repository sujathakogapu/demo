package com.example.basics;

import java.util.Scanner;

public class PositiveNegitiveNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println("It is positive number");
		} else if (num == 0) {
			System.out.println("It is neither positive nor negative");
		} else {
			System.out.println("It is Negative number");
		}
		scanner.close();

	}

}
