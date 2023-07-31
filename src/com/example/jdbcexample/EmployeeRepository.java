package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRepository {
	public void insertEmployeeTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("employee");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate(
					"insert into employee.employees (first_name, last_name, email, department_id) values\r\n"
							+ "('sujatha', 'kogapu', 'ksuji142@gmail.com', 1)");
			// step5:print the inserted count
			System.out.println(String.format("the number of rows inserted :%s", count));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateEmployeeTable() {
		// step1:establish the connection
				Connection connection = MySqlDbConnection.getConnection("employee");

				Statement statement = null;
				int count = 0;
				try {
					// step2:load the mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// step3:create a sql statement
					statement = connection.createStatement();
					// step4:execute the insert query
					count = statement.executeUpdate("update employee.employees set department_id=2 where id=10");
					// step5:print the inserted count
					System.out.println(String.format("the number of rows updated :%s", count));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					// step6:close the resources
					try {
						statement.close();
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		
	}
	
	public void deleteEmployeeTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("employee");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("delete from employee.employees where id=11");
			// step5:print the inserted count
			System.out.println(String.format("the number of rows deleted :%s", count));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		EmployeeRepository obj=new EmployeeRepository();
		//obj.insertEmployeeTable();
		//obj.updateEmployeeTable();
		obj.deleteEmployeeTable();
		
	}

}
