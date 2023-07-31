package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDbConnection {
	public static Connection getConnection(String dbName) {
		String userName = "root";
		String passWord = "root";
		String url = "jdbc:mysql://localhost:3306/"+dbName;

		Connection connection = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2:establish the connection
			connection = DriverManager.getConnection(url, userName, passWord);
		} catch (SQLException | ClassNotFoundException e) {

		}
		return connection;
	}

}
