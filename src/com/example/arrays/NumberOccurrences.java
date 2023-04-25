package com.example.arrays;

import java.util.Scanner;

public class NumberOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the Staring:");
		int length =scanner.nextInt();
		int[] arr =new int[length];
		System.out.print("Enter the no of elements in the array:");
		for(int i=0;i<length;i++) {
			arr[i]=scanner.nextInt();
		}
		int search = 0;
		System.out.print("Enter the element to be searched :");
		search = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count = count + 1;
			}
		}
		System.out.print("The element " + search + " occurs " + count + " times in the array");
		scanner.close();
	}
		}
