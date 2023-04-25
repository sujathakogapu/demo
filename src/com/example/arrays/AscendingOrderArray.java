package com.example.arrays;

import java.util.Scanner;

public class AscendingOrderArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		boolean result = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				result = false;
				break;
			}
		}
		System.out.print(result);
		scanner.close();
	}

}
