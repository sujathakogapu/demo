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

public class HollowSquarePattern {
	public void printHollow(int rows) {
		for (int i = 1; i <= rows; i++) {//1,2,3,4,5
			for (int j = 1; j <= i; j++) {//1,2,3,4,5
				if (j == 1 || j == i || i == rows)
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		HollowSquarePattern obj=new HollowSquarePattern();
		obj.printHollow(row);
		scanner.close();
	}
}
