package com.example.arrays;

/*
16. Write a program to remove all duplicates from an array.
    Input:
    Enter the size of the array: 8
    Enter the array elements: 1 2 3 2 4 1 5 1
    Output:
    1 2 3 4 5
*/
//Time complexity:O(n*n*n)
//Space complexity:O(n)
import java.util.Scanner;

public class DuplicateElements {
	//method creation
	int size=0;
	public int[] removeDuplicates(int arr[]) {
		size=arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				//calculate the values and select duplicate elements
				if (arr[i] == arr[j]) {
					for (int k = j; k < size - 1; k++) {
						arr[k] = arr[k + 1];
					}
					size--;
					j--;
				}
			}
		}
		//return value
		return arr;
	}

	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();
		//object creation
		DuplicateElements elements = new DuplicateElements();
		//method calling print output
		int[] outputArray = elements.removeDuplicates(arr);
		System.out.println("Array elements after deletion of the duplicate elements: ");
		for (int i = 0; i < elements.size; i++) {
			System.out.print(outputArray[i] + " ");
		}
	}
}