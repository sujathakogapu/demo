package com.example.arrays;

import java.util.Scanner;

/*
18. Write a program to find a pair of an integer array whose sum is equal
    to a given number
    Input:
    Enter the size of the array: 4
    Enter the array elements: 1 4 10 -3
    Enter sum: 14
    Output:
    Pair of integer array is: 4 10
*/
public class SumIsEqualToAGivenNumber{
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr=new int[length];
		for(int i=0;i<arr.length;i++){
		arr[i]=scanner.nextInt();
		}
		System.out.println("Enter sum: ");
		int sum=scanner.nextInt();
		scanner.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(sum==arr[i]*arr[j] || sum==arr[i]+arr[j] || sum==arr[i]-arr[j]) {
					System.out.println("pair of integer array is: "+arr[i]+" "+arr[j]);
					return;
				}
			}
		}
	}
}
