package com.example.arrays;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("the sum of the array is:" + sum);
		scanner.close();
	}

}
