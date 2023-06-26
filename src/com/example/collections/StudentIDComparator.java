package com.example.collections;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		String studentID1 = o1.getStudentId();
		String studentID2 = o2.getStudentId();
		int studentIDS = studentID1.compareTo(studentID2);
		if (studentIDS < 0) {
			return -1;
		} else if (studentIDS > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
