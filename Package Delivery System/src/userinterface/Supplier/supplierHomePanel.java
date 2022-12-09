/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Supplier;
import java.sql.*;
/**
 *
 * @author mahith
 */
public class supplierHomePanel extends javax.swing.JPanel {
    Connection connection;
    /**
     * Creates new form supplierHomePanel
     */
    public supplierHomePanel(Connection connection) {
        this.connection =connection;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        manageOrders = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        manageSupplyHistory = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageSupplyHistoryLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightSupplierPanel = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(227, 73, 78));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrders.setBackground(new java.awt.Color(227, 73, 78));
        manageOrders.setToolTipText("");
        manageOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");

        home.setBackground(new java.awt.Color(25, 56, 82));
        home.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrdersLayout = new javax.swing.GroupLayout(manageOrders);
        manageOrders.setLayout(manageOrdersLayout);
        manageOrdersLayout.setHorizontalGroup(
            manageOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageOrdersLayout.setVerticalGroup(
            manageOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGroup(manageOrdersLayout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(manageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageSupplyHistory.setBackground(new java.awt.Color(227, 73, 78));
        manageSupplyHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSupplyHistoryMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(215, 81, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageSupplyHistoryLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageSupplyHistoryLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageSupplyHistoryLabel.setText("Manage Supply History");
        manageSupplyHistoryLabel.setPreferredSize(new java.awt.Dimension(115, 16));
        manageSupplyHistoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSupplyHistoryLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageSupplyHistoryLayout = new javax.swing.GroupLayout(manageSupplyHistory);
        manageSupplyHistory.setLayout(manageSupplyHistoryLayout);
        manageSupplyHistoryLayout.setHorizontalGroup(
            manageSupplyHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSupplyHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageSupplyHistoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageSupplyHistoryLayout.setVerticalGroup(
            manageSupplyHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSupplyHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageSupplyHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(manageSupplyHistoryLayout.createSequentialGroup()
                        .addComponent(manageSupplyHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(manageSupplyHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, -1));

        jLabel1.setBackground(new java.awt.Color(215, 81, 81));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("      Supply Management");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 10));

        rightSupplierPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSupplierPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSupplierPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSupplierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSupplierPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed

    }//GEN-LAST:event_homeMousePressed

    private void manageOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageOrdersMousePressed

    private void manageSupplyHistoryLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplyHistoryLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSupplyHistoryLabelMousePressed

    private void manageSupplyHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplyHistoryMousePressed

    }//GEN-LAST:event_manageSupplyHistoryMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageOrders;
    private javax.swing.JPanel manageSupplyHistory;
    private javax.swing.JLabel manageSupplyHistoryLabel;
    private javax.swing.JPanel rightSupplierPanel;
    // End of variables declaration//GEN-END:variables
}
