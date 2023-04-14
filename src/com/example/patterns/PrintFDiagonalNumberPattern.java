package com.example.patterns;

import java.util.Scanner;

public class PrintFDiagonalNumberPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {// first iteration:i=1;1<=5;second iteration:1++,2<=5
			for (int j = 1; j <= row; j++) // j=1;1<=5;1++,2<=5;2++,3<=5;3++,4<=5;4++,5<=5second iteration:1<=5;1++,2<=5
				if (j == i) // (1==1),2==1,3==1,4==1,5==1,second iteration:1==2,2==2
					System.out.print(i + "");// 1,second iteration:2
				else
					System.out.print("0");// 0,0,0,0 second iteration:0
			System.out.println();
		}
		scanner.close();
	}
}
