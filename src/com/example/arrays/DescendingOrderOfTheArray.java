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
//time complexity:25
//space complexity:5
public class DescendingOrderOfTheArray {
	//method creation
	public int[] applyDescendingOrder(int arr[]) {
		//method body or logic
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				//compare to array elements 
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		//object creation
		DescendingOrderOfTheArray arrayOrder = new DescendingOrderOfTheArray();
		//method calling and output print
		int[] descendingOrderArray = arrayOrder.applyDescendingOrder(arr);
		System.out.print("Array in descnding order: ");
		for (int i = 0; i < descendingOrderArray.length; i++) {
			System.out.print(descendingOrderArray[i] + " ");
		}
		scanner.close();

	}
}
