package com.example.fileexamples;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<EmployeeDetails> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public List<EmployeeDetails> getEmployee() {
        return employees;
    }

    public void setEmployee(List<EmployeeDetails> employee) {
        this.employees = employee;
    }
}








