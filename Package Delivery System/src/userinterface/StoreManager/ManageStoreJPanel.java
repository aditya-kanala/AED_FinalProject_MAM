/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.StoreManager;

import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author mohit
 */
public class ManageStoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoreJPanel
     */
    String itemName;
    String itemId;
    String itemDescription;
    Double itemPrice;
    int itemQuantity;
    
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
        lblManageStoreItems = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        btnViewItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtItemName = new javax.swing.JTextField();
        txtItemDescription = new javax.swing.JTextField();
        btnFinalizeItem = new javax.swing.JButton();
        lblItemQuantity = new javax.swing.JLabel();
        sprItemQuantity = new javax.swing.JSpinner();
        lblItemName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblItemDescription = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblItemId = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnViewAll = new javax.swing.JButton();

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

        lblManageStoreItems.setBackground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblManageStoreItems.setForeground(new java.awt.Color(255, 255, 255));
        lblManageStoreItems.setText("MANAGE STORE ITEMS");

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Description", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblItems);

        btnViewItem.setText("View Item");
        btnViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemActionPerformed(evt);
            }
        });

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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

        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblItemName.setText("Item Name:");

        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price:");

        lblItemDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblItemDescription.setText("Item Description:");

        lblItemId.setForeground(new java.awt.Color(255, 255, 255));
        lblItemId.setText("Item ID:");

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStoreName)
                                    .addComponent(lblStoreId)
                                    .addComponent(lblStoreLocation))
                                .addGap(648, 648, 648))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddItem)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnViewItem)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnViewAll)
                                    .addGap(242, 242, 242)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearch)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblItemId)
                                .addGap(18, 18, 18)
                                .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(lblItemName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPrice)
                                        .addComponent(lblItemDescription)
                                        .addComponent(lblItemQuantity))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFinalizeItem)
                                        .addComponent(sprItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblManageStoreItems)
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStoreName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStoreId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStoreLocation)
                .addGap(24, 24, 24)
                .addComponent(lblManageStoreItems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnViewItem)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnViewAll))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblItemId))
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblItemName))
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemActionPerformed
        // TODO add your handling code here:
//        showItemDetails();
    }//GEN-LAST:event_btnViewItemActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        addItem();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnFinalizeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizeItemActionPerformed
        // TODO add your handling code here:
        try{
            if(addItemValidations()){
                PreparedStatement preparedStatement =connection.prepareStatement("insert into store_items values(?,?,?,?,?)");
                preparedStatement.setString(1,generateUniqueId());
                preparedStatement.setString(2,txtItemName.getText());
                preparedStatement.setString(3, txtItemDescription.getText());
                preparedStatement.setDouble(4, Double.parseDouble(txtPrice.getText()));
                preparedStatement.setInt(5,Integer.parseInt(sprItemQuantity.getValue().toString()));

                preparedStatement.executeUpdate();
                System.out.println("Warehouse Order inserted Successfully");

                populateStoreItemsTable(connection);
                initialSetup();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter all values and try again");
        }

    }//GEN-LAST:event_btnFinalizeItemActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchTerm = txtSearch.getText();
        DefaultTableModel model = (DefaultTableModel) tblItems.getModel();
        model.setRowCount(0);
        try{
                PreparedStatement preparedStatement =connection.prepareStatement("select * from store_items where ItemName = ?");
                preparedStatement.setString(1,searchTerm);
                ResultSet rs = preparedStatement.executeQuery(); 
                while(rs.next()){
                Object[] rows = new Object[5];
                rows[0]= rs.getString(1);
                rows[1]=rs.getString(2);
                rows[2]=rs.getString(3);
                rows[3]=rs.getString(4);
                rows[4] =rs.getString(5);

                model.addRow(rows);
                
                initialSetup();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot find item");
            populateStoreItemsTable(connection);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        populateStoreItemsTable(connection);
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void initialSetup(){
        lblItemId.setVisible(false);
        txtItemId.setVisible(false);
        
        lblItemName.setVisible(false);
        txtItemName.setVisible(false);
        
        lblItemDescription.setVisible(false);
        txtItemDescription.setVisible(false);
        
        lblPrice.setVisible(false);
        txtPrice.setVisible(false);
        
        lblItemQuantity.setVisible(false);
        sprItemQuantity.setVisible(false);
        
        btnFinalizeItem.setVisible(false);
        btnViewItem.setVisible(false);
    }
    
    private void addItem(){
        lblItemName.setVisible(true);
        txtItemName.setVisible(true);
        
        lblItemDescription.setVisible(true);
        txtItemDescription.setVisible(true);
        
        lblPrice.setVisible(true);
        txtPrice.setVisible(true);
        
        lblItemQuantity.setVisible(true);
        sprItemQuantity.setVisible(true);
        
        btnFinalizeItem.setVisible(true);
    }
    
    private void showItemDetails(){
        int selectedRowIndex = tblItems.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select an item to view its details");
            return;
        }
        
        lblItemId.setVisible(true);
        txtItemId.setVisible(true);
        
        lblItemName.setVisible(true);
        txtItemName.setVisible(true);
        
        lblItemDescription.setVisible(true);
        txtItemDescription.setVisible(true);
        
        lblPrice.setVisible(true);
        txtPrice.setVisible(true);
        
        lblItemQuantity.setVisible(true);
        sprItemQuantity.setVisible(true);
        
        DefaultTableModel model = (DefaultTableModel) tblItems.getModel();
        String productId = (String) model.getValueAt(selectedRowIndex, 0);
        String productName = (String) model.getValueAt(selectedRowIndex, 1);
        String productDescription = (String) model.getValueAt(selectedRowIndex, 2);
//        Double productPrice = (Double) model.getValueAt(selectedRowIndex, 3);
//        int productQuantity = (int) model.getValueAt(selectedRowIndex, 4);


        
            txtItemId.setText(productId);
            txtItemName.setText(productName);
            txtItemDescription.setText(productDescription);
//            txtPrice.setText(String.valueOf(productPrice));
//            sprItemQuantity.setSelection(productQuantity);
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
    
    private Boolean addItemValidations(){
        itemName = txtItemName.getText();
        itemDescription = txtItemDescription.getText();
        itemPrice = Double.parseDouble(txtPrice.getText());
        itemQuantity = Integer.parseInt(sprItemQuantity.getValue().toString());
        
        ArrayList message = null;
            message = new ArrayList(0);
            if(itemName.isBlank() || !(itemName.matches("^[ a-zA-Z1-9]*$"))){
                message.add("Item name cannot be blank, contain digits or special characters. Please enter a valid item and try again");
            }
            if(itemDescription.isBlank() || !(itemDescription.matches("^[ a-zA-Z1-9]*$"))){
                message.add("Item description cannot be blank, contain digits or special characters. Please enter a valid description and try again");
            }
            if(itemPrice < 0.0 || itemPrice > 1000000000.0){
                message.add("Please enter a valid price and try again");
            }
            if(itemPrice < 0.0 || itemPrice > 1000000000.0){
                message.add("Please enter a valid quantity and try again");
            }
            if(!(message.isEmpty())){
            JOptionPane.showMessageDialog(this, message.toArray());
            message.clear();
            return false;
            }
            else{
                return true;
            }
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
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnFinalizeItem;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewAll;
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
