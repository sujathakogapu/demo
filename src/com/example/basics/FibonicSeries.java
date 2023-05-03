package com.example.basics;

import java.util.Scanner;

/*
12. Write a program to print the Fibonacci series up to n terms.
    Input:
    Enter the number of terms: 7
    Output:
    0 1 1 2 3 5 8
 */
public class FibonicSeries {// recursion
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of terms:");// 7
		int term = scanner.nextInt();
		int n1 = 0, n2 = 1, n3;
		// System.out.print(n1 + " " + n2);
		for (int i = 1; i <= term; i++) {// 1,2,3,4,5,6,7
			System.out.print(n1 + " ");// 0,
			n3 = n1 + n2;// n3=0+1=1,1+1=2,1+2,2+3,3+5,5+8
			n1 = n2;// n1=1,1,2,3,5,8
			n2 = n3;// n2=1,2,3,5,8,13
		}
		scanner.close();
	}
}
