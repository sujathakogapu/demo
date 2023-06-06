package com.example.collections;
/*
5.Write a program to remove duplicates from an ArrayList.
  Input:
  [10,20,30,20,40,30,50]
   Output:
   ArrayList after removing duplicates: [10,20,30,40,50]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	public ArrayList removeDuplicateElemnts(ArrayList obj) {
		int count=obj.size();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<=count;j++) {
				if(obj.get(i).equals(obj.get(j))) {
					obj.remove(j--);
					count--;
				}
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
			obj.add(scanner.nextInt());
		}
		RemoveDuplicates rmdp=new RemoveDuplicates();
		ArrayList output=rmdp.removeDuplicateElemnts(obj);
		System.out.println(output);
	}

}
