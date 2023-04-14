package com.example.basics;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (j == 1 || j == row || i == 1 || i == row) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println(" ");
			scanner.close();
		}
	}
}
