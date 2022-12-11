/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.UserAccount;
import Model.OrganizationsDirectory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class OrganizationsSignUp extends javax.swing.JPanel {

    /**
     * Creates new form Store_WarehouseSignUp
     */
    Connection connection;
    OrganizationsDirectory orgDir;
    public OrganizationsSignUp(Connection connection, OrganizationsDirectory orgDir) {
        initComponents();
        this.connection=connection;
        this.orgDir=orgDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpanel = new javax.swing.JTabbedPane();
        Store = new javax.swing.JPanel();
        lblHeading2 = new javax.swing.JLabel();
        lblStoreID2 = new javax.swing.JLabel();
        lblStoreName2 = new javax.swing.JLabel();
        lblStoreLocation2 = new javax.swing.JLabel();
        txtStoreID = new javax.swing.JTextField();
        txtStoreName = new javax.swing.JTextField();
        txtStoreLocation = new javax.swing.JTextField();
        btnCreateStore = new javax.swing.JButton();
        Warehouse = new javax.swing.JPanel();
        lblWarehouseID = new javax.swing.JLabel();
        lblWarehouseName = new javax.swing.JLabel();
        lblWarehouseLocation = new javax.swing.JLabel();
        txtWarehouseID = new javax.swing.JTextField();
        txtWarehouseName = new javax.swing.JTextField();
        txtWarehouseLocation = new javax.swing.JTextField();
        btnCreateWarehouse = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        lblWarehouseType = new javax.swing.JLabel();
        txtWarehouseType = new javax.swing.JTextField();
        Farms = new javax.swing.JPanel();
        lblFHeading = new javax.swing.JLabel();
        lblFarmName = new javax.swing.JLabel();
        lblFarmOwner = new javax.swing.JLabel();
        lblFarmProduce = new javax.swing.JLabel();
        lblFarmLocation = new javax.swing.JLabel();
        txtFarmname = new javax.swing.JTextField();
        txtFarmOwner = new javax.swing.JTextField();
        txtFarmProduce = new javax.swing.JTextField();
        btnFarm = new javax.swing.JButton();
        txtFarmLocation = new javax.swing.JTextField();
        Supplier = new javax.swing.JPanel();
        lblSHeading = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();
        lblSupplierEmail = new javax.swing.JLabel();
        lblSuppplierMobile = new javax.swing.JLabel();
        lblSupplierLocation = new javax.swing.JLabel();
        lblSupplierUserName = new javax.swing.JLabel();
        lblSupplierPassword = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierMobile = new javax.swing.JTextField();
        txtSupplierLocation = new javax.swing.JTextField();
        txtSupplierUserName = new javax.swing.JTextField();
        btnCreateSupplier = new javax.swing.JToggleButton();
        pwdSupplier = new javax.swing.JPasswordField();
        txtSupplierEmail = new javax.swing.JTextField();

        lblHeading2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHeading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading2.setText("Register a Store");

        lblStoreID2.setText("Store ID :");

        lblStoreName2.setText("Store Name :");

        lblStoreLocation2.setText("Store Location :");

        btnCreateStore.setText("Create Store");
        btnCreateStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StoreLayout = new javax.swing.GroupLayout(Store);
        Store.setLayout(StoreLayout);
        StoreLayout.setHorizontalGroup(
            StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreLayout.createSequentialGroup()
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StoreLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StoreLayout.createSequentialGroup()
                                .addComponent(lblStoreLocation2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StoreLayout.createSequentialGroup()
                                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStoreID2)
                                    .addComponent(lblStoreName2))
                                .addGap(25, 25, 25)))
                        .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStoreID)
                            .addGroup(StoreLayout.createSequentialGroup()
                                .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtStoreLocation)))
                    .addGroup(StoreLayout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(btnCreateStore, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StoreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeading2)
                .addGap(374, 374, 374))
        );
        StoreLayout.setVerticalGroup(
            StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblHeading2)
                .addGap(116, 116, 116)
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStoreID2)
                    .addComponent(txtStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStoreName2)
                    .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStoreLocation2)
                    .addComponent(txtStoreLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(btnCreateStore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        tpanel.addTab("Store", Store);

        lblWarehouseID.setText("Warehouse ID :");

        lblWarehouseName.setText("Warehouse Name :");

        lblWarehouseLocation.setText("Warehouse Location :");

        btnCreateWarehouse.setText("Create Warehouse");
        btnCreateWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateWarehouseActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Register a Warehouse");

        lblWarehouseType.setText("Warehouse Type :");

        javax.swing.GroupLayout WarehouseLayout = new javax.swing.GroupLayout(Warehouse);
        Warehouse.setLayout(WarehouseLayout);
        WarehouseLayout.setHorizontalGroup(
            WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WarehouseLayout.createSequentialGroup()
                .addGap(0, 355, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(291, 291, 291))
            .addGroup(WarehouseLayout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWarehouseID)
                    .addComponent(lblWarehouseName)
                    .addComponent(lblWarehouseLocation)
                    .addComponent(lblWarehouseType))
                .addGap(28, 28, 28)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWarehouseID, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txtWarehouseName)
                    .addComponent(txtWarehouseType)
                    .addComponent(txtWarehouseLocation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WarehouseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateWarehouse)
                .addGap(458, 458, 458))
        );
        WarehouseLayout.setVerticalGroup(
            WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarehouseLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblHeading)
                .addGap(87, 87, 87)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseID)
                    .addComponent(txtWarehouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseName)
                    .addComponent(txtWarehouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseType)
                    .addComponent(txtWarehouseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(WarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseLocation)
                    .addComponent(txtWarehouseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnCreateWarehouse)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        tpanel.addTab("Warehouse", Warehouse);

        lblFHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblFHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFHeading.setText("Register a Farm");

        lblFarmName.setText("Farm Name :");

        lblFarmOwner.setText("Farm Owner :");

        lblFarmProduce.setText("Farm Produce :");

        lblFarmLocation.setText("Farm Location :");

        btnFarm.setText("Register Farm");
        btnFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FarmsLayout = new javax.swing.GroupLayout(Farms);
        Farms.setLayout(FarmsLayout);
        FarmsLayout.setHorizontalGroup(
            FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FarmsLayout.createSequentialGroup()
                .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FarmsLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFarmName)
                            .addComponent(lblFarmOwner)
                            .addComponent(lblFarmProduce)
                            .addComponent(lblFarmLocation))
                        .addGap(28, 28, 28)
                        .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFarmname, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(txtFarmOwner)
                                .addComponent(txtFarmProduce))
                            .addComponent(txtFarmLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FarmsLayout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(btnFarm)))
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FarmsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFHeading)
                .addGap(393, 393, 393))
        );
        FarmsLayout.setVerticalGroup(
            FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FarmsLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblFHeading)
                .addGap(85, 85, 85)
                .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarmName)
                    .addComponent(txtFarmname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarmOwner)
                    .addComponent(txtFarmOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarmProduce)
                    .addComponent(txtFarmProduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(FarmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarmLocation)
                    .addComponent(txtFarmLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btnFarm)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        tpanel.addTab("Farms", Farms);

        lblSHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblSHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSHeading.setText("Create a Supplier");

        lblSupplierName.setText("Supplier Name :");

        lblSupplierEmail.setText("Email :");

        lblSuppplierMobile.setText("Mobile :");

        lblSupplierLocation.setText("Supplier Location :");

        lblSupplierUserName.setText("User Name :");

        lblSupplierPassword.setText("Password :");

        btnCreateSupplier.setText("Create Supplier");
        btnCreateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SupplierLayout = new javax.swing.GroupLayout(Supplier);
        Supplier.setLayout(SupplierLayout);
        SupplierLayout.setHorizontalGroup(
            SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplierLayout.createSequentialGroup()
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SupplierLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSHeading)
                            .addGroup(SupplierLayout.createSequentialGroup()
                                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSupplierPassword)
                                    .addComponent(lblSupplierUserName)
                                    .addComponent(lblSupplierLocation)
                                    .addComponent(lblSuppplierMobile)
                                    .addComponent(lblSupplierEmail)
                                    .addComponent(lblSupplierName))
                                .addGap(13, 13, 13)
                                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(txtSupplierEmail)
                                    .addComponent(txtSupplierMobile)
                                    .addComponent(txtSupplierLocation)
                                    .addComponent(txtSupplierUserName)
                                    .addComponent(pwdSupplier)))))
                    .addGroup(SupplierLayout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(btnCreateSupplier)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        SupplierLayout.setVerticalGroup(
            SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplierLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblSHeading)
                .addGap(88, 88, 88)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierEmail)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuppplierMobile)
                    .addComponent(txtSupplierMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierLocation)
                    .addComponent(txtSupplierLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierUserName)
                    .addComponent(txtSupplierUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierPassword)
                    .addComponent(pwdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnCreateSupplier)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        tpanel.addTab("Supplier", Supplier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanel)
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean StoreValidation(){
            ArrayList msg=null;
    msg= new ArrayList();
    
        if(txtStoreID.getText().isBlank()|| !(txtStoreID.getText().matches("^[0-9a-zA-Z ]*$")))
        {msg.add("Please enter the Store ID without special characters and do not leave it blank");}
        if(txtStoreName.getText().isBlank()|| !(txtStoreName.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the name without digits or special characters and do not leave it blank");}
        
        
        if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }
    private void btnCreateStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStoreActionPerformed
        // TODO add your handling code here:
        String id=txtStoreID.getText();
        String name=txtStoreName.getText();
        String location=txtStoreLocation.getText();
        Double longitude = 55.46;
        Double latitude =-85.23;

        if(StoreValidation()){
        if(orgDir.addStore(id, name, location, longitude, latitude))
             JOptionPane.showMessageDialog(this, "Warehouse Successfully Created..!!");
        else 
             JOptionPane.showMessageDialog(this, "Warehouse not Created..!!");
        }
        //else{JOptionPane.showMessageDialog(this, "Enter Valid Details!!");}

    }//GEN-LAST:event_btnCreateStoreActionPerformed

     public boolean WarehouseValidation(){
            ArrayList msg=null;
            msg= new ArrayList();
    
        if(txtWarehouseID.getText().isBlank()|| !(txtWarehouseID.getText().matches("^[0-9a-zA-Z ]*$")))
        {msg.add("Please enter the Store ID without special characters and do not leave it blank");}
        if(txtWarehouseName.getText().isBlank()|| !(txtWarehouseName.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the name without digits or special characters and do not leave it blank");}
        if(txtWarehouseType.getText().isBlank()|| !(txtWarehouseType.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the Warehouse Type without digits or special characters and do not leave it blank");}
        
        if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }
    private void btnCreateWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateWarehouseActionPerformed
        // TODO add your handling code here:
        String id=txtWarehouseID.getText();
        String name=txtWarehouseName.getText();
        String location=txtWarehouseLocation.getText();
        String type = txtWarehouseType.getText();
        Double longitude = 55.46;
        Double latitude =-85.23;
        
       if(WarehouseValidation()){
        if(orgDir.addWarehouse(id, name, type, location, longitude, latitude))
         JOptionPane.showMessageDialog(this, "Warehouse Successfully Created..!!");
        else 
         JOptionPane.showMessageDialog(this, "Warehouse not Created..!!");
       }
          // else{JOptionPane.showMessageDialog(this, "Enter Valid Details!!");}

    }//GEN-LAST:event_btnCreateWarehouseActionPerformed

    public boolean farmValidation(){
            ArrayList msg=null;
            msg= new ArrayList();
    
        if(txtFarmname.getText().isBlank()|| !(txtFarmname.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the Farm Name without digits or special characters and do not leave it blank");}
        if(txtFarmOwner.getText().isBlank()|| !(txtFarmOwner.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the Owner Name without digits or special characters and do not leave it blank");} 
        if(txtFarmProduce.getText().isBlank()|| !(txtFarmProduce.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the Produce without digits or special characters and do not leave it blank");}
        
        
        
        if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }
    
    private void btnFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmActionPerformed
        // TODO add your handling code here:
        String name = txtFarmname.getText();
        String owner = txtFarmOwner.getText();
        String produce= txtFarmProduce.getText();
        String location = txtFarmLocation.getText();
        Double longitude = 55.46;
        Double latitude =-85.23;

       if(farmValidation()){ 
        if(orgDir.addFarm(name, owner, produce, location, longitude, latitude))
         JOptionPane.showMessageDialog(this, "Farm Successfully Created..!!");
        else
           JOptionPane.showMessageDialog(this, "Farm Not Created..!!");
       }
        //else{JOptionPane.showMessageDialog(this, "Enter Valid Details!!");}
 
    }//GEN-LAST:event_btnFarmActionPerformed

    public boolean supplierValidation(){
        ArrayList msg=null;
    msg= new ArrayList();
    
     if(txtSupplierName.getText().isBlank()|| !(txtSupplierName.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the name without digits or special characters but do not leave it blank");}
     if(txtSupplierEmail.getText().isBlank()||!(txtSupplierEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")))
        msg.add(("Please enter the correct email (xxx@xx.xx)"));
     if(!(String.valueOf(txtSupplierMobile.getText()).matches("^[0-9]{10}$")))
       {msg.add("Please enter the 10 digit mobile number");}
     if(txtSupplierUserName.getText().isBlank()|| !(txtSupplierUserName.getText().matches("^[0-9a-zA-Z@._]*$")))
        {msg.add("Please enter the User name but do not leave it blank. Use only digts,lower & upper alphabets,special characters(@,.,_)");}
     if(pwdSupplier.getText().isBlank())
        msg.add("Password field is empty");
  
        if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }
    private void btnCreateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSupplierActionPerformed
        // TODO add your handling code here:
   
        String name =txtSupplierName.getText();
        String email =txtSupplierEmail.getText();
        String mobile =String.valueOf(txtSupplierMobile.getText());
        String location =txtSupplierLocation.getText();
        String username=txtSupplierUserName.getText();
        String password =   pwdSupplier.getText(); 
       
        if(supplierValidation()){
        if(orgDir.addSupplier(name, email, mobile, location, username, password))
        JOptionPane.showMessageDialog(this, "Supplier Successfully Created..!!");
        else
         JOptionPane.showMessageDialog(this, "Supplier Not Created..!!");
        }
        //else{JOptionPane.showMessageDialog(this, "Enter Valid Details!!");}


    }//GEN-LAST:event_btnCreateSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Farms;
    private javax.swing.JPanel Store;
    private javax.swing.JPanel Supplier;
    private javax.swing.JPanel Warehouse;
    private javax.swing.JButton btnCreateStore;
    private javax.swing.JToggleButton btnCreateSupplier;
    private javax.swing.JButton btnCreateWarehouse;
    private javax.swing.JButton btnFarm;
    private javax.swing.JLabel lblFHeading;
    private javax.swing.JLabel lblFarmLocation;
    private javax.swing.JLabel lblFarmName;
    private javax.swing.JLabel lblFarmOwner;
    private javax.swing.JLabel lblFarmProduce;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHeading2;
    private javax.swing.JLabel lblSHeading;
    private javax.swing.JLabel lblStoreID2;
    private javax.swing.JLabel lblStoreLocation2;
    private javax.swing.JLabel lblStoreName2;
    private javax.swing.JLabel lblSupplierEmail;
    private javax.swing.JLabel lblSupplierLocation;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblSupplierPassword;
    private javax.swing.JLabel lblSupplierUserName;
    private javax.swing.JLabel lblSuppplierMobile;
    private javax.swing.JLabel lblWarehouseID;
    private javax.swing.JLabel lblWarehouseLocation;
    private javax.swing.JLabel lblWarehouseName;
    private javax.swing.JLabel lblWarehouseType;
    private javax.swing.JPasswordField pwdSupplier;
    private javax.swing.JTabbedPane tpanel;
    private javax.swing.JTextField txtFarmLocation;
    private javax.swing.JTextField txtFarmOwner;
    private javax.swing.JTextField txtFarmProduce;
    private javax.swing.JTextField txtFarmname;
    private javax.swing.JTextField txtStoreID;
    private javax.swing.JTextField txtStoreLocation;
    private javax.swing.JTextField txtStoreName;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierLocation;
    private javax.swing.JTextField txtSupplierMobile;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierUserName;
    private javax.swing.JTextField txtWarehouseID;
    private javax.swing.JTextField txtWarehouseLocation;
    private javax.swing.JTextField txtWarehouseName;
    private javax.swing.JTextField txtWarehouseType;
    // End of variables declaration//GEN-END:variables
}
