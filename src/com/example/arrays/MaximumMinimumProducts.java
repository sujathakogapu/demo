package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
21. Write a program to find the maximum and minimum product of any two
    elements in an array.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 2 4 6 1 5
    Output:
    Maximum product: 30, Minimum product: 2
*/
//Time complexity:5
//Space complexity:5
public class MaximumMinimumProducts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		if (arr.length < 2) {
			System.out.println("you can give more than two elements: ");
			//return;
		}
	Arrays.sort(arr);
    int num1, num2;
    int sum1 = arr[0] * arr[1];
    int sum2 = arr[length - 1] * arr[length - 2];
    if (sum1 > sum2) {
        num1 = arr[0];
        num2 = arr[1];
    }
    else {
        num1 = arr[length - 2];
        num2 = arr[length - 1];
    }
    int maximumProduct=num1*num2;
    int minimumProduct=arr[0]*arr[1];
    System.out.println("Maximum product is: "+ maximumProduct);
    System.out.println("Minimum product is: "+minimumProduct);
    scanner.close();
}

}