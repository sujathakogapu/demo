package com.example.basics;

import java.util.Scanner;

public class LoopPrime {
	public static void main(String[] args) {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;

			}
		}
		if (flag)
			System.out.println(num + "is not a prime number");
		else
			System.out.println(num + " is  a prime number");
		scanner.close();

	}

}
