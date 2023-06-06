package com.example.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
8.Write a program to remove the first element from a LinkedList
  Input:
  [10 20 30 40 50]
  Output:
  LinkedList after removing the first element: 20 30 40 50.
*/
public class RemoveFirstElementInLinkedList {
	//public LinkedList removeElements(LinkedList list) {
		//return null;
	//}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		LinkedList list=new LinkedList();
		System.out.println("Enter a elements: ");
		for(int i=0;i<size;i++) {
			list.add(scanner.nextInt());
		}
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list);
		
	}
}
