package com.example.patterns;

/*
2.Print a hollow square pattern of stars using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  *****
  *   *
  *   *
  *   *
  *****
*/
import java.util.Scanner;

public class SquarePattern {
	public void printSquarePattern(int rows) {
		for (int i = 1; i <= rows; i++) {// 1,2,3,4,5
			for (int j = 1; j <= rows; j++) {// 1,2,3,4,5
				if (j == 1 || j == 5 || i == 1 || i == rows) {// j=1,5 or i=1,5,
					System.out.print("*");// inner loop, j loop excute,star printed,
				} else {

					System.out.print(" ");// outer loop,i loop excute
				}
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");// 5
		int rows = scanner.nextInt();
		scanner.close();
		SquarePattern obj = new SquarePattern();
		obj.printSquarePattern(rows);
	}
}
