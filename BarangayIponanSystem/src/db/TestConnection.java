/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try (Connection conn =
                     Database.getConnection()) {

            System.out.println(
                "SUCCESS! Connected to barangay_iponan."
            );

        } catch (SQLException e) {
            System.out.println(
                "Connection failed: " + e.getMessage()
            );
        }
    }
}
