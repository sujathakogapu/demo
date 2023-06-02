package com.example.collections;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("banana");
		obj.add("apple");
		obj.add("orange");
		obj.add("grapes");
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println("After removing index 2");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(2));
		System.out.println("After removing grapes");
		obj.remove("grapes");
		System.out.println(obj.size());
		System.out.println(obj);
		obj.add(1, "pear");
		System.out.println("After adding index 1, pear");
		System.out.println(obj);
		System.out.println(obj.size());
		

	}

}
