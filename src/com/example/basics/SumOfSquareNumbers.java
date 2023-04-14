package com.example.basics;

import java.util.Scanner;

public class SumOfSquareNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		int squareSum;
		{
			{

				squareSum = (num * (num + 1) * (2 * num + 1)) / 6;
			}
			System.out.println("Sum of Square sum is:" + squareSum);
		}
		scanner.close();

	}

}
