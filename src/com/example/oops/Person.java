package com.example.oops;

/*
 * Assignment: Create a class called "Person" with private attributes like "name" and "age".
 *  Implement getter and setter methods to access and modify these attributes.
 *   Create an instance of the class and demonstrate the use of the getter and setter methods.
 */
public class Person {

	// create a private variables
	private String name = "Sujathakogapu";
	private int age = 26;

	// create a getter for visibility
	public String getName() {
		return this.name;
	}

	// create a getter for visibility
	public int getAge() {
		return this.age;
	}

	// create a setter for validations
	// flight ticket validations
	public void setName(String name) {
		if (name == "SujathaKogapu" && age == 26) {
			System.out.println("Details are validated so you can allow");
		} else {
			System.out.println("Details are not valid so you cant allow");
		}

	}

}
