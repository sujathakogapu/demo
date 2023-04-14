package com.example.basics;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		int num2 = 0, lastdigit, sumOfFact = 0, fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = scanner.nextInt();
		num1 = num2;
		while (num2 > 0) {
			lastdigit = num2 % 10;
			for (int i = 1; i <= lastdigit; i++) {
				fact = fact * i;
			}
			sumOfFact = sumOfFact + fact;
			num2 = num2 / 10;
		}
		if (num1 == sumOfFact) {
			System.out.println("Given no is a strong number:" + num1);
		} else {

			System.out.println("Given no is not strong number:" + num1);
		}
		scanner.close();

	}
}
