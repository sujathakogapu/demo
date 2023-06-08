package com.example.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 21. Write a Java program to add elements to a TreeSet and display them.
Input:
Elements: 5, 2, 7, 1, 9
Output:
TreeSet: [1, 2, 5, 7, 9]

 */

public class DisplayElementsInTreeSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter asize of elements: ");
		int size=scanner.nextInt();
		TreeSet set=new TreeSet();
		System.out.println("Enter a elements: ");
		for(int i=0;i<size;i++) {
			set.add(scanner.nextInt());
		}
		DisplayElementsInTreeSet obj=new DisplayElementsInTreeSet();
		//System.out.println("TreeSet: "+outputset);
	}

}
