package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public void getStatement() {
		try (Connection connection = MySqlDbConnection.getConnection("sakila");
				Statement statement = connection.createStatement()) {
			String sqlQuery = ("select * from actor limit 10");
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				int id = resultSet.getInt("actor_id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String lastUpdate = resultSet.getString("last_update");
				System.out.println(id + "  " + firstName + " " + lastName + " " + lastUpdate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StatementExample obj = new StatementExample();
		obj.getStatement();
	}

}
