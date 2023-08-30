package com.example.fileexamples;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "employees")
public class XEmployee {
    private List<XEmployeeDetail> employees = new ArrayList<>();

    @XmlElement(name = "employee")
    public List<XEmployeeDetail> getEmployees() {
        return employees;
    }

    public void addEmployee(XEmployeeDetail employee) {
        employees.add(employee);
    }
}