package com.example.collections;
/*
 * 21. Write a program to find the intersection of two arrays using a
HashMap.
Input:
Array 1: [1, 2, 4, 3, 4, 5]
Array 2: [4, 5, 6, 4, 7, 8]
Output:
Intersection of arrays: [4, 4, 5]
 */

import java.util.HashMap;
import java.util.Scanner;

public class Intersection {
	public HashMap<Integer,Integer>getIntersection(int[] arr1,int[] arr2) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					j++;
					map=map.get(j);
				}
				
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no of elements: ");
		int size=scanner.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		System.out.println("Enter first array elements: ");
		int[] arr1=new int[size];
		for(int i=0;i<size;i++) {
			arr1[i] =scanner.nextInt();
		}
		System.out.println("Enter second array elements: ");
		int[] arr2=new int[size];
		for(int i=0;i<size;i++) {
			arr2[i]=scanner.nextInt();
		}
		Intersection obj=new Intersection();
		HashMap<Integer,Integer> outputmap=obj.getIntersection(arr1, arr2);
		System.out.println(map);
		
	}

}
