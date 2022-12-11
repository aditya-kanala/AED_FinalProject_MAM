/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.customer;

import java.awt.CardLayout;
import java.sql.*;
/**
 *
 * @author mahith
 */
public class CustomerHomePanel extends javax.swing.JPanel {
    Connection connection;
    /**
     * Creates new form CustomerHomePanel
     */
    public CustomerHomePanel(Connection connection) {
        this.connection= connection;
        initComponents();
        
        CustomerPanel panel = new CustomerPanel(connection);
        rightCustomerPanel.add("workArea", panel);
        CardLayout layout = (CardLayout) rightCustomerPanel.getLayout();
        layout.next(rightCustomerPanel);
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
        homeCustomerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        customerChatBoxLabel = new javax.swing.JLabel();
        customerProfile = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        customerProfileLabel = new javax.swing.JLabel();
        customerOrdersPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        customerOrdersLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        customerChatPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        customerChatBoxLabel1 = new javax.swing.JLabel();
        rightCustomerPanel = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(215, 81, 81));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeCustomerPanel.setBackground(new java.awt.Color(215, 81, 81));
        homeCustomerPanel.setToolTipText("");
        homeCustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeCustomerPanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home Page.png"))); // NOI18N
        jLabel2.setToolTipText("");

        customerChatBoxLabel.setBackground(new java.awt.Color(215, 81, 81));
        customerChatBoxLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        customerChatBoxLabel.setText("Home");

        javax.swing.GroupLayout homeCustomerPanelLayout = new javax.swing.GroupLayout(homeCustomerPanel);
        homeCustomerPanel.setLayout(homeCustomerPanelLayout);
        homeCustomerPanelLayout.setHorizontalGroup(
            homeCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerChatBoxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        homeCustomerPanelLayout.setVerticalGroup(
            homeCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerChatBoxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(homeCustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 50));

        customerProfile.setBackground(new java.awt.Color(215, 81, 81));
        customerProfile.setToolTipText("");
        customerProfile.setPreferredSize(new java.awt.Dimension(264, 48));
        customerProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerProfileMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(215, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User Male.png"))); // NOI18N

        customerProfileLabel.setBackground(new java.awt.Color(215, 81, 81));
        customerProfileLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        customerProfileLabel.setText("Profile");
        customerProfileLabel.setAutoscrolls(true);

        javax.swing.GroupLayout customerProfileLayout = new javax.swing.GroupLayout(customerProfile);
        customerProfile.setLayout(customerProfileLayout);
        customerProfileLayout.setHorizontalGroup(
            customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        customerProfileLayout.setVerticalGroup(
            customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerProfileLayout.createSequentialGroup()
                .addGroup(customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(customerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 40));

        customerOrdersPanel.setBackground(new java.awt.Color(215, 81, 81));
        customerOrdersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerOrdersPanelMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(215, 81, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Business.png"))); // NOI18N

        customerOrdersLabel.setBackground(new java.awt.Color(215, 81, 81));
        customerOrdersLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        customerOrdersLabel.setText("Manage Orders");
        customerOrdersLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout customerOrdersPanelLayout = new javax.swing.GroupLayout(customerOrdersPanel);
        customerOrdersPanel.setLayout(customerOrdersPanelLayout);
        customerOrdersPanelLayout.setHorizontalGroup(
            customerOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrdersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerOrdersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        customerOrdersPanelLayout.setVerticalGroup(
            customerOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrdersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerOrdersPanelLayout.createSequentialGroup()
                        .addComponent(customerOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.add(customerOrdersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, 10));

        jLabel1.setBackground(new java.awt.Color(215, 81, 81));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Customer Landing Page");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 10));

        customerChatPanel.setBackground(new java.awt.Color(215, 81, 81));
        customerChatPanel.setToolTipText("");
        customerChatPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerChatPanelMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(215, 81, 81));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Technical Support.png"))); // NOI18N
        jLabel3.setToolTipText("");

        customerChatBoxLabel1.setBackground(new java.awt.Color(215, 81, 81));
        customerChatBoxLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        customerChatBoxLabel1.setText("Customer Chat Box");

        javax.swing.GroupLayout customerChatPanelLayout = new javax.swing.GroupLayout(customerChatPanel);
        customerChatPanel.setLayout(customerChatPanelLayout);
        customerChatPanelLayout.setHorizontalGroup(
            customerChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerChatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerChatBoxLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        customerChatPanelLayout.setVerticalGroup(
            customerChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerChatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerChatBoxLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(customerChatPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        rightCustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightCustomerPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightCustomerPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeCustomerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeCustomerPanelMousePressed
        // TODO add your handling code here:
        CustomerPanel panel = new CustomerPanel(connection);
        rightCustomerPanel.add("workArea", panel);
        CardLayout layout = (CardLayout) rightCustomerPanel.getLayout();
        layout.next(rightCustomerPanel);
    }//GEN-LAST:event_homeCustomerPanelMousePressed

    private void customerProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerProfileMousePressed
        // TODO add your handling code here:
        customerProfilePanel customerProfile = new customerProfilePanel();
        rightCustomerPanel.add("Customer Profile",customerProfile );
        CardLayout layout = (CardLayout) rightCustomerPanel.getLayout();
        layout.next(rightCustomerPanel);
    }//GEN-LAST:event_customerProfileMousePressed

    private void customerOrdersPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerOrdersPanelMousePressed
        customerOrdersPanel orders = new customerOrdersPanel();
        rightCustomerPanel.add("Customer Profile",orders );
        CardLayout layout = (CardLayout) rightCustomerPanel.getLayout();
        layout.next(rightCustomerPanel);
    }//GEN-LAST:event_customerOrdersPanelMousePressed

    private void customerChatPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerChatPanelMousePressed
        // TODO add your handling code here:
        customerChatPanel chat = new customerChatPanel();
        rightCustomerPanel.add("Customer Profile",chat );
        CardLayout layout = (CardLayout) rightCustomerPanel.getLayout();
        layout.next(rightCustomerPanel);
    }//GEN-LAST:event_customerChatPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerChatBoxLabel;
    private javax.swing.JLabel customerChatBoxLabel1;
    private javax.swing.JPanel customerChatPanel;
    private javax.swing.JLabel customerOrdersLabel;
    private javax.swing.JPanel customerOrdersPanel;
    private javax.swing.JPanel customerProfile;
    private javax.swing.JLabel customerProfileLabel;
    private javax.swing.JPanel homeCustomerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel rightCustomerPanel;
    // End of variables declaration//GEN-END:variables

    
}
