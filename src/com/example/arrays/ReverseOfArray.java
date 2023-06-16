
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
//time complexity:5
//space complexity:5
public class ReverseOfArray {
	//method creation
	public int[] arrayReverce(int[] arr) {
		int reverse=0;
		int[] outputArr=new int[arr.length];
		//check the reverse elements
		int i=0;
		for (int j = arr.length-1; j >= 0;j--) {//4;4>=0;3,3>=0;2,2>=0,1,1>=0;0,0>=0
			//assign the elements to reverse variable
			outputArr[i]=arr[j];
			i++;
		}
		//return the value
		return outputArr;
	}
	public static void main(String[] args) {
		//get input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");//5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array elements:");//1,2,3,4,5
		for (int i = 0; i < length; i++) {//1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		//object creation
		ReverseOfArray obj=new ReverseOfArray();
		//method calling and print the output
		int[] output=obj.arrayReverce(arr);
		for(int i=0;i<output.length;i++) {
		System.out.print(output[i]+" ");
		}
		scanner.close();
	}
}
