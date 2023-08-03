package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateStoredProcedure {
	public void getBooks() {
		Connection connection = MySqlDbConnection.getConnection("library");
		try (

				CallableStatement statement = connection.prepareCall("{call get_books(?)}");) {

			statement.setInt(1, 5);

			boolean hadResults = statement.execute();

			// print headings
			System.out.println("| book_id | rating | comments |");
			System.out.println("================================");

			while (hadResults) {
				ResultSet resultSet = statement.getResultSet();

				// process result set
				while (resultSet.next()) {
					int book_id = resultSet.getInt("book_id");
					String comments = resultSet.getString("comments");
					int rating = resultSet.getInt("rating");

					System.out.println("| " + book_id + " | " + comments + " | " + rating + " |");
				}

				hadResults = statement.getMoreResults();
			}

			statement.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}
	public static void main(String[] args) {
		CreateStoredProcedure obj = new CreateStoredProcedure();
		obj.getBooks();
	}

}
