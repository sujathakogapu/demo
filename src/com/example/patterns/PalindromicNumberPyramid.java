package com.example.patterns;

import java.util.Scanner;

public class PalindromicNumberPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {//12345
			for (int j = i; j <= row; j++)//12345,2345,345,45,5
				System.out.print(" ");
			for (int j = 1; j <= i; j++)//1,12,123,1234,12345
				System.out.print(j + "");//1
			for (int j = i - 1; j >= 1; j--)//0,
				System.out.print(j + "");
			System.out.println();
		}
		scanner.close();
	}
}
