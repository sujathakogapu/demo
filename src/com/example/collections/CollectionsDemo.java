package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("padma");
		names.add("sujatha");
		names.add("nihaswi");
		names.add("siva");
		names.add("latha");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		ArrayList<Person>persons=new ArrayList<>();
		Person person1=new Person("padma",35);
		Person person2=new Person("Sujatha",21);
		Person person3=new Person("Siva",29);
		Person person4=new Person("latha",30);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		System.out.println(persons);
		Collections.sort(persons);
		System.out.println(persons);
		System.out.println("EMPLOYEE CLASS SORTING");
		ArrayList<Employee> employees=new ArrayList<>();
		Employee emp1=new Employee("A12345","Sujatha", (float) 10.5);
		Employee emp2=new Employee("Z123456","Manju", (float) 5.5);
		Employee emp3=new Employee("D23456","Arun",(float)20.45);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println("Before collection sort : " + employees);
		Collections.sort(employees);
		System.out.println("Internal (comparable interface) collection sort employee salaries: " + employees);
		Collections.sort(employees,new EmployeeIDComparator());
		System.out.println("External (comparator) collection sort by employee id: " + employees);
		Collections.sort(employees, new EmployeeNameComparator());
		System.out.println("External(comparator) collection sort by employee names: " + employees);
		System.out.println("STUDENT CLASS SORTING");
		ArrayList<StudentDetails> students=new ArrayList<>();
		StudentDetails student1=new StudentDetails("P12345","Sumalatha",  10.55);
		StudentDetails student2=new StudentDetails("PA123456","Sumathi",  5.55);
		StudentDetails student3=new StudentDetails("C7890","Sujatha",9.345);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		System.out.println("Before collection sort : " + students);
		Collections.sort(students);
		System.out.println("Internal (comparable interface) collection sort student gpas: " + students);
		Collections.sort(students,new StudentIDComparator());
		System.out.println("External (comparator) collection sort by student id: " + students);
		Collections.sort(students, new StudentNameComparator());
		System.out.println("External(comparator) collection sort by student names: " + students);
		
	}

}

