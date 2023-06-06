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
	public LinkedList getReverse(LinkedList list) {
		//LinkedList list2=new LinkedList();
		int reverse=0;
		for(int i=0;i<list.size();i++) {
			for(int j=list.size()-1;j>=0;j--) {
			}
			reverse=list(j);
		}
		return reverse;
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
	}
}
