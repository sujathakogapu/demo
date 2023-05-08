package com.example.arrays;

import java.util.Scanner;

/*
10. Write a program to remove a specific element from an array.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 1 2 3 4 5
    Enter the element to be removed: 3
    Output:
    Array after removing 3: 1 2 4 5
*/
public class RemoveSpecificElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.print("Enter the array elements: ");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Enter the element to be removed: ");
		int removeElement = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (removeElement == arr[i]) {
				for (int j = i; j < length - 1; j++) {
					arr[j] = arr[j + 1];
					System.out.print("Remove the element successfully");
				}
					break;
				}
			}
		System.out.println("Array after removing");
		for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i] + " ");
		}
		scanner.close();
	}
}
