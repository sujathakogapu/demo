package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CreateFunctionExample {
	public void getEmployeeIdByFistName() {
		Connection connection = MySqlDbConnection.getConnection("employee");
		try (

				CallableStatement statement = connection
						.prepareCall("{? = call employee.get_employee_id_by_firstname(?)}");) {
			statement.registerOutParameter(1, Types.INTEGER);
			statement.setString(2, "john");

			boolean hadResults = statement.execute();

			// print headings
			System.out.println("| id | first_name | ");
			System.out.println("================================");
			System.out.println("employee firstName" + statement.getString(1));

			while (hadResults) {
				ResultSet resultSet = statement.getResultSet();

				// process result set
				while (resultSet.next()) {
					int empId = resultSet.getInt("id");
					String firstName = resultSet.getString("first_name");

					System.out.println("| " + empId + " | " + firstName + " | ");
				}

				hadResults = statement.getMoreResults();
			}

			statement.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
		CreateFunctionExample obj = new CreateFunctionExample();
		obj.getEmployeeIdByFistName();

	}

}
