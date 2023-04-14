package com.example.patterns;

import java.util.Scanner;

public class Rambus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {// first iteration:i=1,1<=5;second iteration:1++,2<=5
			for (int j = i; j < row; j++) {// first iteration:j=1;1<5;1++,2<=5;2++,3<=5;3++,4<=5;4++,5<=5
				System.out.print(' ');// first iteration:space,space,space,space
			}
			for (int j = 1; j <= row; j++) {// first iteration:1=1;1<=5;1++
				System.out.print('*');// *
			}
			System.out.println();
		}
		scanner.close();
	}
}
