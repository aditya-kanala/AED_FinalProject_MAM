/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.UserAccount;

/**
 *
 * @author adity
 */
public class RolesSignUp extends javax.swing.JPanel {

    /**
     * Creates new form RolesSignUp
     */
    public RolesSignUp() {
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

        tabbedRoles = new javax.swing.JTabbedPane();
        StoreManager = new javax.swing.JPanel();
        lblStoreName = new javax.swing.JLabel();
        lblSHeading = new javax.swing.JLabel();
        lblSManagerName = new javax.swing.JLabel();
        lblSManagerEmail = new javax.swing.JLabel();
        lblSManagerUserName = new javax.swing.JLabel();
        lblSManagerPassword = new javax.swing.JLabel();
        txtStoreName = new javax.swing.JTextField();
        txtSManagerName = new javax.swing.JTextField();
        txtSManagerEmail = new javax.swing.JTextField();
        txtSManagerUserName = new javax.swing.JTextField();
        lblStoreID = new javax.swing.JLabel();
        pwdSManagerPassword = new javax.swing.JPasswordField();
        txtStoreID = new javax.swing.JTextField();
        btnCreateStoreManager = new javax.swing.JButton();
        WarehouseManager = new javax.swing.JPanel();
        lblWarehouseName = new javax.swing.JLabel();
        lblWHeading = new javax.swing.JLabel();
        lblWManagerName = new javax.swing.JLabel();
        lblWManagerEmail = new javax.swing.JLabel();
        lblManagerUserName1 = new javax.swing.JLabel();
        lblWManagerPassword = new javax.swing.JLabel();
        txtWarehouseName = new javax.swing.JTextField();
        txtWManagerName = new javax.swing.JTextField();
        txtWManagerEmail = new javax.swing.JTextField();
        txtWManagerUserName = new javax.swing.JTextField();
        lblWarehouseID = new javax.swing.JLabel();
        pwdWManagerPassword1 = new javax.swing.JPasswordField();
        txtWarehouseID = new javax.swing.JTextField();
        btnCreateWarehouseManager = new javax.swing.JButton();
        CSR = new javax.swing.JPanel();
        lblCHeading = new javax.swing.JLabel();
        lblCSRAgentID = new javax.swing.JLabel();
        lblCSRAgentName = new javax.swing.JLabel();
        lblCSRAgentEmail = new javax.swing.JLabel();
        lblCSRAgentPassword = new javax.swing.JLabel();
        txtCSRAgentID = new javax.swing.JTextField();
        txtCSRAgentName = new javax.swing.JTextField();
        txtCSRAgentEmail = new javax.swing.JTextField();
        btnCreateCSR = new javax.swing.JButton();
        pwdCSRAgentPassword = new javax.swing.JPasswordField();
        SSR = new javax.swing.JPanel();
        lblSSRHeading1 = new javax.swing.JLabel();
        lblSSRAgentID = new javax.swing.JLabel();
        lblSSRAgentName = new javax.swing.JLabel();
        lblSSRAgentEmail = new javax.swing.JLabel();
        lblSSRAgentPassword = new javax.swing.JLabel();
        txtSSRAgentID = new javax.swing.JTextField();
        txtSSRAgentEmail = new javax.swing.JTextField();
        btnCreateSSR = new javax.swing.JButton();
        pwdSSRAgentPassword = new javax.swing.JPasswordField();
        txtSSRAgentName = new javax.swing.JTextField();
        ShippingAgent = new javax.swing.JPanel();
        lblSAHeading = new javax.swing.JLabel();
        lblShippingAgentName = new javax.swing.JLabel();
        lblShippingAgentMobile = new javax.swing.JLabel();
        lblShippingAgentBaseLocation = new javax.swing.JLabel();
        lblShippingUserName = new javax.swing.JLabel();
        lblShippingAgentPassword = new javax.swing.JLabel();
        txtShippingAgentName = new javax.swing.JTextField();
        txtShippingAgentMobile = new javax.swing.JTextField();
        txtShippingAgentBaseLocation = new javax.swing.JTextField();
        txtShippingAgentUserName = new javax.swing.JTextField();
        pwdShippingAgent = new javax.swing.JPasswordField();
        btnShippingAgent = new javax.swing.JButton();
        DeliveryAgent = new javax.swing.JPanel();
        Customer = new javax.swing.JPanel();

        lblStoreName.setText("Store Name :");

        lblSHeading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSHeading.setText("Create New Store Manager");

        lblSManagerName.setText("Manager Name :");

        lblSManagerEmail.setText("Manager Email :");

        lblSManagerUserName.setText("Username :");

        lblSManagerPassword.setText("Password :");

        lblStoreID.setText("Store ID :");

        btnCreateStoreManager.setText("Create Manager");

        javax.swing.GroupLayout StoreManagerLayout = new javax.swing.GroupLayout(StoreManager);
        StoreManager.setLayout(StoreManagerLayout);
        StoreManagerLayout.setHorizontalGroup(
            StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreManagerLayout.createSequentialGroup()
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StoreManagerLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(StoreManagerLayout.createSequentialGroup()
                                .addComponent(lblSManagerName)
                                .addGap(96, 96, 96)
                                .addComponent(txtSManagerName))
                            .addGroup(StoreManagerLayout.createSequentialGroup()
                                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSManagerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSManagerUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSManagerEmail)
                                    .addComponent(txtSManagerUserName)
                                    .addComponent(pwdSManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StoreManagerLayout.createSequentialGroup()
                                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStoreName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStoreName)
                                    .addComponent(txtStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StoreManagerLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblSHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(StoreManagerLayout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btnCreateStoreManager)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        StoreManagerLayout.setVerticalGroup(
            StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreManagerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblSHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStoreID)
                    .addComponent(txtStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStoreName)
                    .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSManagerName)
                    .addComponent(txtSManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSManagerEmail)
                    .addComponent(txtSManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSManagerUserName)
                    .addComponent(txtSManagerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(StoreManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSManagerPassword)
                    .addComponent(pwdSManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(btnCreateStoreManager, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        tabbedRoles.addTab("Store Manager", StoreManager);

        lblWarehouseName.setText("Store Name :");

        lblWHeading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblWHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWHeading.setText("Create New Warehouse Manager");

        lblWManagerName.setText("Manager Name :");

        lblWManagerEmail.setText("Manager Email :");

        lblManagerUserName1.setText("Username :");

        lblWManagerPassword.setText("Password :");

        lblWarehouseID.setText("Warehouse ID :");

        btnCreateWarehouseManager.setText("Create Manager");

        javax.swing.GroupLayout WarehouseManagerLayout = new javax.swing.GroupLayout(WarehouseManager);
        WarehouseManager.setLayout(WarehouseManagerLayout);
        WarehouseManagerLayout.setHorizontalGroup(
            WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarehouseManagerLayout.createSequentialGroup()
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WarehouseManagerLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(WarehouseManagerLayout.createSequentialGroup()
                                .addComponent(lblWManagerName)
                                .addGap(96, 96, 96)
                                .addComponent(txtWManagerName))
                            .addGroup(WarehouseManagerLayout.createSequentialGroup()
                                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblWManagerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblManagerUserName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWManagerEmail)
                                    .addComponent(txtWManagerUserName)
                                    .addComponent(pwdWManagerPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(WarehouseManagerLayout.createSequentialGroup()
                                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblWarehouseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWarehouseID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWarehouseName)
                                    .addComponent(txtWarehouseID, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(WarehouseManagerLayout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btnCreateWarehouseManager))
                    .addGroup(WarehouseManagerLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblWHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        WarehouseManagerLayout.setVerticalGroup(
            WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarehouseManagerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblWHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseID)
                    .addComponent(txtWarehouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarehouseName)
                    .addComponent(txtWarehouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWManagerName)
                    .addComponent(txtWManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWManagerEmail)
                    .addComponent(txtWManagerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagerUserName1)
                    .addComponent(txtWManagerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(WarehouseManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWManagerPassword)
                    .addComponent(pwdWManagerPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(btnCreateWarehouseManager, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        tabbedRoles.addTab("Warehouse Manager", WarehouseManager);

        lblCHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblCHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCHeading.setText("Create CSR Agent");

        lblCSRAgentID.setText("CSR Agent ID :");

        lblCSRAgentName.setText("CSR Agent Name :");

        lblCSRAgentEmail.setText("Email :");

        lblCSRAgentPassword.setText("Password :");

        btnCreateCSR.setText("Create CSR Agent");

        javax.swing.GroupLayout CSRLayout = new javax.swing.GroupLayout(CSR);
        CSR.setLayout(CSRLayout);
        CSRLayout.setHorizontalGroup(
            CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CSRLayout.createSequentialGroup()
                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CSRLayout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btnCreateCSR))
                    .addGroup(CSRLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCSRAgentID)
                            .addGroup(CSRLayout.createSequentialGroup()
                                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCSRAgentEmail)
                                    .addComponent(lblCSRAgentPassword)
                                    .addComponent(lblCSRAgentName))
                                .addGap(50, 50, 50)
                                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCSRAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCSRAgentID, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                        .addComponent(pwdCSRAgentPassword))
                                    .addComponent(txtCSRAgentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CSRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCHeading)
                .addGap(302, 302, 302))
        );
        CSRLayout.setVerticalGroup(
            CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CSRLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblCHeading)
                .addGap(73, 73, 73)
                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCSRAgentID)
                    .addComponent(txtCSRAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCSRAgentName)
                    .addComponent(txtCSRAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCSRAgentEmail)
                    .addComponent(txtCSRAgentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(CSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCSRAgentPassword)
                    .addComponent(pwdCSRAgentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(btnCreateCSR)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        tabbedRoles.addTab("CSR", CSR);

        lblSSRHeading1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblSSRHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSSRHeading1.setText("Create SSR Agent");

        lblSSRAgentID.setText("SSR Agent ID :");

        lblSSRAgentName.setText("SSR Agent Name :");

        lblSSRAgentEmail.setText("Email :");

        lblSSRAgentPassword.setText("Password :");

        btnCreateSSR.setText("Create SSR Agent");

        javax.swing.GroupLayout SSRLayout = new javax.swing.GroupLayout(SSR);
        SSR.setLayout(SSRLayout);
        SSRLayout.setHorizontalGroup(
            SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SSRLayout.createSequentialGroup()
                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SSRLayout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btnCreateSSR))
                    .addGroup(SSRLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSRAgentID)
                            .addGroup(SSRLayout.createSequentialGroup()
                                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSSRAgentEmail)
                                    .addComponent(lblSSRAgentPassword)
                                    .addComponent(lblSSRAgentName))
                                .addGap(50, 50, 50)
                                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSSRAgentID, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                        .addComponent(pwdSSRAgentPassword))
                                    .addComponent(txtSSRAgentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSSRAgentName))))))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SSRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSSRHeading1)
                .addGap(302, 302, 302))
        );
        SSRLayout.setVerticalGroup(
            SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SSRLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblSSRHeading1)
                .addGap(73, 73, 73)
                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSRAgentID)
                    .addComponent(txtSSRAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSSRAgentName)
                    .addComponent(txtSSRAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSRAgentEmail)
                    .addComponent(txtSSRAgentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSRAgentPassword)
                    .addComponent(pwdSSRAgentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(btnCreateSSR)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        tabbedRoles.addTab("SSR", SSR);

        lblSAHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblSAHeading.setText("Create Shipping Agent");

        lblShippingAgentName.setText("Name :");

        lblShippingAgentMobile.setText("Mobile :");

        lblShippingAgentBaseLocation.setText("Base Location :");

        lblShippingUserName.setText("User Name :");

        lblShippingAgentPassword.setText("Password :");

        btnShippingAgent.setText("Create Shipping Agent");

        javax.swing.GroupLayout ShippingAgentLayout = new javax.swing.GroupLayout(ShippingAgent);
        ShippingAgent.setLayout(ShippingAgentLayout);
        ShippingAgentLayout.setHorizontalGroup(
            ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShippingAgentLayout.createSequentialGroup()
                .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShippingAgentLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblShippingUserName)
                            .addComponent(lblShippingAgentName)
                            .addComponent(lblShippingAgentPassword)
                            .addComponent(lblShippingAgentBaseLocation)
                            .addComponent(lblShippingAgentMobile))
                        .addGap(40, 40, 40)
                        .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShippingAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShippingAgentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdShippingAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShippingAgentBaseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShippingAgentMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ShippingAgentLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(btnShippingAgent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShippingAgentLayout.createSequentialGroup()
                .addGap(0, 302, Short.MAX_VALUE)
                .addComponent(lblSAHeading)
                .addGap(287, 287, 287))
        );
        ShippingAgentLayout.setVerticalGroup(
            ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShippingAgentLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblSAHeading)
                .addGap(76, 76, 76)
                .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShippingAgentName)
                    .addComponent(txtShippingAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ShippingAgentLayout.createSequentialGroup()
                        .addComponent(lblShippingAgentMobile)
                        .addGap(27, 27, 27)
                        .addComponent(lblShippingAgentBaseLocation))
                    .addGroup(ShippingAgentLayout.createSequentialGroup()
                        .addComponent(txtShippingAgentMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtShippingAgentBaseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShippingAgentLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdShippingAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShippingAgentPassword)))
                    .addGroup(ShippingAgentLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(ShippingAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblShippingUserName)
                            .addComponent(txtShippingAgentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, 93)
                .addComponent(btnShippingAgent)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        tabbedRoles.addTab("Shipping Agent", ShippingAgent);

        javax.swing.GroupLayout DeliveryAgentLayout = new javax.swing.GroupLayout(DeliveryAgent);
        DeliveryAgent.setLayout(DeliveryAgentLayout);
        DeliveryAgentLayout.setHorizontalGroup(
            DeliveryAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        DeliveryAgentLayout.setVerticalGroup(
            DeliveryAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );

        tabbedRoles.addTab("Delivery Agent", DeliveryAgent);

        javax.swing.GroupLayout CustomerLayout = new javax.swing.GroupLayout(Customer);
        Customer.setLayout(CustomerLayout);
        CustomerLayout.setHorizontalGroup(
            CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        CustomerLayout.setVerticalGroup(
            CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );

        tabbedRoles.addTab("Customer", Customer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedRoles)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedRoles)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CSR;
    private javax.swing.JPanel Customer;
    private javax.swing.JPanel DeliveryAgent;
    private javax.swing.JPanel SSR;
    private javax.swing.JPanel ShippingAgent;
    private javax.swing.JPanel StoreManager;
    private javax.swing.JPanel WarehouseManager;
    private javax.swing.JButton btnCreateCSR;
    private javax.swing.JButton btnCreateSSR;
    private javax.swing.JButton btnCreateStoreManager;
    private javax.swing.JButton btnCreateWarehouseManager;
    private javax.swing.JButton btnShippingAgent;
    private javax.swing.JLabel lblCHeading;
    private javax.swing.JLabel lblCSRAgentEmail;
    private javax.swing.JLabel lblCSRAgentID;
    private javax.swing.JLabel lblCSRAgentName;
    private javax.swing.JLabel lblCSRAgentPassword;
    private javax.swing.JLabel lblManagerUserName1;
    private javax.swing.JLabel lblSAHeading;
    private javax.swing.JLabel lblSHeading;
    private javax.swing.JLabel lblSManagerEmail;
    private javax.swing.JLabel lblSManagerName;
    private javax.swing.JLabel lblSManagerPassword;
    private javax.swing.JLabel lblSManagerUserName;
    private javax.swing.JLabel lblSSRAgentEmail;
    private javax.swing.JLabel lblSSRAgentID;
    private javax.swing.JLabel lblSSRAgentName;
    private javax.swing.JLabel lblSSRAgentPassword;
    private javax.swing.JLabel lblSSRHeading1;
    private javax.swing.JLabel lblShippingAgentBaseLocation;
    private javax.swing.JLabel lblShippingAgentMobile;
    private javax.swing.JLabel lblShippingAgentName;
    private javax.swing.JLabel lblShippingAgentPassword;
    private javax.swing.JLabel lblShippingUserName;
    private javax.swing.JLabel lblStoreID;
    private javax.swing.JLabel lblStoreName;
    private javax.swing.JLabel lblWHeading;
    private javax.swing.JLabel lblWManagerEmail;
    private javax.swing.JLabel lblWManagerName;
    private javax.swing.JLabel lblWManagerPassword;
    private javax.swing.JLabel lblWarehouseID;
    private javax.swing.JLabel lblWarehouseName;
    private javax.swing.JPasswordField pwdCSRAgentPassword;
    private javax.swing.JPasswordField pwdSManagerPassword;
    private javax.swing.JPasswordField pwdSSRAgentPassword;
    private javax.swing.JPasswordField pwdShippingAgent;
    private javax.swing.JPasswordField pwdWManagerPassword1;
    private javax.swing.JTabbedPane tabbedRoles;
    private javax.swing.JTextField txtCSRAgentEmail;
    private javax.swing.JTextField txtCSRAgentID;
    private javax.swing.JTextField txtCSRAgentName;
    private javax.swing.JTextField txtSManagerEmail;
    private javax.swing.JTextField txtSManagerName;
    private javax.swing.JTextField txtSManagerUserName;
    private javax.swing.JTextField txtSSRAgentEmail;
    private javax.swing.JTextField txtSSRAgentID;
    private javax.swing.JTextField txtSSRAgentName;
    private javax.swing.JTextField txtShippingAgentBaseLocation;
    private javax.swing.JTextField txtShippingAgentMobile;
    private javax.swing.JTextField txtShippingAgentName;
    private javax.swing.JTextField txtShippingAgentUserName;
    private javax.swing.JTextField txtStoreID;
    private javax.swing.JTextField txtStoreName;
    private javax.swing.JTextField txtWManagerEmail;
    private javax.swing.JTextField txtWManagerName;
    private javax.swing.JTextField txtWManagerUserName;
    private javax.swing.JTextField txtWarehouseID;
    private javax.swing.JTextField txtWarehouseName;
    // End of variables declaration//GEN-END:variables
}
