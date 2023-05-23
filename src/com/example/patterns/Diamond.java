package com.example.patterns;
/*
5.Print a diamond pattern of stars using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  *
 ***
*****
 ***
  *
*/
import java.util.Scanner;

public class Diamond {
	public void printDiamondPattern(int row) {
		for (int i = 1; i <= row; i++) {//1,2,3,4,5
			for (int j = 1; j <= row - i; j++) {//1234,123,12,1
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; i++) {//1,3,5,7,9
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = row - 1; i > 0; i--) {//4321,321,21,1
			for (int j = 1; j <= row - i; j++) {//1234,123,12,1
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {//1,3,5,7,9
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entera no of rows:");
		int row = scanner.nextInt();
		scanner.close();
		Diamond obj = new Diamond();
		obj.printDiamondPattern(row);
	}
}
