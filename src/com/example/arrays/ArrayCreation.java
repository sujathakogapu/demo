package com.example.arrays;

public class ArrayCreation {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Enter the elements in the array:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
			System.out.println(arr[i]);
		}
	}
}
