/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import servicee.RequestViewService;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewRequestFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewRequestFrame.class.getName());

    public ViewRequestFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public ViewRequestFrame(String role) {
        initComponents();
     setLocationRelativeTo(null);

    if (!"ADMIN".equalsIgnoreCase(role)) {
        JOptionPane.showMessageDialog(
            this,
            "Access denied. Administrators only.",
            "Access Denied",
            JOptionPane.WARNING_MESSAGE
        );
        dispose();
        return;
    }
     loadRequestsIntoTable();
     startAutoRefresh();
    }
       private javax.swing.Timer refreshTimer;
    private void startAutoRefresh() {
    refreshTimer = new javax.swing.Timer(5000, e -> {
        loadRequestsIntoTable();
        
    });

    refreshTimer.start();
}
    private void stopAutoRefresh() {
    if (refreshTimer != null) {
        refreshTimer.stop();
        addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        stopAutoRefresh();
    }
});
    }
}
    private void loadRequestsIntoTable() {
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{
            "Request ID",
            "Username",
            "Resident Name",
            "Service Type",
            "Purpose",
            "Status",
            "Date Submitted"
        },
        0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    try {
        RequestViewService service = new RequestViewService();
        service.loadRequests(model);
        tblRequests.setModel(model);
        
        lblRequestCount.setText(
    "Total Requests: " + model.getRowCount()
);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(
            this,
            "Could not load requests: " + ex.getMessage(),
            "Database Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnServiceRequest = new javax.swing.JButton();
        btnArchive = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnClearSearch = new javax.swing.JButton();
        lblRequestCount = new javax.swing.JLabel();
        lblStatusLegend = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 738));

        jPanel2.setBackground(new java.awt.Color(25, 73, 115));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicol\\Downloads\\src\\barangay_iponan_logo_small.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("BARANGAY IPONAN");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("SERVICE REQUEST SYSTEM");

        jLabel5.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("\"Serbisyong Tapat para sa Bawat Pamilyang Iponan...\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(25, 73, 115));

        btnHome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnHome.addActionListener(this::btnHomeActionPerformed);

        btnServiceRequest.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnServiceRequest.setText("Service Request");
        btnServiceRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnServiceRequest.addActionListener(this::btnServiceRequestActionPerformed);

        btnArchive.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnArchive.setText("Archive");
        btnArchive.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnArchive.addActionListener(this::btnArchiveActionPerformed);

        btnLogout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnArchive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnServiceRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnServiceRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(btnArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("REQUEST SERVICE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "username", "residentname", "service type", "purpose", "status", "submission date"
            }
        ));
        jScrollPane1.setViewportView(tblRequests);

        btnUpdateStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdateStatus.setText("UPDATE");
        btnUpdateStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnUpdateStatus.addActionListener(this::btnUpdateStatusActionPerformed);

        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("DELETE");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));

        btnRefresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.blue, java.awt.Color.blue));
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        txtSearch.addActionListener(this::txtSearchActionPerformed);

        jLabel7.setText("Search Request:");

        btnClearSearch.setText("Clear Search");
        btnClearSearch.addActionListener(this::btnClearSearchActionPerformed);

        lblRequestCount.setText("Total Request: 0");

        lblStatusLegend.setText(" STATUS: PENDING = Awaiting Review  |  APPROVED = Accepted | REJECTED = Declined ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearSearch)
                                .addGap(34, 34, 34)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusLegend, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRequestCount))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch)
                            .addComponent(jLabel7)
                            .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(lblRequestCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatusLegend, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchiveActionPerformed

    int selectedRow = tblRequests.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(
            this,
            "Please select a service request to archive."
        );
        return;
    }

    int modelRow = tblRequests.convertRowIndexToModel(selectedRow);
    int requestId = Integer.parseInt(
        tblRequests.getModel().getValueAt(modelRow, 0).toString()
    );

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to archive Request ID " + requestId + "?",
        "Confirm Archive",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String sql = "UPDATE service_requests "
               + "SET is_archived = TRUE "
               + "WHERE request_id = ?";

    try (Connection conn = db.Database.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setInt(1, requestId);

        if (pst.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(
                this,
                "Request archived successfully."
            );
            loadRequestsIntoTable();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Request was not found."
            );
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(
            this,
            "Error archiving request: " + ex.getMessage(),
            "Database Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnArchiveActionPerformed

    private void btnServiceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceRequestActionPerformed
          ServiceRequestFrame frame = new ServiceRequestFrame();
            frame.setVisible(true);
      }//GEN-LAST:event_btnServiceRequestActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainFrame frame = new MainFrame();
            frame.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadRequestsIntoTable();

       JOptionPane.showMessageDialog(
             this,
        "Requests refreshed successfully!"
);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        int selectedRow = tblRequests.getSelectedRow();

if (selectedRow == -1) {
    JOptionPane.showMessageDialog(
        this,
        "Please select a request from the table."
    );
    return;
}

int requestId = Integer.parseInt(
    tblRequests.getValueAt(selectedRow, 0).toString()
);

String[] statuses = {"PENDING", "APPROVED", "REJECTED"};

String status = (String) JOptionPane.showInputDialog(
    this,
    "Select the new request status:",
    "Update Request Status",
    JOptionPane.QUESTION_MESSAGE,
    null,
    statuses,
    "PENDING"
);

if (status == null) {
    return;
}

try {
    RequestViewService service = new RequestViewService();
    
int confirm = JOptionPane.showConfirmDialog(
    this,
    "Are you sure you want to change this request's status to "
        + status + "?",
    "Confirm Status Update",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE
);

if (confirm != JOptionPane.YES_OPTION) {
    return;
}

    service.updateRequestStatus(requestId, status);

    loadRequestsIntoTable();
    
    JOptionPane.showMessageDialog(
        this,
        "Request status updated successfully!"
    );

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(
        this,
        "Failed to update status: " + ex.getMessage(),
        "Database Error",
        JOptionPane.ERROR_MESSAGE
    );
}
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to log out?",
        "Confirm Logout",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        stopAutoRefresh();

        LoginFrame login = new LoginFrame();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        dispose();
    }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
String searchText = txtSearch.getText().trim();

DefaultTableModel model =
        (DefaultTableModel) tblRequests.getModel();

javax.swing.table.TableRowSorter<DefaultTableModel> sorter =
        new javax.swing.table.TableRowSorter<>(model);

tblRequests.setRowSorter(sorter);

if (searchText.isEmpty()) {
    sorter.setRowFilter(null);
} else {
    sorter.setRowFilter(
        javax.swing.RowFilter.regexFilter(
            "(?i)" + java.util.regex.Pattern.quote(searchText)
        )
    );
}
int visibleRequests = tblRequests.getRowCount();

lblRequestCount.setText(
    "Matching Requests: " + visibleRequests
);

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        
txtSearch.setText("");

javax.swing.table.TableRowSorter<?> sorter =
        (javax.swing.table.TableRowSorter<?>) tblRequests.getRowSorter();

if (sorter != null) {
    sorter.setRowFilter(null);
}
lblRequestCount.setText(
    "Total Requests: " + tblRequests.getRowCount()
);

    }//GEN-LAST:event_btnClearSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ViewRequestFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchive;
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnServiceRequest;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestCount;
    private javax.swing.JLabel lblStatusLegend;
    private javax.swing.JTable tblRequests;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
