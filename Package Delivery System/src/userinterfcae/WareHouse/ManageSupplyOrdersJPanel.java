/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterfcae.WareHouse;

import userinterface.StoreManager.*;

/**
 *
 * @author mohit
 */
public class ManageSupplyOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplyOrdersJPanel
     */
    public ManageSupplyOrdersJPanel() {
        initComponents();
        initialSetup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplyOrders = new javax.swing.JTable();
        lblSupplyOrders = new javax.swing.JLabel();
        btnAddOrder = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblOrderItems = new javax.swing.JLabel();
        txtOrderItems = new javax.swing.JTextField();
        lblOrderTotal = new javax.swing.JLabel();
        txtOrderTotal = new javax.swing.JTextField();
        btnFinalizeOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(25, 56, 82));

        tblSupplyOrders.setForeground(new java.awt.Color(255, 255, 255));
        tblSupplyOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Order Items", "Order Total"
            }
        ));
        jScrollPane1.setViewportView(tblSupplyOrders);

        lblSupplyOrders.setBackground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblSupplyOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setText("SUPPLY ORDERS");

        btnAddOrder.setText("Add Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        lblOrderItems.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderItems.setText("Order Items:");

        lblOrderTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderTotal.setText("Order Total:");

        txtOrderTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderTotalActionPerformed(evt);
            }
        });

        btnFinalizeOrder.setText("Finalize Order");
        btnFinalizeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblOrderItems)
                            .addGap(18, 18, 18)
                            .addComponent(txtOrderItems, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblOrderTotal)
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnFinalizeOrder)
                                .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddOrder)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewOrder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSupplyOrders)
                        .addGap(266, 266, 266)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblSupplyOrders)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddOrder)
                        .addComponent(btnViewOrder))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderItems)
                    .addComponent(txtOrderItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblOrderTotal))
                    .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizeOrder)
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
        addOrShowOrderDetails();
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        addOrShowOrderDetails();
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtOrderTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderTotalActionPerformed

    private void btnFinalizeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizeOrderActionPerformed
        // TODO add your handling code here:
        initialSetup();
    }//GEN-LAST:event_btnFinalizeOrderActionPerformed

    private void initialSetup(){
        lblOrderItems.setVisible(false);
        txtOrderItems.setVisible(false);
        
        lblOrderTotal.setVisible(false);
        txtOrderTotal.setVisible(false);
        
        btnFinalizeOrder.setVisible(false);
    }
    
    private void addOrShowOrderDetails(){
        lblOrderItems.setVisible(true);
        txtOrderItems.setVisible(true);
        
        lblOrderTotal.setVisible(true);
        txtOrderTotal.setVisible(true);
        
        btnFinalizeOrder.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnFinalizeOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderItems;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblSupplyOrders;
    private javax.swing.JTable tblSupplyOrders;
    private javax.swing.JTextField txtOrderItems;
    private javax.swing.JTextField txtOrderTotal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
