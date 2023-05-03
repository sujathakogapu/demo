package com.example.basics;

import java.util.Scanner;

/*
10. Write a program to calculate the factorial of a number.
    Input:
    Enter a number: 5
    Output:
    The factorial of 5 is: 120
*/
public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");// 5
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {// 1,2,3,4,5
			fact = fact * i;// 1*1->1,1*2->2,2*3->6,6*4->24,24*5->120
		}
		System.out.println("the sum of  numbers:" + fact);
		scanner.close();
	}
}
