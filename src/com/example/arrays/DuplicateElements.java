package com.example.arrays;

/*
16. Write a program to remove all duplicates from an array.
    Input:
    Enter the size of the array: 8
    Enter the array elements: 1 2 3 2 4 1 5 1
    Output:
    1 2 3 4 5
*/
import java.util.Scanner;

public class DuplicateElements {
	public int duplicateArrays(int arr[], int length) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < size - 1; k++) {
						arr[k] = arr[k + 1];
					}
					size--;
					j--;
				}
			}
		}
		return size;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();
		DuplicateElements elements = new DuplicateElements();
		int removeDuplicateEle = elements.duplicateArrays(arr, length);
		System.out.println("  Array elements after deletion of the duplicate elements: " + removeDuplicateEle);
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}