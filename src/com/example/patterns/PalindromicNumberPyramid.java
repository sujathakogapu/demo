package com.example.patterns;

import java.util.Scanner;

public class PalindromicNumberPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= row; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j + "");
			for (int j = i - 1; j >= 1; j--)
				System.out.print(j + "");
			System.out.println();
		}
		scanner.close();
	}
}
