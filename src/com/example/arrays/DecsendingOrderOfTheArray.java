package com.example.arrays;

import java.util.Scanner;

/*
15. Write a program to sort an array in descending order.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 10 5 20 25 15
    Output:
    Array in descending order: 25 20 15 10 5
*/
public class DecsendingOrderOfTheArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		int temp = 0;
		System.out.println("The original array elements is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j + 1]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array in descnding order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		scanner.close();

	}
}
