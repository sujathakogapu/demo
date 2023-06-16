package com.example.arrays;

import java.util.Scanner;
/*
3.Write a program to find the minimum element in an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 10 5 20 25 15
  Output:
  The minimum element is 5
*/
//time complexity:5
//space complexity:5
public class MinmumOfArray {
	//method creation
	public int getMinimum(int[] arr) {
		int min=arr[0];//min=10
		//calculate the minimum element
		for (int i = 0; i < arr.length; i++) {//0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			if (arr[i] < min) {//10<10->false,5<10->true,20<5->false,25<5->false,15<5->false
				//assign the minimum value
				min = arr[i];//5,
			}
		}
		//return the value
		return min;
	}
	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array:");//5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");//10,5,20,25,15
		for (int i = 0; i < arr.length; i++) {//0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		//object creation
		MinmumOfArray obj=new MinmumOfArray();
		//method calling output print
		int minimumElement=obj.getMinimum(arr);
		System.out.println("the minimum no is:" + minimumElement);//5
		scanner.close();
	}

}
