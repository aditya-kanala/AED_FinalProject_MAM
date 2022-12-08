/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.StoreManager;

import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author mohit
 */
public class ManageStoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoreJPanel
     */
    Connection connection;
    
    public ManageStoreJPanel(Connection connection) {
        initComponents();
        initialSetup();
        populateStoreItemsTable(connection);
        this.connection=connection;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStoreName = new javax.swing.JLabel();
        lblStoreLocation = new javax.swing.JLabel();
        lblStoreId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        lblManageStoreItems = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        lblItemName = new javax.swing.JLabel();
        lblItemId = new javax.swing.JLabel();
        lblItemDescription = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemId = new javax.swing.JTextField();
        txtItemDescription = new javax.swing.JTextField();
        btnFinalizeItem = new javax.swing.JButton();
        lblItemQuantity = new javax.swing.JLabel();
        sprItemQuantity = new javax.swing.JSpinner();
        btnViewItem = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(25, 56, 82));

        lblStoreName.setBackground(new java.awt.Color(255, 255, 255));
        lblStoreName.setForeground(new java.awt.Color(255, 255, 255));
        lblStoreName.setText("Store Name:");

        lblStoreLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblStoreLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblStoreLocation.setText("Store Location:");

        lblStoreId.setBackground(new java.awt.Color(255, 255, 255));
        lblStoreId.setForeground(new java.awt.Color(255, 255, 255));
        lblStoreId.setText("Store ID:");

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Description", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblItems);

        lblManageStoreItems.setBackground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblManageStoreItems.setForeground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setText("MANAGE STORE ITEMS");

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblItemName.setText("Item Name:");

        lblItemId.setForeground(new java.awt.Color(255, 255, 255));
        lblItemId.setText("Item ID:");

        lblItemDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblItemDescription.setText("Item Description:");

        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });

        btnFinalizeItem.setText("Finalize Item");
        btnFinalizeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizeItemActionPerformed(evt);
            }
        });

        lblItemQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblItemQuantity.setText("Item Quantity:");

        btnViewItem.setText("View Item");
        btnViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblManageStoreItems)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblItemName)
                                .addGap(16, 16, 16)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblItemId)
                                .addGap(16, 16, 16)
                                .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrice)
                                    .addComponent(lblItemDescription)
                                    .addComponent(lblItemQuantity))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFinalizeItem)
                                            .addComponent(sprItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(lblStoreName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStoreId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStoreLocation, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblStoreName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStoreId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStoreLocation)
                .addGap(12, 12, 12)
                .addComponent(lblManageStoreItems)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddItem)
                        .addComponent(btnViewItem))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblItemName))
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblItemId))
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblItemDescription))
                    .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemQuantity))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizeItem)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        addOrShowItemDetails();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void btnFinalizeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizeItemActionPerformed
        // TODO add your handling code here:
        initialSetup();
    }//GEN-LAST:event_btnFinalizeItemActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemActionPerformed
        // TODO add your handling code here:
        addOrShowItemDetails();
    }//GEN-LAST:event_btnViewItemActionPerformed

    private void initialSetup(){
        lblItemName.setVisible(false);
        txtItemName.setVisible(false);
        
        lblItemId.setVisible(false);
        txtItemId.setVisible(false);
        
        lblItemDescription.setVisible(false);
        txtItemDescription.setVisible(false);
        
        lblPrice.setVisible(false);
        txtPrice.setVisible(false);
        
        lblItemQuantity.setVisible(false);
        sprItemQuantity.setVisible(false);
        
        btnFinalizeItem.setVisible(false);
    }
    
    private void addOrShowItemDetails(){
        lblItemName.setVisible(true);
        txtItemName.setVisible(true);
        
        lblItemId.setVisible(true);
        txtItemId.setVisible(true);
        
        lblItemDescription.setVisible(true);
        txtItemDescription.setVisible(true);
        
        lblPrice.setVisible(true);
        txtPrice.setVisible(true);
        
        lblItemQuantity.setVisible(true);
        sprItemQuantity.setVisible(true);
        
        btnFinalizeItem.setVisible(true);
    }

    public void populateStoreItemsTable(Connection connection){
        DefaultTableModel model = (DefaultTableModel) tblItems.getModel();
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from store_items");
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[5];
            rows[0]= rs.getString(1);
            rows[1]=rs.getString(2);
            rows[2]=rs.getString(3);
            rows[3]=rs.getString(4);
            rows[4] =rs.getString(5);
            
            model.addRow(rows);
            }
        }
        catch(SQLException e){System.out.println(e);}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnFinalizeItem;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemDescription;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemQuantity;
    private javax.swing.JLabel lblManageStoreItems;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStoreId;
    private javax.swing.JLabel lblStoreLocation;
    private javax.swing.JLabel lblStoreName;
    private javax.swing.JSpinner sprItemQuantity;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
