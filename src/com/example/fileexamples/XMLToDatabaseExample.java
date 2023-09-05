package com.example.fileexamples;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class XMLToDatabaseExample {
	public static void main(String[] args) throws IOException {
		String dbName = "organization";
		String userName = "root";
		String passWord = "root";
		String url = "jdbc:mysql://localhost:3306/" + dbName;

		try {
			File xmlFile = new File("C:\\Users\\Sujatha\\Documents\\employees.xml"); // Provide the actual path to your
																						// XML file
			JAXBContext jaxbContext = JAXBContext.newInstance(XEmployee.class); // Use your class name
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			XEmployee employeeDetails = (XEmployee) jaxbUnmarshaller.unmarshal(xmlFile);

			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager.getConnection(url, userName, passWord)) {
				String insertSql = "INSERT INTO employees (id, first_name, last_name, department, position, salary) VALUES (?, ?, ?, ?, ?, ?)";
				try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {

					for (XEmployeeDetail employees : employeeDetails.getEmployees()) {
						preparedStatement.setInt(1, employees.getId());
						preparedStatement.setString(2, employees.getFirstName());
						preparedStatement.setString(3, employees.getLastName());
						//preparedStatement.setString(4, employees.getEmail());
						preparedStatement.setString(4, employees.getDepartment());
						preparedStatement.setString(5, employees.getPosition());
						preparedStatement.setDouble(6, employees.getSalary());

						preparedStatement.executeUpdate();
					}

					// No need to explicitly commit in this case

					if (!employeeDetails.getEmployees().isEmpty()) {
						System.out.println("Employees inserted successfully.");
					} else {
						System.out.println("List is empty");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (JAXBException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}