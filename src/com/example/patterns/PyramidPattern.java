package com.example.patterns;

import java.util.Scanner;

public class PyramidPattern {
	public void printPyramid(int row) {
		int i, j = 0;

		for (i = 1; i <= row; ++i, j = 0) {// 1,2,3,4,5,
			for (int space = 1; space <= row - i; ++space) {// 1234,123,12,1
				System.out.print("  ");//
			}
			while (j != 2 * i - 1) {// 1,3,5,7,9
				System.out.print("*");// *
				++j;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");// 5
		int row = scanner.nextInt();
		PyramidPattern obj = new PyramidPattern();
		obj.printPyramid(row);
		scanner.close();
	}
}
