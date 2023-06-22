package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*Assignment 1: Create an Employee class with instance variables - employeeId(String) and name(String). 
Two employee objects are equal if they have same employeeId and name.
 Put the employee objects as keys in hashmap and print them using for each loop.
  In the Employee class add an instance variable salary(float) and implement Comparable interface to compare salaries. 
  Create a Arraylist of employees and sort them using Collections.sort() method.
*/
public class Employee implements Comparable<Employee>{
	private String employeeId;
	private String name;
	private float salary;
	

	public Employee(String employeeId, String name,float salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary=salary;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee emp = (Employee) obj;
		if (this.employeeId.equals(emp.employeeId) && this.name.equals(emp.name) && this.salary==(emp.salary)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int result = this.employeeId.hashCode();
		result = result + this.name.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of employee salaries: ");
		int size=scanner.nextInt();
		ArrayList<Float> employee=new ArrayList<>();
		System.out.println("Enter employee salaries: ");
		float salary=scanner.nextFloat();
		for(int i=0;i<size;i++) {
			employee.add(scanner.nextFloat());
		}
		System.out.println("Before collection sort employee salaries: " +employee);
		Collections.sort(employee);
		System.out.println("After collection sort employee salaries: "+employee);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
