package com.example.patterns;

import java.util.Scanner;

public class HallowPyramidNumberPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == row)
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
