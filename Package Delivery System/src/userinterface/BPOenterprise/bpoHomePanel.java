/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.BPOenterprise;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohit
 */
public class bpoHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form bpoHomePanel
     */
    Connection connection;
    public bpoHomePanel(Connection connection) {
        initComponents();
        this.connection = connection;
        populateCsrTable(connection);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageStoreItems = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCsrAgents = new javax.swing.JTable();

        setBackground(new java.awt.Color(25, 56, 82));

        lblManageStoreItems.setBackground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblManageStoreItems.setForeground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setText("CSR AGENTS");

        tblCsrAgents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CSR ID", "CSR Name", "CSR Email"
            }
        ));
        jScrollPane1.setViewportView(tblCsrAgents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(lblManageStoreItems)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblManageStoreItems)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateCsrTable(Connection connection){
        DefaultTableModel model = (DefaultTableModel) tblCsrAgents.getModel();
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from csr");
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[3];
            rows[0]= rs.getString(1);
            rows[1]=rs.getString(2);
            rows[2]=rs.getString(3);
            
            model.addRow(rows);
            }
        }
        catch(SQLException e){System.out.println(e);}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageStoreItems;
    private javax.swing.JTable tblCsrAgents;
    // End of variables declaration//GEN-END:variables
}
