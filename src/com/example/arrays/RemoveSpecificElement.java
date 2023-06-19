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
//time complexity:O(n*n)
//space complexity:5(n)
public class RemoveSpecificElement {
	public int[] removeEle(int[] arr, int removeElement, int length) {
		for (int i = 0; i < arr.length; i++) {
			if (removeElement == arr[i]) {
				for (int j = i; j < length - 1; j++) {
					arr[j] = arr[j + 1];
					break;
				}
			}
			}
		return arr;
	}
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
		RemoveSpecificElement obj=new RemoveSpecificElement();
		int[] output=obj.removeEle(arr, removeElement, length);
		for(int i=0;i<arr.length-1;i++) {
		}
		System.out.print(output+" "+arr);
		scanner.close();
	}
	}
