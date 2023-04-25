package com.example.arrays;

import java.util.Scanner;

public class SearchIndexElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		int index = -1;
		System.out.print("Enter the search element:");
		int element = scanner.nextInt();
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == element) {
				index = i;
				break;
			}
			i++;
		}

		System.out.println("Index of " + element + " is : " + index);
		scanner.close();
	}
}