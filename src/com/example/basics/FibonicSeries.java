package com.example.basics;

import java.util.Scanner;

public class FibonicSeries {//recursion
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of terms:");
		int term = scanner.nextInt();
		int n1 = 0, n2 = 1, n3;
		//System.out.print(n1 + " " + n2);
		for (int i = 1; i <= term; i++) {
			System.out.print(n1+" ");
			n3 = n1 + n2;//n3=0+1=1,1+1=2
			n1 = n2;//n1=1,
			n2 = n3;//n2=1
		}
		scanner.close();
	}
}
