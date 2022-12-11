/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.customer;

import java.awt.CardLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userinterface.Maps.mapsPanel;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author mahith
 */
public class customerCart extends javax.swing.JPanel {
    Connection connection;
    String products = "";
    String longi;
    String lati;
    String loci;
    int zoom;
    String quantity;
    String selectedProduct;
    /**
     * Creates new form customerCart
     */
    public customerCart(Connection connection,String longi, String lati,String loci,int zoom) {
        this.connection =connection;
        this.loci = loci;
        this.longi = longi;
        this.lati = lati;
        this.zoom = zoom;
        initComponents();
        if(!loci.isBlank()){
            lblLocation.setText(loci);
        }
        
        
        populateCartTable(connection);
        
        
        try{
        
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select sum(price) from cart");
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
            {System.out.println(rs.getDouble(1));
            txtCartValue.setText(Double.toString(rs.getDouble(1)));}
        }catch(Exception e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplyOrders = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        setLocationLabel = new javax.swing.JLabel();
        selectLocationBtn = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        totalCartlbl = new javax.swing.JLabel();
        txtCartValue = new javax.swing.JTextField();
        placeOrderBtn = new javax.swing.JButton();
        lblLocation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 56, 82));

        lblSupplyOrders.setBackground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblSupplyOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplyOrders.setText("CART");

        tblCart.setBackground(new java.awt.Color(25, 56, 82));
        tblCart.setForeground(new java.awt.Color(204, 204, 204));
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Quantity"
            }
        ));
        tblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCart);

        setLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
        setLocationLabel.setText("Set Location");

        selectLocationBtn.setBackground(new java.awt.Color(25, 56, 82));
        selectLocationBtn.setForeground(new java.awt.Color(204, 204, 204));
        selectLocationBtn.setText("Open Maps");
        selectLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectLocationBtnActionPerformed(evt);
            }
        });

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        txtAddress.setBackground(new java.awt.Color(25, 56, 82));
        txtAddress.setColumns(20);
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        totalCartlbl.setForeground(new java.awt.Color(255, 255, 255));
        totalCartlbl.setText("Total Cart value");

        txtCartValue.setForeground(new java.awt.Color(204, 204, 204));
        txtCartValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartValueActionPerformed(evt);
            }
        });

        placeOrderBtn.setBackground(new java.awt.Color(25, 56, 82));
        placeOrderBtn.setForeground(new java.awt.Color(204, 204, 204));
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        lblLocation.setBackground(new java.awt.Color(25, 56, 82));
        lblLocation.setForeground(new java.awt.Color(204, 204, 204));
        lblLocation.setText("Select Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(lblSupplyOrders))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCartlbl)
                            .addComponent(setLocationLabel)
                            .addComponent(lblAddress))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeOrderBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCartValue)
                                .addComponent(selectLocationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSupplyOrders)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCartlbl)
                    .addComponent(txtCartValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setLocationLabel)
                    .addComponent(selectLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLocation)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(placeOrderBtn)
                .addGap(309, 309, 309))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectLocationBtnActionPerformed
        // TODO add your handling code here:
        mapsPanel setAddress = new mapsPanel(connection);
        this.getParent().add("Set Address",setAddress);
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.next(this.getParent());
        
        
    }//GEN-LAST:event_selectLocationBtnActionPerformed

    private void txtCartValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartValueActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        
        if(longi.isEmpty() || loci.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select location from maps");
        }
        
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("insert into user_orders values(?,?,?,?,?,?,?,?,?) ");
            preparedStatement.setString(1, generateUniqueId());
            preparedStatement.setString(2, LocalDate.now().toString());
            preparedStatement.setString(3, products);
            preparedStatement.setString(4, txtCartValue.getText());
            preparedStatement.setString(5, txtAddress.getText());
            preparedStatement.setString(6, loci);
            preparedStatement.setString(7, longi);
            preparedStatement.setString(8, lati);
            preparedStatement.setString(9, String.valueOf(zoom));
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Order Placed");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("truncate cart");
            preparedStatement.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
         
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void tblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartMouseClicked
        // TODO add your handling code here:
        
        int selectedRowIndex  = tblCart.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Row to View");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
         quantity = (String) model.getValueAt(selectedRowIndex,2);
                  selectedProduct = (String) model.getValueAt(selectedRowIndex,0);

        
        
    }//GEN-LAST:event_tblCartMouseClicked

    
    
    public String generateUniqueId(){
        Random random = new Random();
        String res = "";
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<6;i++){
            res += arr[random.nextInt(arr.length)];
        }
        return res;
    }

    public void populateCartTable(Connection connection){
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        
        model.setRowCount(0);
        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from cart");
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
            Object[] rows = new Object[3];
            rows[0]= rs.getString(1);
            rows[1]=rs.getString(2);
            rows[2]=rs.getString(3);
            model.addRow(rows);
            
             products += rows[0]+" ,";
             System.out.println(products);
            
            
            }
        }
        catch(SQLException e){System.out.println(e);}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblSupplyOrders;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JButton selectLocationBtn;
    private javax.swing.JLabel setLocationLabel;
    private javax.swing.JTable tblCart;
    private javax.swing.JLabel totalCartlbl;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCartValue;
    // End of variables declaration//GEN-END:variables
}
