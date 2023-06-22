package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*Assignment 2: Create a Student class with instance variables - studentId(String) and name(String). 
Two Student objects are equal if they have same studentId and name.
Put the Student objects as keys in hashmap and print them using for each loop
 In the Student class add an instance variable gpa(double) and implement Comparable interface to compare gpa's.
  Create a Arraylist of students and sort them using Collections.sort() method.
*/
public class StudentDetails {
	private String studentId;
	private String studentName;
	private double studentGPA;
	public StudentDetails(String studentId,String studentName,double studentGPA) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentGPA=studentGPA;
	}
	@Override
		public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		StudentDetails student=(StudentDetails)obj;
		if(this.equals(student.studentId)&&this.studentName.equals(student.studentName)&& this.studentGPA==(student.studentGPA)) {
			return true;
		}else {
			return false;
		}
		}
	@Override
		public int hashCode() {
		int result=this.studentName.hashCode();
		result=result+this.studentId.hashCode();
		return result;
		}
	

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA
				+ "]";
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of students gpas: ");
		int size=scanner.nextInt();
		ArrayList<Double> students=new ArrayList<>();
		System.out.println("Enter student gpas: ");
		double gpas=scanner.nextDouble();
		for(int i=0;i<size;i++) {
			students.add(scanner.nextDouble());
		}
		System.out.println("Before collection sort students gpas: " +students);
		Collections.sort(students);
		System.out.println("After collection sort students gpas: "+students);
	}

}


