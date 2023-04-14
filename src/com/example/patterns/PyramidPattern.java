package com.example.patterns;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		int i, j = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (i = 1; i <= row; ++i, j = 0) {
			for (int space = 1; space <= row - i; ++space) {
				System.out.print("  ");
			}
			while (j != 2 * i - 1) {
				System.out.print("*");
				++j;
			}
			System.out.println();
		}
		scanner.close();
	}

}
