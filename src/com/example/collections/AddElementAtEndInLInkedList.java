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
	public LinkedList addElementAtEnd(LinkedList list, int addElement) {
		LinkedList list2=new LinkedList();
		for(int i=0;i<list.size();i++) {
			int ele=(int) list.get(i);
			int output=ele.addLast(6);
		}
				
		return output;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		LinkedList list=new LinkedList();
		System.out.println("Enter a elements: ");
		for(int i=0;i<size;i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Enter a add element: ");
		int addElement=scanner.nextInt();
		AddElementAtEndInLInkedList obj=new AddElementAtEndInLInkedList();
		LinkedList list2=obj.addElementAtEnd(list,addElement);
		System.out.println("LinkedList after adding element 6 at end:"+list2);
	}

}
