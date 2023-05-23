package com.example.patterns;

import java.util.Scanner;

public class PatternDiamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a no of rows:");
		int row = scanner.nextInt();
		PatternDiamond obj = new PatternDiamond();
		obj.printDiamondPattern(row);
		scanner.close();
	}

	public void printDiamondPattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j += 2) {
				System.out.print("*");
			}
			System.out.print("");

		}
	}
}
