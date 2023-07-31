package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversityRepository {
	public void printUniversityTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("university");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from courses");
			// step5:process result set
			while (rs.next()) {
				int coureseId = rs.getInt("id");
				String coureseName = rs.getString("course_name");
				String instructor = rs.getString("instructor");
				int credits = rs.getInt("credits");
				System.out.println(String.format("courseId=%s | courseName=%s | instructor=%s | credits=%s", coureseId,
						coureseName, instructor, credits));
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

	public void insertCourseTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("university");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement
					.executeUpdate("insert into university.courses (id, course_name, instructor, credits) values\r\n"
							+ "(7, 'Hindi', 'shiva', 4)");
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

	public void updateCourseTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("university");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("update university.courses set instructor='Teekshi' where id=7");
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

	public void deleteCourseTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("university");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("delete from university.courses where id=7");
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
		UniversityRepository obj = new UniversityRepository();
		// obj.printUniversityTable();
		// obj.insertCourseTable();
		// obj.updateCourseTable();
		obj.deleteCourseTable();

	}

}
