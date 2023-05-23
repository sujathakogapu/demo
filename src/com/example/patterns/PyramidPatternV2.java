package com.example.patterns;

import java.util.Scanner;

public class PyramidPatternV2 {
	public void printPyramidV2(int row) {
		for (int i = 0; i < row; i++) {// first iteration:i=0,1,2,3,4
			for (int j = row - i; j > 1; j--) {// j=5,4,3,2
				System.out.print(" ");// 4times spece,3 times spece,2 times space,1 time space
			}
			for (int j = 0; j <= i; j++) {// 0,01,012,0123,01234,
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");// 5
		int row = scanner.nextInt();
		PyramidPatternV2 obj = new PyramidPatternV2();
		obj.printPyramidV2(row);
		scanner.close();
	}
}
