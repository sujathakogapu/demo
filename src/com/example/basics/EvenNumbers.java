package com.example.basics;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();// num=5
		System.out.println("Even no are:");
		for (int i = 1; i <= num; i++) {// i=1;1<=5;1++,2<=5;2++,3<=5;3++,4<=5;4++,5<=5;5++,6<=5
			if (i % 2 == 0) {// 1%2=1==0,2%2=0==0,3%2=1==0,4%2=0==0,5%2=1==0
				System.out.println(i);
			}

		}

		scanner.close();

	}

}
