
package com.example.arrays;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int j = arr.length-1; j >= 0;j--) {
			System.out.print(arr[j]+" ");
		}
		scanner.close();
	}
}
