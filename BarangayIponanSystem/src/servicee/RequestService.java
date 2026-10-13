/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicee;


import db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RequestService {

    public boolean saveRequest(
            String username,
            String firstname,
            String lastname,
            String middlename,
            String birthdate,
            String gender,
            String address,
            String civilStatus,
            String contact,
            String email,
            String occupation,
            String idType,
            String idNumber,
            String serviceType,
            String purpose,
            boolean validID,
            boolean proofAddress,
            boolean otherDocuments,
            String paymentMethod) throws SQLException {

        String sql = "INSERT INTO service_requests "
                + "(username, firstname, lastname, middlename, "
                + "birthdate, gender, address, civil_status, "
                + "contact, email, occupation, id_type, id_number, "
                + "service_type, purpose, valid_id, proof_address, "
                + "other_documents, payment_method) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, username);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, middlename);

            if (birthdate == null || birthdate.trim().isEmpty()) {
                pst.setNull(5, java.sql.Types.DATE);
            } else {
                pst.setDate(
                    5,
                    java.sql.Date.valueOf(birthdate)
                );
            }

            pst.setString(6, gender);
            pst.setString(7, address);
            pst.setString(8, civilStatus);
            pst.setString(9, contact);
            pst.setString(10, email);
            pst.setString(11, occupation);
            pst.setString(12, idType);
            pst.setString(13, idNumber);
            pst.setString(14, serviceType);
            pst.setString(15, purpose);
            pst.setBoolean(16, validID);
            pst.setBoolean(17, proofAddress);
            pst.setBoolean(18, otherDocuments);
            pst.setString(19, paymentMethod);

            return pst.executeUpdate() == 1;
        }
    }
    
public int saveRequestAndGetId(
        String username,
        String firstname,
        String lastname,
        String middlename,
        String birthdate,
        String gender,
        String address,
        String civilStatus,
        String contact,
        String email,
        String occupation,
        String idType,
        String idNumber,
        String serviceType,
        String purpose,
        boolean validID,
        boolean proofAddress,
        boolean otherDocuments,
        String paymentMethod) throws SQLException {

    String sql = "INSERT INTO service_requests "
            + "(username, firstname, lastname, middlename, "
            + "birthdate, gender, address, civil_status, "
            + "contact, email, occupation, id_type, id_number, "
            + "service_type, purpose, valid_id, proof_address, "
            + "other_documents, payment_method) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
            + "?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = Database.getConnection();
         PreparedStatement pst = conn.prepareStatement(
                 sql, Statement.RETURN_GENERATED_KEYS)) {

        pst.setString(1, username);
        pst.setString(2, firstname);
        pst.setString(3, lastname);
        pst.setString(4, middlename);

        if (birthdate == null || birthdate.trim().isEmpty()) {
            pst.setNull(5, java.sql.Types.DATE);
        } else {
            pst.setDate(5, java.sql.Date.valueOf(birthdate));
        }

        pst.setString(6, gender);
        pst.setString(7, address);
        pst.setString(8, civilStatus);
        pst.setString(9, contact);
        pst.setString(10, email);
        pst.setString(11, occupation);
        pst.setString(12, idType);
        pst.setString(13, idNumber);
        pst.setString(14, serviceType);
        pst.setString(15, purpose);
        pst.setBoolean(16, validID);
        pst.setBoolean(17, proofAddress);
        pst.setBoolean(18, otherDocuments);
        pst.setString(19, paymentMethod);

        int affectedRows = pst.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Saving the request failed.");
        }

        try (java.sql.ResultSet keys = pst.getGeneratedKeys()) {
            if (keys.next()) {
                return keys.getInt(1);
            } else {
                throw new SQLException(
                    "Request saved, but its generated ID could not be retrieved."
                );
            }
        }
    }
}

}

