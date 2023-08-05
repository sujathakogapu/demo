package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {
	public void getCountRewardsReports() {
		Connection connection = MySqlDbConnection.getConnection("sakila");
		try (

				CallableStatement callbleStatement = connection
						.prepareCall("{call sakila.rewards_report(?,?,?)}");) {

			callbleStatement.setInt(1, 2);
			callbleStatement.setInt(2, 2);
			callbleStatement.registerOutParameter(3, Types.INTEGER);

			callbleStatement.execute();
			int countRewardsReport = callbleStatement.getInt(3);
			System.out.println(countRewardsReport);

			callbleStatement.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
		CallableStatementExample obj = new CallableStatementExample();
		obj.getCountRewardsReports();
	}

}
