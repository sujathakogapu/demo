package com.example.arrays;

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		int max = arr[0];
		System.out.println("Enter the Array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("The maximum element is:" + max);
		scanner.close();
	}

}
