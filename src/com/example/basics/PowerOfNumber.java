package com.example.basics;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base number:");
		int base = scanner.nextInt();
		System.out.println("Enter a exponent number2:");
		int exponent = scanner.nextInt();
		int power = 1;
		for (int i = exponent; i > 0; i--) {// i=3;3>0;3--,2>0;2--,1>0;1--,o>0
			power = power * base;// 1*4=4,4*4=16,16*4=64

		}
		System.out.println(base + "to the popwer" + exponent + "is:" + power);
		scanner.close();
	}

}
