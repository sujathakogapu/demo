package com.example.basics;

import java.util.Scanner;

public class SumOfNaturalNo {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();// num=5
		int i = 1;
		while (i <= num) {
			// for (int i = 1; i <= num; i++) {//
			// i=1;1<=5;1++,2<=5;2++,3<=5;3++;4<=5,4++;5<=5,5++,6<=5
			sum = sum + i;
			i++;// 0+1=1,1+2=3,3+3=6,6+4=10,10+5=15
		}
		System.out.println("The sum of natural no:" + sum);
		scanner.close();

	}

}
