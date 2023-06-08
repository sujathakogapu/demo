package com.example.collections;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private String grade;

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;

	}

	public static void main(String[] args) {
		Student student1 = new Student("sujatha", 26, "A");
		Student student2 = new Student("padmavathi", 26, "A");

		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			System.out.println(student.name + " " + student.age + " " + student.grade);
		}
	}

}
