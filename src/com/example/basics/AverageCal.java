package com.example.basics;

import java.util.Scanner;

public class AverageCal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float num1 = scanner.nextFloat();
		System.out.println("Enter the second number: ");
		float num2 = scanner.nextFloat();
		System.out.println("Enter the third number: ");
		float num3 = scanner.nextFloat();
		float avrg = (num1 + num2 + num3) / 3;
		// avrg = avrg.toFixed(2);
		System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avrg);
		scanner.close();
	}

}
