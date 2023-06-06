package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
3.Write a program to remove all occurrences of a specific element from an
  ArrayList.
  Input:
  Enter the number of elements: 7
  Enter the array elements: 20 30 10 50 30 45 60
  Element to remove: 30
  Output:
  ArrayList after removing all occurrences of element 30: [20,10,50,45,60]
*/

public class RemoveAllOccurrences {
	public ArrayList removeOccurrencesElements(ArrayList obj,int size) {
		//int elements=obj.size();
		//int removeElement=30;
		for(int i=0;i<obj.size();i++) {
			if(obj.get(i).equals(30)) {
				obj.remove(i--);
			}
		}
		return obj;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size=scanner.nextInt();
		ArrayList obj=new ArrayList();
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			obj.add(scanner);
		}
		System.out.println("Enter to remove: ");
		int remove=scanner.nextInt();
		scanner.close();
		RemoveAllOccurrences rmao=new RemoveAllOccurrences();
		ArrayList afterRemove=rmao.removeOccurrencesElements(obj, size);
		System.out.println("ArrayList after removing all occurrences of element 30:"+afterRemove);
	}

}

