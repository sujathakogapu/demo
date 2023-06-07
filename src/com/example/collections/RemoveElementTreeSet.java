package com.example.collections;
/*
 * 22. Write a Java program to remove a specific element from a TreeSet.
Input:
TreeSet: [Apple, Banana, Orange]
Element to remove: Banana
Output:
TreeSet after removal: [Apple, Orange]
 */

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveElementTreeSet {
	public TreeSet removeElement(TreeSet set,String element) {
		set.remove(element);
		return set;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number of strings");
	int size = scanner.nextInt();
	TreeSet set= new TreeSet();
	scanner.nextLine();
	System.out.println("Enter strings");
	for (int i = 0; i < size; i++) {
		set.add(scanner.nextLine());
	}
	System.out.println("Enter the remove string: ");
	String element=scanner.nextLine();
	RemoveElementTreeSet obj=new RemoveElementTreeSet();
	TreeSet outputset=obj.removeElement(set, element);
	System.out.println("TreeSet after remove: "+outputset);
}
}
