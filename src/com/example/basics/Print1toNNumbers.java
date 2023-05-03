package com.example.basics;

import java.util.Scanner;

/*
2.Write a program to print the numbers from 1 to n.
  Input:
  Enter n: 5
  Output:
  1 2 3 4 5
 */
public class Print1toNNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a n:");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(" "+i+" ");
		}
		scanner.close();
	}
}
