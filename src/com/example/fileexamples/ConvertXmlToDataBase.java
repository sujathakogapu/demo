package com.example.fileexamples;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConvertXmlToDataBase {
    public static void main(String[] args) {
        String dbName = "conversion"; // Update with your database name
        String userName = "root";
        String passWord = "root";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try {
            // Step 1: Create JAXB context and unmarshaller
            JAXBContext context = JAXBContext.newInstance(XDEmployee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Step 2: Unmarshal the XML file into Java objects
            File xmlFile = new File("C:\\Users\\Sujatha\\Downloads\\employeesDuplicate.xml");
            XDEmployee employee = (XDEmployee) unmarshaller.unmarshal(xmlFile);
            List<XDEmployeeDetails> employeeList = employee.getEmployees();

            // Step 3: Create a set to store unique employee IDs
            Set<Integer> uniqueEmployeeIds = new HashSet<>();

            // Step 4: Create a list to store unique employee details
            List<XDEmployeeDetails> uniqueEmployees = new ArrayList<>();

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, userName, passWord)) {
                connection.setAutoCommit(true);

                // Step 5: Iterate through employee list to remove duplicates
                for (XDEmployeeDetails empDetails : employeeList) {
                    if (uniqueEmployeeIds.add(empDetails.getEmployeeId())) {
                        uniqueEmployees.add(empDetails);
                    }
                }

                System.out.println("Number of unique employees: " + uniqueEmployees.size());

                // Step 6: Prepare SQL statement for insertion
                String insertSql = "INSERT INTO conversion.employee(empId, first_name, last_name, department, salary) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
                    for (XDEmployeeDetails empDetails : uniqueEmployees) {
                        preparedStatement.setInt(1, empDetails.getEmployeeId());
                        preparedStatement.setString(2, empDetails.getFirstName());
                        preparedStatement.setString(3, empDetails.getLastName());
                        preparedStatement.setString(4, empDetails.getDepartment());
                        preparedStatement.setDouble(5, empDetails.getSalary());

                        // Step 7: Execute the insertion
                        int rowsInserted = preparedStatement.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Inserted data successfully: " + empDetails);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (JAXBException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}