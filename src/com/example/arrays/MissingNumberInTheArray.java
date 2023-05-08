package com.example.arrays;

import java.util.Scanner;

/*
17. Write a program to find the missing number in a given integer array
    with size n.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 1 2 3 4 6
    Enter n value: 6
    Output:
    The missing number is 5
*/
public class MissingNumberInTheArray {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int length=scanner.nextInt();
	System.out.println("Enter the array elements: ");
	int[] arr=new int[length];
	for(int i=0;i<arr.length;i++) {
		 arr[i]=scanner.nextInt();
	}
	System.out.println("Enter a number: ");//6
	int number=scanner.nextInt();
        int total = 1;
        for (int i = 2; i < (number + 1); i++) {//2,3,4,5,6,
            total += i;//
            total -= arr[i - 2];
        }
	System.out.print("The missing number is: "+total);
	scanner.close();
}
}