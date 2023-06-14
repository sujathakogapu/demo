package com.example.collections;
/*
11. Write a program to reverse a linked list.
    Input:
    [10 20 30 40 50]
    Output:
   LinkedList after reversal:[50 40 30 20 10]
 */

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
	public LinkedList<Integer> getReverse(LinkedList<Integer> list) {
		int reverse=0;
		LinkedList<Integer> list2=new LinkedList<>();
			for(int j=list.size()-1;j>=0;j--) {
				int val=(int)list.get(j);
				list2.add(val);
			}
		return list2;
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
	ReverseLinkedList obj=new ReverseLinkedList();
	LinkedList<Integer> outputlist=obj.getReverse(list);
	System.out.println("LinkedList after revers: "+outputlist);
	}
}
