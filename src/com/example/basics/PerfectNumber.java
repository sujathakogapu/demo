package com.example.basics;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		long num, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scanner.nextLong();
		int i = 1;
		while (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println(num + " is a perfect number.");
		} else
			System.out.println(num + " is not a perfect number.");
		scanner.close();
	}

}
