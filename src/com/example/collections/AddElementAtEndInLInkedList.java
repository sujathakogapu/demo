package com.example.collections;
/*
9.Write a program to add an element at the end of a LinkedList
  Input:
  [10 20 30 40 50]
  Element to add: 6
  Output:
  LinkedList after adding element 6 at end: 10 20 30 40 50 6.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class AddElementAtEndInLInkedList {
	public LinkedList<Integer> addElementAtEnd(LinkedList<Integer> list, int addElement) {
		list.addLast(addElement);
		return list;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println("Enter a elements: ");
		for(int i=0;i<size;i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Enter a add element: ");
		int addElement=scanner.nextInt();
		AddElementAtEndInLInkedList obj=new AddElementAtEndInLInkedList();
		LinkedList<Integer> list2=obj.addElementAtEnd(list,addElement);
		System.out.println("LinkedList after adding element 6 at end:"+list2);
	}

}
