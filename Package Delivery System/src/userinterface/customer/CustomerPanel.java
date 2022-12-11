/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.customer;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahith
 */
public class CustomerPanel extends javax.swing.JPanel {
    Connection connection;
    int countCart;
    /**
     * Creates new form CustomerPanel
     */
    public CustomerPanel(Connection connection) {
        initComponents();
        populateTable(connection);
         countCart =0;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchCatalog = new javax.swing.JTable();
        lblSupplyOrders = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblProductQuantity = new javax.swing.JLabel();
        addToCartBtn = new javax.swing.JButton();
        cartLabel = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        productQuantity = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(25, 56, 82));

        tblSearchCatalog.setBackground(new java.awt.Color(25, 56, 82));
        tblSearchCatalog.setForeground(new java.awt.Color(204, 204, 204));
        tblSearchCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Description"
            }
        ));
        tblSearchCatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchCatalogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearchCatalog);
        if (tblSearchCatalog.getColumnModel().getColumnCount() > 0) {
            tblSearchCatalog.getColumnModel().getColumn(0).setResizable(false);
        }

        lblSupplyOrders.setBackground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblSupplyOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setText("ORDER ITEM");

        txtSearch.setBackground(new java.awt.Color(25, 56, 82));
        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(25, 56, 82));
        btnSearch.setForeground(new java.awt.Color(204, 204, 204));
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblProductQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblProductQuantity.setText("Quantity");

        addToCartBtn.setBackground(new java.awt.Color(25, 56, 82));
        addToCartBtn.setForeground(new java.awt.Color(204, 204, 204));
        addToCartBtn.setText("Add to Cart");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        cartLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping Cart.png"))); // NOI18N
        cartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartLabelMousePressed(evt);
            }
        });

        count.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        count.setForeground(new java.awt.Color(204, 204, 204));
        count.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSupplyOrders)
                .addGap(376, 376, 376)
                .addComponent(cartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblProductQuantity)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(addToCartBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSupplyOrders)
                            .addComponent(cartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(count)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductQuantity)
                    .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addToCartBtn)
                .addContainerGap(247, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
        
//        Double orderTotal;
        int selectedRowIndex  = tblSearchCatalog.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Row to View");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblSearchCatalog.getModel();
        String selectedProduct = (String) model.getValueAt(selectedRowIndex,0);
        String selectedPrice = (String) model.getValueAt(selectedRowIndex,1);
        Double price = Double.valueOf(selectedPrice);
      
        countCart++;
        
        count.setText(Integer.toString(countCart));
        
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("insert into cart values(?,?,?)");
            preparedStatement.setString(1, selectedProduct);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, Integer.valueOf(productQuantity.getValue().toString()));
            preparedStatement.executeUpdate();
        
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void cartLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMousePressed
        // TODO add your handling code here:
        
        customerCart cart = new customerCart(connection,"","","", 0);
        this.getParent().add("customer Cart",cart);
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.next(this.getParent());
    }//GEN-LAST:event_cartLabelMousePressed

    private void tblSearchCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchCatalogMouseClicked
        // TODO add your handling code here:
        
        
        //use selectedprod to serach through db to get values and display it on the screen;
        
        
    }//GEN-LAST:event_tblSearchCatalogMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        String itemSearch = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblSearchCatalog.getModel();
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from store_items where upper(ItemName)=?");
            preparedStatement.setString(1, itemSearch.toUpperCase());
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[3];
            rows[0]= rs.getString(2);
            rows[1]=rs.getString(4);
            rows[2]=rs.getString(3);
            
            model.addRow(rows);
            }
        }
        catch(SQLException e){System.out.println(e);}
       
        
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JLabel count;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProductQuantity;
    private javax.swing.JLabel lblSupplyOrders;
    private javax.swing.JSpinner productQuantity;
    private javax.swing.JTable tblSearchCatalog;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void populateProducts(){
        DefaultTableModel model = (DefaultTableModel) tblSearchCatalog.getModel();
        model.setRowCount(0);
        
//        for(Product item: productList){
//            
//            Object[] Row =new Object[1];
//            Row[0] = item.getProductName();
//            Row[1] = item.getProductStore();
//            Row[2] = item.getProductPrice();
//            Row[3] = item.getProductAvailability();

//            model.addRow(Row);
//        }
    }
    
    public void populateTable(Connection connection){
        DefaultTableModel model = (DefaultTableModel) tblSearchCatalog.getModel();
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from store_items");
            
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[3];
            rows[0]= rs.getString(2);
            rows[1]=rs.getString(4);
            rows[2]=rs.getString(3);
            
            model.addRow(rows);
            }
        }
        catch(SQLException e){System.out.println(e);}
    }

}
