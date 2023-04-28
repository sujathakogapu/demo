package com.example.arrays;

import java.util.Scanner;
/*9.Write a program to search the index of a given element in an array.
    Input:
    Enter the size of the array: 5
    Enter the array elements: 10 20 30 40 50
    Enter the element to search: 30
    Output:
    The index of 30 is 2
*/
public class SearchIndexElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array :");//5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");//10,20,30,40,50
		for (int i = 0; i < length; i++) {//0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		int index = -1;
		System.out.print("Enter the search element:");//30
		int element = scanner.nextInt();
		int i = 0;
		while (i < arr.length) {//0<5->true,1<5->true,2<5->true
			if (arr[i] == element) {//10,20,30
				index = i;//10,20,30
				break;
			}
			i++;//1+1=2
		}

		System.out.println("Index of " + element + " is : " + index);//2
		scanner.close();
	}
}