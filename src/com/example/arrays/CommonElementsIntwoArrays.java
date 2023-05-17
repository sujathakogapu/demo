package com.example.arrays;

import java.util.Scanner;

/*
11. Write a program to find the common elements between two arrays.
    Input:
    Enter the size of the 1st array: 5
    Enter the array elements: 1 2 3 4
    Enter the size of the 2nd array: 4
    Enter the array elements: 3 4 5 6
    Output:
    The common elements are: 3 4
*/
public class CommonElementsIntwoArrays {
	int index=0;
	public int[] getCommonElements(int arr1[], int arr2[]) {
		int[] commonElements = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j]) {
					commonElements[index] = arr1[i];
					index++;
				}
		}
		return commonElements;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the 1st array:");
		int length1 = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr1 = new int[length1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the size of the 2nd array:");
		int length2 = scanner.nextInt();
		System.out.println(" Enter the array elements:");
		int[] arr2 = new int[length2];
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = scanner.nextInt();
		}
		CommonElementsIntwoArrays elements = new CommonElementsIntwoArrays();
		int[] commonElementsArray = elements.getCommonElements(arr1, arr2);
		System.out.print("common elements are: ");
		for (int i = 0; i < elements.index; i++) {
			System.out.print(commonElementsArray[i]+" ");

		}
		scanner.close();
	}
}
