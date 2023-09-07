package com.example.fileexamples;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertDuplicateXmlDataToDB {
    public static void main(String[] args) {
        String dbName = "conversion";
        String userName = "root";
        String passWord = "root";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try {
            // Load and parse XML data
        	File xmlFile = new File("C:\\Users\\Sujatha\\Downloads\\employeesDuplicate.xml");
        	JAXBContext jaxbContext = JAXBContext.newInstance(XDEmployee.class);
        	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        	XDEmployee employeeDetails = (XDEmployee) jaxbUnmarshaller.unmarshal(xmlFile);
        	System.out.println("Parsed XML Data:");
        	System.out.println(employeeDetails);


            // Establish a database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, userName, passWord)) {
                connection.setAutoCommit(false); // Disable autocommit

                // Remove duplicates from the list of employees
                List<XDEmployeeDetails> employeeList = employeeDetails.getEmployees();
                Set<XDEmployeeDetails> uniqueEmployees = new HashSet<>(employeeList);

                for (XDEmployeeDetails employee : uniqueEmployees) {
                    // Check if the employee already exists in the database
                    if (!employeeExists(connection, employee)) {
                        // Insert the employee into the database
                        insertEmployee(connection, employee);
                    }
                }

                // Commit the transaction
                connection.commit();
                System.out.println("Converted XML data to the database successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (JAXBException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean employeeExists(Connection connection, XDEmployeeDetails employee) throws SQLException {
    	try (PreparedStatement checkStatement = connection.prepareStatement(
    		    "SELECT COUNT(*) FROM conversion.employee WHERE empId = ? AND first_name = ? AND last_name = ? AND department = ? AND salary = ?"
    		)) {
    		    checkStatement.setInt(1, employee.getEmployeeId());
    		    checkStatement.setString(2, employee.getFirstName());
    		    checkStatement.setString(3, employee.getLastName());
    		    checkStatement.setString(4, employee.getDepartment());
    		    checkStatement.setInt(5, employee.getSalary());
    		    ResultSet resultSet = checkStatement.executeQuery();

    		    if (resultSet.next()) {
    		        int count = resultSet.getInt(1);
    		        boolean exists = count > 0;
    		        System.out.println("Employee exists: " + exists + " - " + employee);
    		        return exists;
    		    } else {
    		        System.out.println("No matching rows found for: " + employee);
    		        return false;
    		    }
    		} catch (SQLException e) {
    		    e.printStackTrace();
    		}
		return false;
    }

    private static void insertEmployee(Connection connection, XDEmployeeDetails employee) throws SQLException {
    	try (PreparedStatement statement = connection.prepareStatement(
    		    "INSERT INTO conversion.employee (empId, first_name, last_name, department, salary) VALUES (?, ?, ?, ?, ?)"
    		)) {
    		    statement.setInt(1, employee.getEmployeeId());
    		    statement.setString(2, employee.getFirstName());
    		    statement.setString(3, employee.getLastName());
    		    statement.setString(4, employee.getDepartment());
    		    statement.setInt(5, employee.getSalary());
    		    int rowsInserted = statement.executeUpdate();
    		    if (rowsInserted > 0) {
    		        System.out.println("Inserted data successfully: " + employee);
    		    }
    		} catch (SQLException e) {
    		    e.printStackTrace();
    		}
}
}