package com.example.collections;
/*
 * 19. Write a Java program to remove all the elements from one HashSet that
are not present in another HashSet.
Input:
HashSet1: [1, 2, 3, 4, 5]
HashSet2: [3, 4, 5, 6]
Output:
HashSet1 after removing non-matching elements: [3, 4, 5]
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveEleFromHashSet {
	public HashSet<Integer> getRemoveNonMatchElements(HashSet set1,HashSet set2){
		if(!set1.contains(set2)) {
			set1.remove(set2);
		}
		return set1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of elements: ");
		int size=scanner.nextInt();
		System.out.println("Enter a first set elements");
		HashSet<Integer> set1=new HashSet<>();
		int set1Elements=scanner.nextInt();
		for(int i=0;i<size;i++) {
		set1.add(scanner.nextInt());
		}
		System.out.println("Enter a second set elements");
		HashSet<Integer> set2=new HashSet<>();
		int set2Elements=scanner.nextInt();
		for(int i=0;i<size;i++) {
		set2.add(scanner.nextInt());
		}
		RemoveEleFromHashSet obj=new RemoveEleFromHashSet();
		HashSet<Integer> elements=obj.getRemoveNonMatchElements(set1, set2);
		System.out.println("HashSet1 after removing non-matching elements: "+elements);
	}

}
