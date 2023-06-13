package com.example.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
16. Write a Java program to check if a specific element exists in a
LinkedHashSet.
Input:
LinkedHashSet: [Java, Python, C++]
Element to check: Python
Output:
Element Python exists in LinkedHashSet.
 */

public class SpecificElementExistsInLinkedList {
	public LinkedHashSet existsElement(LinkedHashSet<String> set,String existEle) {
		LinkedHashSet<String> sets=new LinkedHashSet<>();
		for(int i=0;i<sets.size();i++) {
			String element= sets.get(i);
			if( element.equals(existEle)) {
	sets.remove(existEle);
			}
		}
		return sets;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		System.out.println("Enter elements: ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<size;i++) {
			set.add(scanner.nextLine());
	}
		System.out.println("Enter a exist element: ");
		String existEle=scanner.nextLine();
		
		SpecificElementExistsInLinkedList obj=new SpecificElementExistsInLinkedList();
		LinkedHashSet<String> outputSet=obj.existsElement(set, existEle);
		System.out.println(outputSet);
		
	}

}
