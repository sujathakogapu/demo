package com.example.fileexamples;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "employees")
public class XDEmployee {
    private List<XDEmployeeDetails> employees;

    public XDEmployee() {
        employees = new ArrayList<>();
    }

    @XmlElement(name = "employee")
    public List<XDEmployeeDetails> getEmployees() {
        return employees;
    }

    public void setEmployees(List<XDEmployeeDetails> employees) {
        this.employees = employees;
    }

}