package com.example.basics;

import java.util.Scanner;

public class PatternDiamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j += 2) {
				System.out.print("*");
			}
			System.out.print("");

		}
		scanner.close();
	}
}
