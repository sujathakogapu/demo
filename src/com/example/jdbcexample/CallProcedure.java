package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallProcedure {
    public void callProcedure() {
        try (Connection conn = MySqlDbConnection.getConnection("sakila")) {
            // Add the procedure name with the parentheses and placeholders for parameters
            String procedureCall = "{ call get_customer_amount_payment_date(?, ?, ?) }";
            CallableStatement cstmt = conn.prepareCall(procedureCall);

            // Set input parameters
            cstmt.setInt(1, 1);
            cstmt.setString(2, "MARY");

            // Register output parameter
            cstmt.registerOutParameter(3, java.sql.Types.DATE);

            System.out.println("Executing the procedure...");
            cstmt.execute();

            // Get the result from the output parameter
            java.sql.Date paymentDate = cstmt.getDate(3);
            System.out.println("Payment date for customer: " + paymentDate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CallProcedure obj = new CallProcedure();
        obj.callProcedure();
    }
}