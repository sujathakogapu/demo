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
public class Employee implements Comparable<Employee> {
	private String employeeId;
	private String name;
	private float salary;

	public Employee(String employeeId, String name, float salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee emp = (Employee) obj;
		if (this.employeeId.equals(emp.employeeId) && this.name.equals(emp.name) && this.salary == (emp.salary)) {
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
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		if (this.salary < obj.salary) {
			return -1;
		} else if (this.salary > obj.salary) {
			return 1;

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<>();
		Employee emp1=new Employee("12345","sujatha", (float) 10.5);
		Employee emp2=new Employee("123456","Shiva", (float) 5.5);
		int compare=emp1.compareTo(emp2);
		if(compare==1) {
			System.out.println(emp1.name + " salary is greater than "+ emp2.name+" salary");
		}else if(compare==-1){
			System.out.println(emp1.name + " salary is less than "+ emp2.name+" salary");
		}
		else {
			System.out.println(emp1.name + " and  "+ emp2.name+ " have the same salary");
		}
		employee.add(emp1);
		employee.add(emp2);
		System.out.println("Before collection sort employee salaries: " + employee);
		Collections.sort(employee);
		System.out.println("After collection sort employee salaries: " + employee);
	}

	

}
