package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.google.gson.Gson;

public class ConvertingJSONDataToADatabaseTable {
    public static void main(String[] args) throws ClassNotFoundException {
        String dbName = "organization"; // Update with your database name
        String userName = "root";
        String passWord = "root";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try (Reader reader = new FileReader("C:\\Users\\Sujatha\\Documents\\employees.json")) {
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String json = sb.toString(); // This is the JSON content

            // Create the Gson object and parse the JSON
            Gson gson = new Gson();
            Employee emp = gson.fromJson(json, Employee.class);

            Class.forName("com.mysql.cj.jdbc.Driver");
            try( Connection connection = DriverManager.getConnection(url, userName, passWord);) {
                
                
                connection.setAutoCommit(true); 

                String insertSql = "INSERT INTO employees (id, first_name, last_name, position, department, salary) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

                for (EmployeeDetails employee : emp.getEmployees()) {
                	System.out.println(employee);
                    preparedStatement.setInt(1, employee.getId());
                    preparedStatement.setString(2, employee.getFirstName());
                    preparedStatement.setString(3, employee.getLastName());
                    preparedStatement.setString(4, employee.getPosition());
                    preparedStatement.setString(5, employee.getDepartment());
                    preparedStatement.setDouble(6, employee.getSalary());

                    preparedStatement.executeUpdate();
                }

                preparedStatement.close();
                //connection.commit(); // Commit the transaction
                if(!emp.getEmployees().isEmpty()) {
                	System.out.println("Employees inserted successfully.");
                } else{
                	System.out.println("list is empty");
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}