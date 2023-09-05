package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class EmployeeDeserialization {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("C:\\Users\\Sujatha\\Documents\\employees.json")) {
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String json = sb.toString();
            
            Gson gson = new Gson();

            // Deserialize JSON data into an Employee object
            Employee emp = gson.fromJson(json, Employee.class);

            // Iterate over the list of employees and print their details
            for (EmployeeDetails newEmp : emp.getEmployees()) {
                System.out.println("ID: " + newEmp.getId());
                System.out.println("First Name: " + newEmp.getFirstName());
                System.out.println("Last Name: " + newEmp.getLastName());
                System.out.println("Position: " + newEmp.getPosition());
                System.out.println("Department: " + newEmp.getDepartment());
                System.out.println("Salary: " + newEmp.getSalary());
                System.out.println();
            	System.out.println(newEmp);
            }
            System.out.println("successfully get the employee details");
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
    }
}