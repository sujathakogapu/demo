package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorldRepository {
	public void printCityTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("world");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from city");
			// step5:process result set
			while (rs.next()) {
				int cityId = rs.getInt("Id");
				String cityName = rs.getString("Name");
				String countryCode = rs.getString("CountryCode");
				String district = rs.getString("District");
				int cityPopulation = rs.getInt("Population");
				System.out.println(
						String.format("cityId=%s | cityName=%s | countryCode=%s | district=%s | cityPopulation", cityId,
								cityName, countryCode, district, cityPopulation));
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

	public void insertCityTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("world");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement
					.executeUpdate("insert into world.city (Name, CountryCode, District, Population) values\r\n"
							+ "('Hyderabad', 'IND', 'Medchal', 234567)");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows Inserted :%s", count));
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

	public void updateCityTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("world");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("update world.city set Name='Secundrabad' where CountryCode='IND'");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows update :%s", count));
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

	public void deleteCityTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("world");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("delete from world.city where Name='Hyderabad'");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows deleted :%s", count));
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
		WorldRepository obj = new WorldRepository();
		// obj.printCityTable();
		// obj.insertCityTable();
		// obj.updateCityTable();
		obj.deleteCityTable();

	}

}
