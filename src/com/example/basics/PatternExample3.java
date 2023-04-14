package com.example.basics;

import java.util.Scanner;

public class PatternExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {// outer loop,i=1;1<=5;1++,2<=5;2++,3<=5,3++,4<=5
			for (int j = 1; j <= i; j++) {// inner loop, first iteration j=1;1<=1;1++,2<=1,second iteration j=1;
											// 1<=2;1++,2<=2;2++,3<=2,third
											// iteration,j=1;1<=3;1++,2<=3;2++,3<=3;3++,4<=3,4th i
				System.out.print("*");// j loop *,**,***
			}
			System.out.println();// i loop \n,\n,\n
		}
		scanner.close();
	}

}
