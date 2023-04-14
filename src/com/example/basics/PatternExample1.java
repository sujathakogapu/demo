package com.example.basics;

import java.util.Scanner;

public class PatternExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			System.out.println("*****");
		}

		scanner.close();

	}

}
