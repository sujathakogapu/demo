package com.example.arrays;

import java.util.Scanner;

public class MinmumOfArray {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		int min = arr[0];
		System.out.println("Enter the array elements:");
		for (i = 0; i <arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("the minimum no is:" + min);
		scanner.close();
	}

}
