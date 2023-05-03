package com.example.patterns;
/*
2.Print a hollow square pattern of stars using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  *****
  * *
  * *
  * *
  *****
*/
import java.util.Scanner;

public class HallowPyramidNumberPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {//1,2,3,4,5
			for (int j = 1; j <= i; j++) {//1,2,3,4,5
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
