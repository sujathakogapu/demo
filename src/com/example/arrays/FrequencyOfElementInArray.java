package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Write a program to find the frequency of each element in an array.
    Input:
    Enter the size of the array: 8
    Enter the array elements: 1 2 3 2 4 1 5 1
    Output:
    1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time, 4 occurs 1 time, 5
    occurs 1 time
*/
//Time complexity:64
//Space complexity:8
public class FrequencyOfElementInArray {
	//method creation
	public String[] getFrequency(int[] arr) {
		//string array object creation
		String[] outputArr = new String[arr.length];
		//calculate the frequency 
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				//count the elements
				i++;
				count++;
			}

			outputArr[i] = (arr[i] + "occurs " + count + "times");
			count++;
		}
		//return value

		return outputArr;

	}

	public static void main(String[] args) {
		//get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array of length:");// 8
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array of elements:");// 1 2 3 2 4 1 5 1
		for (int i = 0; i < arr.length; i++) {// 0<8;1,1<8;2,2<8;3,3<8;4,4<8;5,5<8;6,6<8;7,7<8;8<8->false
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);// 1 1 1 2 2 3 4 5
		scanner.close();
		Arrays.sort(arr); // do not use java library
		//object creation
		FrequencyOfElementInArray obj = new FrequencyOfElementInArray();
		//method calling and print output
		String[] outputArr = obj.getFrequency(arr);
		for (int i = 0; i < outputArr.length; i++) {
			if (outputArr[i] != null) {
				System.out.print(outputArr[i] + ", ");
			}
		}
	}
}