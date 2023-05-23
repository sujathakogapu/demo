package com.example.basics;

import java.util.Scanner;
/*
5.Write a program to find the value of one number raised to the power of
  another.
  Input:
  Enter the base number: 2
  Enter the exponent: 5
  Output:
  2 raised to the power of 5 is: 32
*/
public class PowerOfNumber {
	public int getPower(int base,int exponent) {
		int power = 1;
		for (int i = exponent; i > 0; i--) {// i=5;5>0;4,4>0;3,3>0,2,2>0,1,1>0,0
			power = power * base;// 1*2->2,2*2->4,4*2->8,8*2->16,16*2->32,32*1->32
		}
		return power;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base number:");// 2
		int base = scanner.nextInt();
		System.out.println("Enter a exponent number2:");// 5
		int exponent = scanner.nextInt();
		PowerOfNumber obj=new PowerOfNumber();
		int output=obj.getPower(base, exponent);
		System.out.println(base + " to the popwer " + exponent + " is:" + output);
		scanner.close();
	}
}
