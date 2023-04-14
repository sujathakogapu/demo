package com.example.basics;

public class Employee1 {
	String name = "shiva";
	String country = "india";
	String company = "ibm";
	int salary = 10000;

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		System.out.println("employee full details are" + "Employee name is " + emp1.name + "  employee country name is "
				+ emp1.country + "employee company name is  " + emp1.company + emp1.salary);

	}

}
