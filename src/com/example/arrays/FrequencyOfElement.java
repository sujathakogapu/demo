package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array of length:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array of elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			System.out.print(arr[i] + "occurs " + count + "times" + ", ");
			count++;
		scanner.close();
	}
	}
}