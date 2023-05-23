package com.example.patterns;

import java.util.Scanner;

public class NumbersInRightTriangleShape {
	public void printNumbersRightTriangle(int row) {
		for (int i = 1; i <= row; i++) {//1,2,3,4,5
			for (int j = 1; j <= i; j++) {//1,12,123,1234,12345
				if (j % 2 == 0) {//false,
					System.out.print(0);
				} else {
					System.out.print(1);//1
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");//5
		int row = scanner.nextInt();
		NumbersInRightTriangleShape obj=new NumbersInRightTriangleShape();
		obj.printNumbersRightTriangle(row);
		scanner.close();
	}
}
