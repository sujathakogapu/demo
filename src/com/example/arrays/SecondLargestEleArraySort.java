package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestEleArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		while (true) {
			System.out.print("Enter the length of the array: ");
			length = sc.nextInt();
			if (length < 2) {
				System.out.println("Array must have at least two elements");
			} else {
				break;
			}
		}
		System.out.print("Enter the array element:");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int second_largest = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				second_largest = arr[i];
				break;
			}
		}
		System.out.println("The second largest element is " + second_largest);
		sc.close();
	}
}
