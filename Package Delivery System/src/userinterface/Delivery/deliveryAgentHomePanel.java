/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Delivery;
import java.awt.CardLayout;
import java.sql.*;
import userinterface.StoreManager.ViewStoreGraphsJPanel;
/**
 *
 * @author mahith
 */
public class deliveryAgentHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form deliveryAgentHomePanel
     */
    Connection connection;
    public deliveryAgentHomePanel(Connection connection) {
        initComponents();
        this.connection=connection;
         deliveryAgentHome deliveryAgent = new deliveryAgentHome(connection);
        rightSystemAdminPanel.add("deliveryAgent",deliveryAgent);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
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
        manageStorePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageStoreLabel = new javax.swing.JLabel();
        manageUserOrdersPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageUserOrdersLabel = new javax.swing.JLabel();
        manageSupplyOrdersPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageSupplyOrdersLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(227, 73, 78));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageStorePanel.setBackground(new java.awt.Color(227, 73, 78));
        manageStorePanel.setToolTipText("");
        manageStorePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageStorePanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");

        manageStoreLabel.setBackground(new java.awt.Color(25, 56, 82));
        manageStoreLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageStoreLabel.setText("Manage Orders");
        manageStoreLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageStoreLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageStorePanelLayout = new javax.swing.GroupLayout(manageStorePanel);
        manageStorePanel.setLayout(manageStorePanelLayout);
        manageStorePanelLayout.setHorizontalGroup(
            manageStorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageStoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageStorePanelLayout.setVerticalGroup(
            manageStorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageStorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageStoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageStorePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageUserOrdersPanel.setBackground(new java.awt.Color(227, 73, 78));
        manageUserOrdersPanel.setToolTipText("");
        manageUserOrdersPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageUserOrdersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserOrdersPanelMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageUserOrdersLabel.setBackground(new java.awt.Color(25, 56, 82));
        manageUserOrdersLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageUserOrdersLabel.setText("Manage User Orders");
        manageUserOrdersLabel.setAutoscrolls(true);
        manageUserOrdersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserOrdersLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageUserOrdersPanelLayout = new javax.swing.GroupLayout(manageUserOrdersPanel);
        manageUserOrdersPanel.setLayout(manageUserOrdersPanelLayout);
        manageUserOrdersPanelLayout.setHorizontalGroup(
            manageUserOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserOrdersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageUserOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageUserOrdersPanelLayout.setVerticalGroup(
            manageUserOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageUserOrdersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageUserOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(manageUserOrdersPanelLayout.createSequentialGroup()
                        .addComponent(manageUserOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.add(manageUserOrdersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        manageSupplyOrdersPanel.setBackground(new java.awt.Color(227, 73, 78));
        manageSupplyOrdersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSupplyOrdersPanelMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(215, 81, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageSupplyOrdersLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageSupplyOrdersLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageSupplyOrdersLabel.setText("Manage Supply Orders");
        manageSupplyOrdersLabel.setPreferredSize(new java.awt.Dimension(115, 16));
        manageSupplyOrdersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSupplyOrdersLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageSupplyOrdersPanelLayout = new javax.swing.GroupLayout(manageSupplyOrdersPanel);
        manageSupplyOrdersPanel.setLayout(manageSupplyOrdersPanelLayout);
        manageSupplyOrdersPanelLayout.setHorizontalGroup(
            manageSupplyOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSupplyOrdersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageSupplyOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageSupplyOrdersPanelLayout.setVerticalGroup(
            manageSupplyOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSupplyOrdersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageSupplyOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(manageSupplyOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageSupplyOrdersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, -1));

        jLabel1.setBackground(new java.awt.Color(215, 81, 81));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Delivery Unit");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 10));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageStoreLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStoreLabelMousePressed
        
    }//GEN-LAST:event_manageStoreLabelMousePressed

    private void manageStorePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStorePanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_manageStorePanelMousePressed

    private void manageUserOrdersLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserOrdersLabelMousePressed
        
    }//GEN-LAST:event_manageUserOrdersLabelMousePressed

    private void manageUserOrdersPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserOrdersPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_manageUserOrdersPanelMousePressed

    private void manageSupplyOrdersLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplyOrdersLabelMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageSupplyOrdersLabelMousePressed

    private void manageSupplyOrdersPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplyOrdersPanelMousePressed

    }//GEN-LAST:event_manageSupplyOrdersPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel manageStoreLabel;
    private javax.swing.JPanel manageStorePanel;
    private javax.swing.JLabel manageSupplyOrdersLabel;
    private javax.swing.JPanel manageSupplyOrdersPanel;
    private javax.swing.JLabel manageUserOrdersLabel;
    private javax.swing.JPanel manageUserOrdersPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
