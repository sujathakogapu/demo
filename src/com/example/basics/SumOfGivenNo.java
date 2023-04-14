package com.example.basics;

import java.util.Scanner;

public class SumOfGivenNo {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();// 123
		for (int i = num; i != 0; i = i / 10) {// i=0;123!=0;123/10=12,12!=0;12/10=1,1!=0;1/10=0,0!=0
			sum = sum + i % 10;// 0+123%10=0+3=3,3+12%10=3+2=5,5+1%10=5+1=6,
		}
		System.out.println("sum of digits:" + sum);
		scanner.close();

	}

}
