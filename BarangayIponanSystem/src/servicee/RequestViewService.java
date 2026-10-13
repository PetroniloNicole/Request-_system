/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicee;

import db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class RequestViewService {
    public void updateRequestStatus(int requestId, String status)
        throws SQLException {

    String sql = "UPDATE service_requests "
               + "SET status = ? "
               + "WHERE request_id = ?";

    try (Connection conn = Database.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setString(1, status);
        pst.setInt(2, requestId);

        pst.executeUpdate();
    }
}
    public void loadRequests(DefaultTableModel model)
            throws SQLException {

        String sql = "SELECT request_id, username, firstname, "
                + "lastname, service_type, purpose, status, "
                + "created_at FROM service_requests "
                + "ORDER BY created_at DESC";

        model.setRowCount(0);

        try (Connection conn = Database.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("request_id"),
                    rs.getString("username"),
                    rs.getString("firstname") + " "
                        + rs.getString("lastname"),
                    rs.getString("service_type"),
                    rs.getString("purpose"),
                    rs.getString("status"),
                    rs.getTimestamp("created_at")
                });
            }
        }
    }
}
