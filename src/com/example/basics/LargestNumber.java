package com.example.basics;

import java.util.Scanner;

/*
8.Write a program to find the largest of three numbers.
  Input:
  Enter the first number: 7
  Enter the second number: 4
  Enter the third number: 9
  Output:
  The largest number is: 9
 */
public class LargestNumber {
	int largestNumber=0;
	public int getLargestNumber(int num1,int num2,int num3) {
		if ((num1 > num2) && (num1 > num3)) {
			largestNumber=num1;
		} else if (num2 > num3) {
			largestNumber=num2;
		} else {
			largestNumber=num3;
		}
		return largestNumber;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");// 7
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");// 4
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number:");// 9
		int num3 = scanner.nextInt();
		LargestNumber obj=new LargestNumber();
		int output=obj.getLargestNumber(num1, num2, num3);
			System.out.println("The largest number is: "+output);
		scanner.close();
	}
}
