package com.example.jdbcexample;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallProcedure {


		    	public void callProcedure() {
		        try (Connection conn = MySqlDbConnection.getConnection("sakila")) {
		            String procedureCall = "{ get_customer_amount_payment_date() }";
		            CallableStatement cstmt = conn.prepareCall(procedureCall);
		            cstmt.setInt("customer_id_p", 1);
		            cstmt.setString(2, "first_name_p");
		            System.out.println("excute the procedure");
		            cstmt.execute();
		        } catch (SQLException e) {
		            e.printStackTrace();
		           
		        }
		        //System.out.println(cstmt.getResultSet);
		    }
				
	public static void main(String[] args) {
		
		CallProcedure obj=new CallProcedure();
		obj.callProcedure();
	}

	}

