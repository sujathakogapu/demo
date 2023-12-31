package com.example.fileexamples;

import java.util.ArrayList;

import com.example.collections.Employee;

public class EmployeeDetails {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private int salary;

    // Getters and setters


    @Override
    public String toString() {
        return "EmployeeDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", position="
                + position + ", department=" + department + ", salary=" + salary + "]";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}