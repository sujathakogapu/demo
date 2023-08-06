package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallProcedure {
    public void callProcedure() {
        try (Connection conn = MySqlDbConnection.getConnection("sakila")) {
            String procedureCall = "{ call get_customer_amount_payment_date(?, ?, ?) }";
            CallableStatement cstmt = conn.prepareCall(procedureCall);
            cstmt.setInt(1, 1);
            cstmt.setString(2, "MARY");
            cstmt.registerOutParameter(3, java.sql.Types.DATE);
            System.out.println("Executing the procedure...");
            cstmt.execute();
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