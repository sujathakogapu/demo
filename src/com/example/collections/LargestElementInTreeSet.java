package com.example.collections;
/*
 * 23. Write a Java program to find the largest element in a TreeSet.
Input:
TreeSet: [3, 1, 4, 2, 5]
Output:
Largest element: 5

 */

import java.util.TreeSet;

public class LargestElementInTreeSet {
	public TreeSet largestElement(TreeSet set) {
		set.last();
		return set;
	}
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(3);
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(5);
		System.out.println(set);
		LargestElementInTreeSet obj=new LargestElementInTreeSet();
		TreeSet outputSet=obj.largestElement(set);
		System.out.println("Largest element: "+outputSet);
	}

}
