package com.example.arrays;

import java.util.Scanner;

/*
19. Write a program to find the element that occurs the most in an array
    of integers and the number of times it occurs.
    Input:
    Enter the size of the array: 8
    Enter the array elements: 1 2 3 2 4 1 5 1
    Output:
    Element: 1, Occurrences: 3
 */
//time complexity:64
//space complexity:8
public class OccurenceMostElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length:");// 8
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the arrray elements:");// 1,2,3,2,4,1,5,1
		int maxCount = 0;
		int maxFreq = 0;
		for (int i = 0; i < length; i++) {// 0<8;1,1<8;2,2<8;3,3<8;4,4<8;5,5<8;6,6<8;7,7<8;8
			arr[i] = scanner.nextInt();
			int count = 0;
			for (int j = i; j < length; j++) {
				// iteration one:1<8;1,1<8;2,1<8;3,1<8;2,1<8;4,1<8;1,1<8;5,1<8;1
				// iteration two:2<8;1,2<8;2,2<8;3,2<8;2,2<8;4,2<8;1,2<8;5,2<8;1
				// iteration three:3<8;1,3<8;2,3<8;3,3<8;2,3<8;4,3<8;1,3<8;5,3<8;1
				// iteration four:2<8;1,2<8;2,2<8;3,2<8;2,2<8;4,2<8;1,2<8;5,2<8;1
				// iteration five:4<8;1,4<8;2,4<8;3,4<8;2,4<8;4,4<8;1,4<8;5,4<8;1
				// iteration six:1<8;1,1<8;2,1<8;3,1<8;2,1<8;4,1<8;1,1<8;5,1<8;1
				// iteration seven:5<8;1,5<8;2,5<8;3,5<8;2,5<8;4,5<8;1,5<8;5,5<8;1
				// iteration eight:1<8;1,1<8;2,1<8;3,1<8;2,1<8;4,1<8;1,1<8;5,1<8;1
				if (arr[i] == arr[j]) {// arr[1]==arr[1],arr[2]==arr[2]
					count++;// 3,2
				}
			}
			if (count > maxCount) {//
				maxCount = count;// 3
				maxFreq = arr[i];// 1
			}
		}
		System.out.print("most frequency element is:" + maxFreq);
		scanner.close();
	}
}
