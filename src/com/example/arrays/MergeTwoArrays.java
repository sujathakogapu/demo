package com.example.arrays;

import java.util.Scanner;

/*
24. Write a program to merge two sorted arrays into a single sorted array.
    Input:
    Enter the size of the 1st array: 3
    Enter the array elements: 1 3 5
    Enter the size of the 2nd array: 3
    Enter the array elements: 2 4 6
    Output:
    Merged array: 1 2 3 4 5 6
*/
//time complexity:O(n)
//space complexity:O(n)
public class MergeTwoArrays {
	//method creation
	public int[] getMerge(int[] arr1,int[] arr2) {
		int i,j = 0;
		int index=0;
		//calculate the merge elements
		int length3=arr1.length+arr2.length;
		int[] mergeArray=new int[length3];
		for( i=0;i<length3;i++);{
			//assign the elements
			mergeArray[index]=arr1[i]+arr2[j];
		}
		//return value
		return mergeArray;
	}
	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int length1=scanner.nextInt();
		System.out.println("Enter the elements of first array: ");
		int[] arr1=new int[length1];
		for(int i=0;i<arr1.length;i++) {
			 arr1[i]=scanner.nextInt();
		}
		System.out.println("Enter the size of the second array: ");
		int length2=scanner.nextInt();
		System.out.println("Enter the elements of second array: ");
		int[] arr2=new int[length2];
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=scanner.nextInt();
		}
		//object creation
		MergeTwoArrays obj=new MergeTwoArrays();
		//method calling output print
		int[] mergeArrayElements=obj.getMerge(arr1, arr2);
			int i=0;
			System.out.println(mergeArrayElements[i]+" ");
		scanner.close();
	}

}
