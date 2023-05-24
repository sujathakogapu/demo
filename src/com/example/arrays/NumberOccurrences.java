package com.example.arrays;

import java.util.Scanner;
/*
12. Write a program to find the number of occurrences of a given element
    in an array.
    Input:
    Enter the size of the array: 6
    Enter the array elements: 3 7 2 9 6 3
    Enter the element to search for: 3
    Output:
    The element 3 occurs 2 times in the array
 */
public class NumberOccurrences {
	//method creation
	public int numberOccurrencesEle(int[] arr){
		int search = 0;
		int count = 0;
		//search the elements 
		for (int i = 0; i < arr.length; i++) {//0<6;1,1<6;2,2<6;3,3<6,4;4<6;5,5<6;6;6<6->false
			//Assign the search element
			if (arr[i] == search) {//arr[3]==3->true,arr[7]==3->false,arr[2]==3->false,arr[9]==3->false,arr[6]==3->false,arr[3===3->true
				//increase the count
				count = count + 1;//0+1,1+1->2
			}
		}
		return search;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length of the array:");//6
		int length =scanner.nextInt();
		int[] arr =new int[length];
		System.out.print("Enter the no of elements in the array:");//3,7,2,9,6,3
		for(int i=0;i<length;i++) {//0<6;1,1<6;2,2<6;3,3<6,4;4<6;5,5<6;6;6<6->false
			arr[i]=scanner.nextInt();
		}
		//object creation
		NumberOccurrences obj=new NumberOccurrences();
		//method calling and output print
		int output=obj.numberOccurrencesEle(arr);
		System.out.print("The element occurences: "+output );
		scanner.close();
	}
		}
