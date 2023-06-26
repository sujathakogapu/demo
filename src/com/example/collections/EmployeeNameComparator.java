package com.example.collections;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String empName1 = o1.getName();
		String empName2 = o2.getName();
		int empNames = empName1.compareTo(empName2);
		if (empNames < 0) {
			return -1;
		} else if (empNames > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
