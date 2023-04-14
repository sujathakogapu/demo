package com.example.patterns;

import java.util.Scanner;

public class PrintHollowStarPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++)
			{
				System.out.print(" ");
			}
			if (i == 1 || i == row)
				for (int j = 1; j <= i * 2 - 1; j++)
				{
					System.out.print("*");
				}
			else {
				for (int j = 1; j <= i * 2 - 1; j++)
				{
					if (j == 1 || j == i * 2 - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();

	}
}
