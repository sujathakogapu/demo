package com.example.patterns;
/*
4.Print an inverted right triangle pattern of stars using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  *****
  ****
  ***
  **
  *
*/
import java.util.Scanner;
public class InvertedRightTrianglePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");//5
		int row = scanner.nextInt();
		for (int i = row; i > 0; i--) {//5,4,3,2,1
			for (int j = 1; j <= i; j++) {//12345,1234,123,12,1
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
