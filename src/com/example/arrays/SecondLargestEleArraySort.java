package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
6.Write a program to find the second largest element in an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 10 5 20 25 15
  Output:
  The second largest element is 20
*/
public class SecondLargestEleArraySort {
	public static void main(String[] args) {
		//step1 : get input from the user
		Scanner sc = new Scanner(System.in);
		int length;
		while (true) {
			System.out.print("Enter the length of the array: ");//5
			length = sc.nextInt();
			if (length < 2) {//length<2, if lessthan  two elements in the array then we can add more than two elements in the array
				System.out.println("Array must have at least two elements");
			} else {
				break;
			}
		}
		System.out.print("Enter the array element:");//10,5,20,25,15
		int[] arr = new int[length];//intezer array create
		for (int i = 0; i < length; i++) {//
			arr[i] = sc.nextInt();
		}
		//step2:sort the array
		Arrays.sort(arr);//5,10,15,20,25
		//step3:find the second largest
		int secondLargest = 0;
		for (int i = arr.length - 2; i >= 0; i--) {//3;3>=0;2,
			if (arr[i] != arr[arr.length - 1]) {//20!=25
				secondLargest = arr[i];//20
				break;
			}
		}
		System.out.println("The second largest element is " + secondLargest);//20
		sc.close();
	}
}
