
package com.example.arrays;

import java.util.Scanner;
/*
7.Write a program to reverse an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 1 2 3 4 5
  Output:
  5 4 3 2 1
*/
public class ReverseOfArray {
	public int[] arrayReverce(int[] arr) {
		for (int j = arr.length-1; j >= 0;j--) {//4;4>=0;3,3>=0;2,2>=0,1,1>=0;0,0>=0
			System.out.print(arr[j]+" ");//5,4,3,2,1
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");//5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");//1,2,3,4,5
		for (int i = 0; i < length; i++) {//1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		ReverseOfArray obj=new ReverseOfArray();
		int[] output=obj.arrayReverce(arr);
		System.out.println("The reverse of array is: "+output);
		scanner.close();
	}
}
