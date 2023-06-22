package com.example.collections;

import java.util.HashMap;

/*Assignment 2: Create a Student class with instance variables - studentId(String) and name(String). 
Two Student objects are equal if they have same studentId and name.
Put the Student objects as keys in hashmap and print them using for each loop
*/
public class StudentDetails {
	private String studentId;
	private String studentName;
	public StudentDetails(String studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	@Override
		public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		StudentDetails sudent=(StudentDetails)obj;
		if(this.equals(sudent.studentId)&&this.studentName.equals(sudent.studentName)) {
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
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	

	public static void main(String[] args) {
		HashMap<StudentDetails,Integer>student1=new HashMap<>();
		StudentDetails Raamu = new StudentDetails("Raamu","1234567890");
		student1.put(Raamu,100);
		StudentDetails Raani=new StudentDetails("Raani","123456");
		student1.put(Raani, 200);
		for(StudentDetails students:student1.keySet()) {
			System.out.println(students);
			System.out.println(student1.get(students));

		}
		HashMap<Integer,StudentDetails>fruitStock1=new HashMap<>();
		fruitStock1.put(100, Raamu);
		fruitStock1.put(200, Raani);
	}

}


