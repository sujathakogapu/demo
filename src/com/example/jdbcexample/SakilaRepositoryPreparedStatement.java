package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SakilaRepositoryPreparedStatement {
    public void getCustomerDetails() {
        try (Connection connection = MySqlDbConnection.getConnection("sakila")) {
            String sqlQuery = "SELECT * FROM customer WHERE customer_id = ? AND first_name = ? AND last_name = ? AND email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "MARY");
            preparedStatement.setString(3, "SMITH");
            preparedStatement.setString(4, "MARY.SMITH@sakilacustomer.org");

            ResultSet rs = preparedStatement.executeQuery();

            System.out.println("customer_id, first_name, last_name, email");
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                System.out.println(customerId + " " + firstName + "  " + lastName + " " + email);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SakilaRepositoryPreparedStatement obj = new SakilaRepositoryPreparedStatement();
        obj.getCustomerDetails();
    }
}