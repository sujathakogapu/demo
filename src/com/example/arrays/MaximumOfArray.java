package com.example.arrays;

import java.util.Scanner;

/*
2.Write a program to find the maximum element in an array.
   Input:
   Enter the size of the array: 5
   Enter the array elements: 10 5 20 25 15
   Output:
   The maximum element is 25
*/
public class MaximumOfArray {
	//method creation
	public int getMaximum(int[] arr) {
		//logic for max element
		int max = arr[0];// max=10
		//compare to every element
		for (int i = 0; i < arr.length; i++) {// 0<5;1,1<5;2,2<5;3,3<5,4,4<5;5,5<5->false
			if (arr[i] > max) {// 10>10->false,5>10->false,20>10->true,25>20->true,15>25->false
				max = arr[i];// 20,25
			}
		}
		//return value
		return max;
	}
	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");// 5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the Array elements:");// 10,5,20,25,15
		for (int i = 0; i < arr.length; i++) {// 0<5;1,1<5;2,2<5;3,3<5,4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		//object creation
		MaximumOfArray obj=new MaximumOfArray();
		//method calling output print
		int maxElement=obj.getMaximum(arr);
		System.out.println("The maximum element is:" + maxElement);// 25
		scanner.close();
	}

}
