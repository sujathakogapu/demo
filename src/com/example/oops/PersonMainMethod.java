package com.example.oops;

import java.util.Scanner;

public class PersonMainMethod {
	public static void main(String[] args) {
		//Scanner scanner =new Scanner(System.in);
		//System.out.println("Enter a name: ");
		//String name=scanner.nextLine();
		//System.out.println("Enter a age: ");
		//int age=scanner.nextInt();
		Person obj = new Person();
		//obj.setAge(25);
		obj.setName("sujatha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
