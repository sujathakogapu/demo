package com.example.arrays;

import java.util.Scanner;

/*
5.Write a program to check if an array is sorted in ascending order.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 1 2 3 4 5
  Output:
  True
*/
//Time complexity:O(n)
//space complexity:O(n)

public class AscendingOrderArray {
	//step1:-method creation
	public boolean isAscending(int arr[], int length) {
		//step2:-method body or logic
		for (int i = 0; i < arr.length - 1; i++) {// 0<4;1,1<4;2,2<4;3,3<4;4,4<4
			//compare the array elements
			if (arr[i] > arr[i + 1]) {// 10>20->false,20>30->false,30>40->false,40>50->false
				return false;// 10
			}
		}
		//return value
		return true;
	}

	public static void main(String[] args) {
		//step3:-inputs from users
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");// enter array length=5
		int length = scanner.nextInt();
		int[] arr = new int[length];// array length creation
		System.out.print("Enter the array elements:");// 10,20,30,40,50
		for (int i = 0; i < length; i++) {// 1->0<5;1,2->1<5;2,3->2<5;3,4->3<5;4,5->4<5;5,6->5<5
			arr[i] = scanner.nextInt();// take inputs from console
		}
		//step4:-object creation
		AscendingOrderArray arrOrder = new AscendingOrderArray();
		//method calling and print output
		boolean ascendingOrder = arrOrder.isAscending(arr, length);
		System.out.println("Array elements is ascending order? " + ascendingOrder);
		scanner.close();
	}

}
