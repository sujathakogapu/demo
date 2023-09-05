package com.example.fileexamples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmployeeSerialization {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (Reader reader = new FileReader("C:\\Users\\Sujatha\\Documents\\employees.json")) {
            Employee emp = gson.fromJson(reader, Employee.class);

            // Create a new EmployeeDetails instance and set its properties
            EmployeeDetails newEmp = new EmployeeDetails();
            newEmp.setId(11);
            newEmp.setFirstName("sujatha");
            newEmp.setLastName("kogapu");
            newEmp.setPosition("student");
            newEmp.setDepartment("coding");
            newEmp.setSalary(10000);

            if (emp.getEmployees() != null) {
                emp.getEmployees().add(newEmp); // Add the new employee to the list
            } else {
                System.err.println("Error: Employee list is null.");
            }

            // Serialize the modified Employee object to JSON string
            String newJson = gson.toJson(emp);

            // Write the JSON string back to the original file to modify it
            try (FileWriter writer = new FileWriter("C:\\Users\\Sujatha\\Documents\\employees.json")) {
                writer.write(newJson);
                System.out.println("New employee added successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}