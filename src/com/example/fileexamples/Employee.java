package com.example.fileexamples;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<EmployeeDetails> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public List<EmployeeDetails> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDetails> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employee [employees=" + employees + "]";
    }
}