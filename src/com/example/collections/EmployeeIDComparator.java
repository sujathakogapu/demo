package com.example.collections;

import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String empId1 = o1.getEmployeeId();
		String empId2 = o2.getEmployeeId();
		int empIDS = empId1.compareTo(empId2);
		if (empIDS < 0) {
			return -1;
		} else if (empIDS > 0) {
			return 1;

		} else {
			return 0;
		}
	}
}
