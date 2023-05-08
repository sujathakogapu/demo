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
public class MergeTwoArrays {
	public static void main(String[] args) {
		int i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int length1=scanner.nextInt();
		System.out.println("Enter the elements of first array: ");
		int[] arr1=new int[length1];
		for(i=0;i<arr1.length;i++) {
			 arr1[i]=scanner.nextInt();
		}
		System.out.println("Enter the size of the second array: ");
		int length2=scanner.nextInt();
		System.out.println("Enter the elements of second array: ");
		int[] arr2=new int[length2];
		for( j=0;j<arr2.length;j++) {
			arr2[j]=scanner.nextInt();
		}
		int index=0;
		int length3=length1+length2;
		int[] mergeArray=new int[length3];
		System.out.println("The merge array elements");
		for( i=0;i<length3;i++);{
			mergeArray[index]=arr1[i]+arr2[j];
			System.out.println(mergeArray[i]+" ");
		}
		
		scanner.close();
	}

}
