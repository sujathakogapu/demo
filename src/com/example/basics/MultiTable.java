package com.example.basics;

import java.util.Scanner;
/*
9.Write a program to print the multiplication table of a number using a
  for loop
  Input:
  Enter a number: 5
  Output:
  5 x 1 = 5
  5 x 2 = 10
  5 x 3 = 15
  5 x 4 = 20
  5 x 5 = 25
  5 x 6 = 30
  5 x 7 = 35
  5 x 8 = 40
  5 x 9 = 45
 5 x 10 = 50
*/
public class MultiTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");// 5
		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {// 1,1<=10,2
			System.out.println(num + "*" + i + "=" + num * i);// 5 * 1 = 5*1,5 * 2 = 10
		}
		scanner.close();
	}
}
