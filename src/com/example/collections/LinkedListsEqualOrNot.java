package com.example.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 18. Write a Java program to check if two LinkedHashSets are equal.
Input:
LinkedHashSet1: [A, B, C]
LinkedHashSet2: [C, A, B]
Output:
LinkedHashSets are equal.

 */

public class LinkedListsEqualOrNot {
	public boolean isLinkedListsEquals(LinkedHashSet<String> set1,LinkedHashSet<String> set2) {
		 boolean value = set1.equals(set2);
		return value;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of elements: ");
		int size=scanner.nextInt();
		System.out.println("Enter a first set elements");
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		String str1=scanner.nextLine();
		for(int i=0;i<size;i++) {
		set1.add(scanner.nextLine());
		}
		System.out.println("Enter a second set elements");
		LinkedHashSet<String> set2=new LinkedHashSet<>();
		String str2=scanner.nextLine();
		for(int i=0;i<size;i++) {
		set2.add(scanner.nextLine());
		}
		LinkedListsEqualOrNot obj= new LinkedListsEqualOrNot();
		boolean linkedSets=obj.isLinkedListsEquals(set1, set2);
		System.out.println("LinkedHashSets are equal?: "+linkedSets);
	}

}
