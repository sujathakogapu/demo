package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*Assignment 2: Create a Student class with instance variables - studentId(String) and name(String). 
Two Student objects are equal if they have same studentId and name.
Put the Student objects as keys in hashmap and print them using for each loop
 In the Student class add an instance variable gpa(double) and implement Comparable interface to compare gpa's.
  Create a Arraylist of students and sort them using Collections.sort() method.
*/
public class StudentDetails implements Comparable<StudentDetails>  {
	private String studentId;
	private String studentName;
	private double studentGPA;

	public StudentDetails(String studentId, String studentName, double studentGPA) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		StudentDetails student = (StudentDetails) obj;
		if (this.equals(student.studentId) && this.studentName.equals(student.studentName)
				&& this.studentGPA == (student.studentGPA)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int result = this.studentName.hashCode();
		result = result + this.studentId.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA
				+ "]";
	}
	
	public int compareTo(StudentDetails obj) {
		if (this.studentGPA < obj.studentGPA) {
			return -1;
		} else if (this.studentGPA > obj.studentGPA) {
			return 1;

		} else {
			return 0;
		}

	}


	public static void main(String[] args) {
		ArrayList<StudentDetails> students=new ArrayList<>();
		StudentDetails student1=new StudentDetails("12345","sujatha",  10.55);
		StudentDetails student2=new StudentDetails("123456","Shiva",  5.55);
		int compare=student1.compareTo(student2);
		if(compare==1) {
			System.out.println(student1.studentName + " GPA is greater than "+ student2.studentName+" GPA");
		}else if(compare==-1){
			System.out.println(student1.studentName + " GPA is less than "+ student2.studentName+" GPA");
		}
		else {
			System.out.println(student1.studentName + " and  "+ student2.studentName+ " have the same GPA");
		}
		students.add(student1);
		students.add(student2);
		System.out.println("Before collection sort students gpas: " + students);
		Collections.sort(students);
		//Collections.sort(employee);
		System.out.println("After collection sort students gpas: " + students);
	}
}
