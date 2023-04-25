package com.example.arrays;

import java.util.Scanner;

public class OccurenceMostElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the arrray elements:");
		int maxCount = 0;
		int maxFreq = 0;
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
			int count = 0;
			for (int j = i; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxFreq = arr[i];
			}
		}
		System.out.print("most frequency element is:"+maxFreq);
		scanner.close();
	}
}
