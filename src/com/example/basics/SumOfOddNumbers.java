package com.example.basics;

import java.util.Scanner;

public class SumOfOddNumbers {
	public int getOddSum(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {

			if (i % 2 != 0) {

				sum = sum + i;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scanner.nextInt();
		SumOfOddNumbers obj = new SumOfOddNumbers();
		int output = obj.getOddSum(num);
		System.out.println("the sum of odd numbers:" + output);

		scanner.close();
	}

}
