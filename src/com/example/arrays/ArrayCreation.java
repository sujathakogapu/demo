package com.example.arrays;
//example program array creation
//Time Complexity: O(n)
//Space complexity: O(n)
public class ArrayCreation {
	public static void main(String[] args) {
		int i;
		int[] arr = new int[5];
		System.out.println("Enter the elements in the array:" + arr.length);//arr.length->5
		arr[0] = 10;//arr=array name,[0]=index,10=value
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (i = 0; i < arr.length; i++) {//1.0<5;1,2.1<5;2,3.2<5,3,4.3<5;4,5.4<5;5,5<5
			System.out.println(arr[i]);//10,20,30,40,50
		}
	}
}
