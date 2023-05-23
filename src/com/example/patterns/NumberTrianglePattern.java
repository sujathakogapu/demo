package com.example.patterns;

import java.util.Scanner;

public class NumberTrianglePattern {
	public void printNumberTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		NumberTrianglePattern obj=new NumberTrianglePattern();
		obj.printNumberTriangle(row);
		scanner.close();
	}

}
