package com.example.basics;

/*
6.Write a program to calculate and print the average of three numbers.
  Input:
  Enter the first number: 4
  Enter the second number: 7
  Enter the third number: 2
  Output:
  The average of 4, 7, and 2 is: 4.33
 */
import java.util.Scanner;

public class AverageCal {
	public double getAverage(int num1, int num2, int num3) {
		double average = (num1 + num2 + num3) / 3;
		return average;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");// 4
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number: ");// 7
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number: ");// 2
		int num3 = scanner.nextInt();
		AverageCal obj = new AverageCal();
		double output = obj.getAverage(num1, num2, num3);
		System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + output);
		scanner.close();
	}
}
