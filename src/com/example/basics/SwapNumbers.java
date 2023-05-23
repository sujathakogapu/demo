package com.example.basics;

import java.util.Scanner;

public class SwapNumbers {
	public int getSwap(int num1, int num2) {
		int temp = num2;
		num2 = num1;
		num1 = temp;
		return temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1 = scanner.nextInt();
		System.out.println("Enter a second number:");
		int num2 = scanner.nextInt();
		SwapNumbers obj=new SwapNumbers();
		int output=obj.getSwap(num1, num2);
			System.out.println("Value of number two is " + num2 + " and Value of number one is " + num1+ output);
		scanner.close();
	}
}
