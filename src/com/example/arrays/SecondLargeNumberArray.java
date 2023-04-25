package com.example.arrays;

import java.util.Scanner;

public class SecondLargeNumberArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array length:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
			int secondlarge;
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					secondlarge = arr[i];
					arr[i] = arr[j];
					arr[j] = secondlarge;
				}
			}
		}
		System.out.print("The second largest element is:" + arr[length - 2]);
		scanner.close();
	}
}
