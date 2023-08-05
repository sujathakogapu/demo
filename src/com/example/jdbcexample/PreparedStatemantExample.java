package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatemantExample {
	public void getCustomerDetails() {
        try (Connection connection = MySqlDbConnection.getConnection("sakila")) {
            String targetDepartment = "actor";
            String sqlQuery = ("select * from customer where first_name = 'PENELOPE'");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, targetDepartment);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
            	int id = resultSet.getInt("actor_id");
				//String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String lastUpdate = resultSet.getString("last_update");
				System.out.println(id + "  " + lastName + " " + lastUpdate);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		PreparedStatemantExample obj=new PreparedStatemantExample();
		obj.getCustomerDetails();
	}
}
