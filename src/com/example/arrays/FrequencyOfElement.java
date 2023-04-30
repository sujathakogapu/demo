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
public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array of length:");//8
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the array of elements:");//1 2 3 2 4 1 5 1
		for (int i = 0; i < arr.length; i++) {//0<8;1,1<8;2,2<8;3,3<8;4,4<8;5,5<8;6,6<8;7,7<8;8<8->false
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);//1 1 1 2 2 3 4 5
		for (int i = 0; i < arr.length; i++) {//0<8;1,1<8;2,2<8;3,3<8;4,4<8;5,5<8;6,6<8;7,7<8;8<8->false
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {//(1<7 && [1==1])->true,(1<7 && [1==1])->true,(1<7 && [1==2])->false,(2<7 && 2==2)->true,(2<7 && 2==3)->false,(3<7 && 3==4)->false,(4<7 && 4==5)->false,(5<7)->false
				i++;
				count++;//1+1+1,1+1,
			}
			System.out.print(arr[i] + "occurs " + count + "times" + ", ");
			count++;
		scanner.close();
	}
	}
}