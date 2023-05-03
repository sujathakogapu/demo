package com.example.patterns;
/*
1.Print a square pattern of stars using nested loops.
  Input:
  Enter the number of rows: 5
  Output:
  *****
  *****
  *****
  *****
  *****
*/
import java.util.Scanner;
public class PatternExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");//5
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {//1,2,3,4,5
			System.out.println("*****");
		}
		scanner.close();
	}
}
