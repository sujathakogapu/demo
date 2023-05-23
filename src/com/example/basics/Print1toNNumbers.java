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
public int getNNumbers(int num) {
	for (int i = 1; i <= num; i++) {
	}
	return num;
}
	public static void main(String[] args) {
		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a n:");
		int num = scanner.nextInt();
		Print1toNNumbers obj=new Print1toNNumbers();
		int output=obj.getNNumbers(num);
			System.out.print(" "+i+" ");
		scanner.close();
	}
}
