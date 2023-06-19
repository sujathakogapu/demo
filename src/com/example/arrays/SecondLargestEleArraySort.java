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
//time complexity:O(n)
//space complexity:O(n)
public class SecondLargestEleArraySort {
	//method creation
	public int getSecondLargestElement(int[] arr) {
		Arrays.sort(arr);//5,10,15,20,25
		int secondLargest = 0;
		//check the largest element 
		for (int i = arr.length - 2; i >= 0; i--) {//3;3>=0;2,
			if (arr[i] != arr[arr.length - 1]) {//20!=25
				//assign the largest value
				secondLargest = arr[i];//20
				break;
			}
		}
		//return the value
		return secondLargest;
	}
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
		//object creation
		SecondLargestEleArraySort obj=new SecondLargestEleArraySort();
		//method callinf print the output
		int output=obj.getSecondLargestElement(arr);
		
		System.out.println("The second largest element is " + output);//20
		sc.close();
	}
}
