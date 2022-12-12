/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Warehouse;

import userinterface.StoreManager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohit
 */
public class ManageStoreRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserOrdersJPanel
     */
    Connection connection;
    public ManageStoreRequestsJPanel(Connection connection) {
        initComponents();
        
        this.connection=connection;
        populateStoreRequestsTable(connection);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserOrders = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStoreRequests = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAcceptReject = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 56, 82));

        lblUserOrders.setBackground(new java.awt.Color(255, 255, 255));
        lblUserOrders.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblUserOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblUserOrders.setText("STORE REQUESTS");

        tblStoreRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Order Items", "Order Total"
            }
        ));
        jScrollPane1.setViewportView(tblStoreRequests);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        btnAcceptReject.setText("Raise Shipment");
        btnAcceptReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRejectActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select...", "Shipment Raised", "cancelled" }));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUserOrders)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnAcceptReject)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblUserOrders)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addComponent(btnAcceptReject)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAcceptRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptRejectActionPerformed
        try{
            int selectedRowIndex = tblStoreRequests.getSelectedRow();

            if(selectedRowIndex < 0){
                JOptionPane.showMessageDialog(this, "Please select an item to view its details");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblStoreRequests.getModel();
            String orderItems = (String) model.getValueAt(selectedRowIndex, 2);
            String orderTotal = (String) model.getValueAt(selectedRowIndex, 3);
            Double total = Double.valueOf(orderTotal);
            
            PreparedStatement preparedStatement =connection.prepareStatement("insert into shipment_orders values(?,?,?,?,?)");
            preparedStatement.setString(1,generateUniqueId());
            preparedStatement.setString(2, LocalDate.now().toString());
            preparedStatement.setString(3,orderItems);
            preparedStatement.setDouble(4, total);
            preparedStatement.setString(5, "Shipment Requested");
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Shipment Requested Successfully");
            System.out.println("Shipment Order inserted Successfully");

            populateStoreRequestsTable(connection);
           
            
        }
        catch(SQLException e){
            System.out.println("Error Connecting Database" + e);}
    }//GEN-LAST:event_btnAcceptRejectActionPerformed


            
   
    
        public void populateStoreRequestsTable(Connection connection){
        DefaultTableModel model = (DefaultTableModel) tblStoreRequests.getModel();
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from warehouse_orders");
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[4];
            rows[0]= rs.getString(1);
            rows[1]=rs.getString(2);
            rows[2]=rs.getString(3);
            rows[3]=rs.getString(4);
            
            model.addRow(rows);
            }
        }
        catch(SQLException e){System.out.println(e);}
    }
        
        public String generateUniqueId(){
        Random random = new Random();
        String res = "";
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<6;i++){
            res += arr[random.nextInt(arr.length)];
        }
        return res;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptReject;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserOrders;
    private javax.swing.JTable tblStoreRequests;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
