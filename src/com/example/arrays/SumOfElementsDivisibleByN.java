package com.example.arrays;

import java.util.Scanner;

/*
20. Write a program to find the sum of all elements in an array that are
    divisible by 3 or 5.
    Input:
    Enter the size of the array: 10
    Enter the array elements: 1 2 3 4 5 6 7 8 9 10
    Output:
    33
*/
public class SumOfElementsDivisibleByN {
	public int getSumOfElementsdivisibleByN(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {// 1<10;2,2<10;3,3<10;4,4<10;5,5<10;6,6<10;7,7<10;8,8<10;9,9<10;10,10<10->false
			if ((arr[i] % 3 == 0) || (arr[i] % 5 == 0)) {// 1%3==0 or 1%5==0->false,2%3==0 or 2%5==0->false,3%3==0 or
															// 3%5==0->true,4%3==0 or 4%5==0->false,5%3==0 or
															// 5%5==0->true,
															// 6%3==0 or 6%5==0->true,7%3==0 or 7%5==0->false,8%3==0 or
															// 8%5==0->false,9%3==0 or 9%5==0->true,10%3==0 or
															// 10%5==0->true
				sum = sum + arr[i];// 0+3,3+5,8+6,14+9,23+10=33
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array:");// 10
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array of elements:");// 1,2,3,4,5,5,6,7,8,9,10
		for (int i = 0; i < length; i++) {// 1<10;2,2<10;3,3<10;4,4<10;5,5<10;6,6<10;7,7<10;8,8<10;9,9<10;10,10<10->false
			arr[i] = scanner.nextInt();
		}
		SumOfElementsDivisibleByN obj = new SumOfElementsDivisibleByN();
		int output = obj.getSumOfElementsdivisibleByN(arr);
		System.out.print("the sum of the array is:" + output);// 33
		scanner.close();
	}
}
