package com.example.arrays;

import java.util.Scanner;

public class MinmumOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("the minimum no is:" + min);
		scanner.close();
	}

}
