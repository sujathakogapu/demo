package com.example.collections;
/*
 * 14. Write a program to find the union of two linked lists.
Input:
LinkedList1: [1 2 3 4 5]
LinkedList2: [6 7 8 9 10]
Output:
LinkedList: [1 2 3 4 5 6 7 8 9 10]
 */

import java.util.LinkedList;
import java.util.Scanner;

public class UnionLinkedLists {
	public LinkedList getUnion(LinkedList list1,LinkedList list2) {
		LinkedList union=new LinkedList();
		for(int i=0;i<list1.size();i++) {
			int val1=(int) list1.get(i);
			union.add(val1);
		}
			for(int j=0;j<list2.size();j++) {
				int val2=(int) list2.get(j);
				union.add(val2);
		}
			
		return union;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a no of elements: ");
		int size=scanner.nextInt();
		System.out.println("Enter first list elements: ");
		LinkedList list1=new LinkedList();
		for(int i=0;i<size;i++) {
			list1.add(scanner.nextInt());
		}
		System.out.println("Enter second list elements: ");
		LinkedList list2=new LinkedList();
		for(int j=0;j<size;j++) {
			list2.add(scanner.nextInt());
		}
		UnionLinkedLists obj=new UnionLinkedLists();
		LinkedList outputList=obj.getUnion(list1, list2);
		System.out.println(outputList);
	}

}
