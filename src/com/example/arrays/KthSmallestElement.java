package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
14. Write a program to find the kth smallest element in an array.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 10 5 20 25 15
    Enter k value:3
    Output:
    The 3rd smallest element is 15
*/
public class kthSmallestElement {
	//method creation
	public int getKthElement(int[] arr, int k) {
		int kthSmallest = arr[0];
        for (int i = 0; i < k; i++) {
            int max = arr[0];
            int maxIndex = 0;
            //compare to max element
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            //assign the element
            kthSmallest = max;
            arr[maxIndex] = arr[arr.length - 1];
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
        //return value

		return kthSmallest ;
	}
	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length=scanner.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		 System.out.print("Enter the value of k: ");
	        int k = scanner.nextInt();
	        //object creation
	        kthSmallestElement obj=new kthSmallestElement();
	        //method calling print output
	        int output=obj.getKthElement(arr,k);
	        System.out.println("The " + k + "th smallest element is: " + output);
	        scanner.close();
	    }

	}
