package com.example.basics;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static void main(String[] args) {
		int gcd = 1, lcm = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			lcm = (num1 * num2) / gcd;
		}
		System.out.println("The LCM of num1 and num2 is:" + lcm);
		scanner.close();

	}

}
