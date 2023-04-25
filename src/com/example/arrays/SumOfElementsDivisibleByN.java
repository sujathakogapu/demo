package com.example.arrays;

import java.util.Scanner;

public class SumOfElementsDivisibleByN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array of elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 3 == 0) || (arr[i] % 5 == 0) ){
				sum = sum + arr[i];
			}
		}
		System.out.print("the sum of the array is:" + sum);
		scanner.close();
	}
}
