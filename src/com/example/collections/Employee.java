package com.example.collections;

import java.util.HashMap;

/*Assignment 1: Create an Employee class with instance variables - employeeId(String) and name(String). 
Two employee objects are equal if they have same employeeId and name.
 Put the employee objects as keys in hashmap and print them using for each loop.
*/
public class Employee {
	private String employeeId;
	private String name;

	public Employee(String employeeId, String name) {
		this.employeeId= employeeId;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee emp = (Employee) obj;
		if (this.employeeId.equals(emp.employeeId) && this.name.equals(emp.name)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		int result=this.employeeId.hashCode();
		result=result+this.name.hashCode();
		return result;
	}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
}
	public static void main(String[] args) {
		HashMap<Employee,Integer>empDetails=new HashMap<>();
		Employee emp1 = new Employee("12345","sujatha");
		empDetails.put(emp1,1000);
		Employee emp2=new Employee("1234567","theekshi");
		empDetails.put(emp2, 2000);
		for(Employee empl:empDetails.keySet()) {
			System.out.println(empl);
			System.out.println(empDetails.get(empl));

		}
		HashMap<Integer,Employee>empDetails1=new HashMap<>();
		//empDetails1.put(1000, sujatha);
		//empDetails1.put(2000, shiva);
	}

}

