package com.example.arrays;

import java.util.Scanner;

/*
 * 2.Write a program to find the maximum element in an array.
   Input:
   Enter the size of the array: 5
   Enter the array elements: 10 5 20 25 15
   Output:
   The maximum element is 25
*/
public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");// 5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the Array elements:");// 10,5,20,25,15
		for (int i = 0; i < arr.length; i++) {// 0<5;1,1<5;2,2<5;3,3<5,4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];// max=10
		for (int i = 0; i < arr.length; i++) {// 0<5;1,1<5;2,2<5;3,3<5,4,4<5;5,5<5->false
			if (arr[i] > max) {// 10>10->false,5>10->false,20>10->true,25>20->true,15>25->false
				max = arr[i];// 20,25
			}
		}
		System.out.println("The maximum element is:" + max);// 25
		scanner.close();
	}

}
