package com.example.collections;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		String stdName1 = o1.getStudentName();
		String stdName2 = o2.getStudentName();
		int studentNames = stdName1.compareTo(stdName2);
		if (studentNames < 0) {
			return -1;
		} else if (studentNames > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
