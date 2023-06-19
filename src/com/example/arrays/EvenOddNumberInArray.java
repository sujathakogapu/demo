package com.example.arrays;

import java.util.Scanner;

/*
4.Write a program to count the number of even and odd numbers in an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 1 2 3 4 5
  Output:
  Even numbers = 2, Odd numbers = 3
*/
//Time complexity:O(n)
//Space complexity:O(n)
public class EvenOddNumberInArray {
	//method creation
	public int evenOdd(int[] arr) {
		int evencount = 0;
		//calculate the even numbers count the even numbers
		for (int i = 0; i < arr.length; i++) {// 0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			if (arr[i] % 2 == 0) {// arr[1]%2==0->false,arr[2]%2==0->true,arr[3]%2==0->false,arr[4]%2==0->true,arr[5]%2==0->false
				evencount = evencount + 1;// 0+1,1+1
			}
		}
		//return value
		return evencount;
	}

	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a length of the array:");// 5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");// 1,2,3,4,5
		for (int i = 0; i < length; i++) {// 0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		//object creation
		EvenOddNumberInArray obj = new EvenOddNumberInArray();
		//method calling print output
		int evencount = obj.evenOdd(arr);
		int oddcount = arr.length - evencount;
		System.out.println("Even count: " + evencount);
		System.out.println("odd count: " + oddcount);

		scanner.close();
	}

}
