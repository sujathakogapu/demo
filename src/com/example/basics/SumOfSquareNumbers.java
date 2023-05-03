package com.example.basics;

/*
20. Write a program to find the sum of the squares of the first n natural
    numbers. For e.g. the sum of squares for the first five natural numbers
   (1 to 5) is 1
   2+2
   2+3
   2+4
   2+5
   2 = 55.
   Input:
   Enter n: 5
   Output:
   sum of squares = 55
*/
import java.util.Scanner;

public class SumOfSquareNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");// 5->1,2,3,4,5->1+4+9+16+25
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + (i * i);
		}
		System.out.println("Sum of Square sum is:" + sum);
		scanner.close();
	}
}
