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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");// 4
		float num1 = scanner.nextFloat();
		System.out.println("Enter the second number: ");// 7
		float num2 = scanner.nextFloat();
		System.out.println("Enter the third number: ");// 2
		float num3 = scanner.nextFloat();
		float avrg = (num1 + num2 + num3) / 3;// (4+7+2)/3
		System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avrg);
		scanner.close();
	}
}
