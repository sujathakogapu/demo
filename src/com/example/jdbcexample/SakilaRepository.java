package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SakilaRepository {
	public void printActorTable() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("sakila");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from actor limit 10");
			// step5:process result set
			while (rs.next()) {
				int actorId = rs.getInt("actor_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				System.out.println(
						String.format("actorId=%s | firstName=%s | lastName=%s", actorId, firstName, lastName));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void printCustomerTable() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("sakila");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from customer limit 10");
			// step5:process result set
			while (rs.next()) {
				int customerId = rs.getInt("customer_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				System.out.println(String.format("actorId=%s | firstName=%s | lastName=%s | email=%s", customerId,
						firstName, lastName, email));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	public static void main(String[] args) {
		SakilaRepository obj=new SakilaRepository();
		//obj.printActorTable();
		obj.printCustomerTable();
		
	}


}
