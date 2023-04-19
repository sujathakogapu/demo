package com.example.arrays;

import java.util.Scanner;

public class EvenOddNumberInArray {
	public static void main(String[] args) {
		int  evencount = 0, oddcount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evencount = evencount + 1;
			} else {
				oddcount = oddcount + 1;
			}
		}
		System.out.println("given no is even number:" + evencount);
		System.out.println("given no is odd number:" + oddcount);

		scanner.close();
	}

}
