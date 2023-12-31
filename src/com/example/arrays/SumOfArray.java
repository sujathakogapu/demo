package com.example.arrays;

import java.util.Scanner;

/*
1.Write a program to find the sum of all elements in an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 1 2 3 4 5
  Output:
  The sum of all elements in the array is 15
*/
//time complexity:O(n)
//space complexity:O(n)
public class SumOfArray {
	//method creation
	public int arraySum(int[] arr) {
		int sum = 0;
		//check the array length
		for (int i = 0; i < arr.length; i++) {// 1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			//assign the array elements to sum
			sum = sum + arr[i];// 0+1->1,1+2->3,3+3->6,6+4->10,10+5=15
		}
		//return the value
		return sum;
	}

	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");// length=5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");// 1,2,3,4,5
		for (int i = 0; i < length; i++) {// 1<5;2,2<5;3,3<5;4<5;5,5<5->false
			arr[i] = scanner.nextInt();// arr[1],arr[2],arr[3],arr[4],arr[5]
		}
		//object creation
		SumOfArray obj = new SumOfArray();
		//method calling and print the output
		int output = obj.arraySum(arr);
		System.out.println("the sum of the array is:" + output);// 15
		scanner.close();
	}
}
