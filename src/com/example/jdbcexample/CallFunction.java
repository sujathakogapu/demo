package com.example.jdbcexample;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CallFunction {
	    	public void callFunction() {
	        try (Connection conn = MySqlDbConnection.getConnection("sakila")) {
	            String procedureCall = "{ get_customer_balance(p_customer_id,p_effective_date) }";
	            CallableStatement cstmt = conn.prepareCall(procedureCall);
	            cstmt.setInt("p_customer_id", 1);
	            cstmt.setString(2, "p_effective_date");
	            cstmt.execute();
	        } catch (SQLException e) {
	            e.printStackTrace();
	           
	        }
	        //System.out.println(cstmt.getResultSet);
	    }
			
public static void main(String[] args) {
	
	CallFunction obj=new CallFunction();
	obj.callFunction();
}

}