package com.example.patterns;
/*
8.Print a pattern of numbers in a left down triangle shape using nested
  loops.
  Input:
  Enter the number of rows: 5
  Output:
  12345
  1234
  123
  12
  1
*/
import java.util.Scanner;
public class NumbersInLeftDownTriangleShape {
	public void printNumbersInLeftTriangle(int row) {
		for (int i = row; i >= 1; i--) {//54321,4321,321,21,1
			for (int j = 1; j <= i; j++) {//12345,1234,123,12,1
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		NumbersInLeftDownTriangleShape obj=new NumbersInLeftDownTriangleShape();
		obj.printNumbersInLeftTriangle(row);
		scanner.close();
	}
}
