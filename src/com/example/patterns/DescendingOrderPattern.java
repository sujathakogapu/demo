package com.example.patterns;

import java.util.Scanner;

public class DescendingOrderPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = row; i >= 1; i--) {
			for (int j = row; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
		scanner.close();
	}
}
