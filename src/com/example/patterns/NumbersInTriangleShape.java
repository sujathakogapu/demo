package com.example.patterns;
/*
7.Print a pattern of numbers in a triangle shape using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  1
  22
  333
  4444
  55555
*/
import java.util.Scanner;

public class NumbersInTriangleShape {
	public void printNumbersInTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {//1,2,3,4,5
			for (int j = 1; j <= i; j++) {//1,12,123,1234,12345
				System.out.print(i + " ");//1,22,333,4444,5555
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");//5
		int rows = scanner.nextInt();
		NumbersInTriangleShape obj=new NumbersInTriangleShape();
		obj.printNumbersInTriangle(rows);
		scanner.close();
	}
}
