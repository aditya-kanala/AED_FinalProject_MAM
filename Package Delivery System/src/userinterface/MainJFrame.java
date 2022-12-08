/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import userinterface.CustomerServiceRepresentative.csrPanel;
import userinterface.StoreManager.StoreManagerJPanel;
import userinterface.customer.CustomerHomePanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Maps.mapsPanel;
import userinterface.SystemAdmin.SystemAdminJPanel;

/**
 *
 * @author mahith
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        databaseConnection();
    }
    
    Connection connection;
     
    private void databaseConnection(){
        System.out.println("Connection db");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed_project", "root", "root");//Establishing connection
            System.out.println("Connected With the database successfully"); //Message after successful connection 
        } catch (SQLException e) {
            System.out.println(e); //Message if something goes wrong while conneting to the database
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

        leftPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();
        userNameSeperator = new javax.swing.JSeparator();
        passwordSeperator = new javax.swing.JSeparator();
        signInButtonPanel = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        newUser = new javax.swing.JLabel();
        newUserSeperator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(244, 242, 227));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shutdown.png"))); // NOI18N
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabelMousePressed(evt);
            }
        });
        leftPanel.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 70, 60));

        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

        backLabel.setBackground(new java.awt.Color(227, 73, 78));
        backLabel.setForeground(new java.awt.Color(227, 73, 78));
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go Back.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
        });
        leftPanel.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 60, 60));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(25, 56, 82));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1338, 1048));

        loginJPanel.setBackground(new java.awt.Color(25, 56, 82));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));

        jPanel2.setBackground(new java.awt.Color(227, 73, 78));
        jPanel2.setPreferredSize(new java.awt.Dimension(555, 840));

        logoLabel.setBackground(new java.awt.Color(0, 0, 0));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Amazon Square.png"))); // NOI18N

        titleLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        titleLabel1.setText("A M A Z O N I A N");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(titleLabel1)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        txtUserName.setBackground(new java.awt.Color(25, 56, 82));
        txtUserName.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(204, 204, 204));
        txtUserName.setText("Username");
        txtUserName.setBorder(null);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });

        fldPassword.setBackground(new java.awt.Color(25, 56, 82));
        fldPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        fldPassword.setForeground(new java.awt.Color(204, 204, 204));
        fldPassword.setText("password");
        fldPassword.setBorder(null);
        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPasswordFocusLost(evt);
            }
        });
        fldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPasswordActionPerformed(evt);
            }
        });

        userNameSeperator.setForeground(new java.awt.Color(204, 204, 204));

        passwordSeperator.setForeground(new java.awt.Color(204, 204, 204));

        signInButtonPanel.setBackground(new java.awt.Color(25, 56, 82));
        signInButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        signInButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButtonPanelMouseClicked(evt);
            }
        });

        signInLabel.setBackground(new java.awt.Color(25, 56, 82));
        signInLabel.setForeground(new java.awt.Color(204, 204, 204));
        signInLabel.setText("        Sign In");
        signInLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout signInButtonPanelLayout = new javax.swing.GroupLayout(signInButtonPanel);
        signInButtonPanel.setLayout(signInButtonPanelLayout);
        signInButtonPanelLayout.setHorizontalGroup(
            signInButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        signInButtonPanelLayout.setVerticalGroup(
            signInButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signInLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        forgotPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(204, 204, 204));
        forgotPassword.setText("Forgot Password?");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });

        exitLabel.setFont(new java.awt.Font("Shree Devanagari 714", 1, 36)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(204, 204, 204));
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        newUser.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        newUser.setForeground(new java.awt.Color(204, 204, 204));
        newUser.setText("New User ?? Sign Up !!");
        newUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserMouseClicked(evt);
            }
        });

        newUserSeperator.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                                .addComponent(signInButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(358, 358, 358))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                                .addComponent(exitLabel)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282))))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fldPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userNameSeperator)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                    .addComponent(newUserSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(256, Short.MAX_VALUE))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel)
                .addGap(213, 213, 213)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(forgotPassword)
                .addGap(18, 18, 18)
                .addComponent(newUserSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMousePressed
        
    }//GEN-LAST:event_logoutLabelMousePressed

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed
        // TODO add your handling code here:
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    }//GEN-LAST:event_backLabelMousePressed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        if(txtUserName.getText().equals("Username")){
            txtUserName.setText("");
        }

    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if(txtUserName.getText().isBlank()){
            txtUserName.setText("Username");
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void fldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusGained
        // TODO add your handling code here:
        if(new String(fldPassword.getPassword()).equals("password")){
            fldPassword.setText("");
        }
    }//GEN-LAST:event_fldPasswordFocusGained

    private void fldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusLost
        // TODO add your handling code here:
        if(new String(fldPassword.getPassword()).isBlank()){
            fldPassword.setText("password");
        }
    }//GEN-LAST:event_fldPasswordFocusLost

    private void fldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPasswordActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        // TODO add your handling code here:
            forgotPasswordPanel panel = new forgotPasswordPanel();
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            logoutLabel.setVisible(false);
            backLabel.setVisible(true);
            txtUserName.setText("");
            fldPassword.setText("");
        
            container.add("workArea", panel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
 

    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void signInButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonPanelMouseClicked
        // TODO add your handling code here:
        
        try{ 
        
         /*BPO Admin Login*/   
          if(txtUserName.getText().equalsIgnoreCase("bpoadmin")){  
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from admins where username = ?");
            st.setString(1, "bpoadmin");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                if((rs.getString(1).equalsIgnoreCase(txtUserName.getText())) && rs.getString(2).equals(String.valueOf(fldPassword.getPassword()))){
                        JOptionPane.showMessageDialog(this, "BPO Admin Login Successful..!!");
                        StoreManagerJPanel panel = new StoreManagerJPanel(connection);
                        container.add("workArea111", panel);
                        CardLayout layout = (CardLayout) container.getLayout();
                        layout.next(container);
                }
            }
            
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            logoutLabel.setVisible(false);
            backLabel.setVisible(true);
            txtUserName.setText("");
            fldPassword.setText("");
          }
          
          /*Distribution Admin Login*/
          else if(txtUserName.getText().equalsIgnoreCase("dadmin")){  
            PreparedStatement preparedStatement =connection.prepareStatement("select * from admins where username=?");
            preparedStatement.setString(1, "dadmin");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if((rs.getString(1).equalsIgnoreCase(txtUserName.getText())) && rs.getString(2).equals(String.valueOf(fldPassword.getPassword()))){
                        JOptionPane.showMessageDialog(this, "Distribution Admin Login Successful..!!");
//                        StoreManagerJPanel panel = new StoreManagerJPanel();
//                        container.add("workArea111", panel);
//                        CardLayout layout = (CardLayout) container.getLayout();
//                        layout.next(container);
                }
            }
        loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        logoutLabel.setVisible(false);
        backLabel.setVisible(true);
        txtUserName.setText("");
        fldPassword.setText("");
          }
          
          /*Logistics Admin Login */
          else if(txtUserName.getText().equalsIgnoreCase("ladmin")){  
            PreparedStatement preparedStatement =connection.prepareStatement("select * from admins where username=?");
            preparedStatement.setString(1, "ladmin");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if((rs.getString(1).equalsIgnoreCase(txtUserName.getText())) && rs.getString(2).equals(String.valueOf(fldPassword.getPassword()))){
                        JOptionPane.showMessageDialog(this, "Logistics Admin Login Successful..!!");
//                        StoreManagerJPanel panel = new StoreManagerJPanel();
//                        container.add("workArea111", panel);
//                        CardLayout layout = (CardLayout) container.getLayout();
//                        layout.next(container);
                }
            }
        loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        logoutLabel.setVisible(false);
        backLabel.setVisible(true);
        txtUserName.setText("");
        fldPassword.setText("");
          }
          
          
         /*Market Place Admin Login*/
          else if(txtUserName.getText().equalsIgnoreCase("madmin")){  
            PreparedStatement preparedStatement =connection.prepareStatement("select * from admins where username=?");
            preparedStatement.setString(1, "madmin");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if((rs.getString(1).equalsIgnoreCase(txtUserName.getText())) && rs.getString(2).equals(String.valueOf(fldPassword.getPassword()))){
                    JOptionPane.showMessageDialog(this, "Market Place Admin Login Successful..!!");
//                        StoreManagerJPanel panel = new StoreManagerJPanel();
//                        container.add("workArea111", panel);
//                        CardLayout layout = (CardLayout) container.getLayout();
//                        layout.next(container);
                }
            }
         loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        logoutLabel.setVisible(false);
        backLabel.setVisible(true);
        txtUserName.setText("");
        fldPassword.setText("");
          }
          
          /*System Admin Login*/
          else if(txtUserName.getText().equalsIgnoreCase("sadmin")){  
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from admins where username=?");
            preparedStatement.setString(1, "sadmin");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                if((rs.getString(1).equalsIgnoreCase(txtUserName.getText())) && rs.getString(2).equals(String.valueOf(fldPassword.getPassword()))){
                    JOptionPane.showMessageDialog(this, "System Admin Login Successful..!!");
                        SystemAdminJPanel sysadmin = new SystemAdminJPanel(connection);
                        container.add("workArea111", sysadmin);
                        CardLayout layout = (CardLayout) container.getLayout();
                        layout.next(container);
                }
            }
        loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        logoutLabel.setVisible(false);
        backLabel.setVisible(true);
        txtUserName.setText("");
        fldPassword.setText("");
          }
          
         /*Store Manager Login*/ 
          else if (txtUserName.getText().contains("storemanager")){
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from store_manager where ManagerUserName=?");
            preparedStatement.setString(1, txtUserName.getText());
            ResultSet rs = preparedStatement.executeQuery(); 
            while(rs.next()){
              if((rs.getString(5).equalsIgnoreCase(txtUserName.getText())) && rs.getString(6).equals(String.valueOf(fldPassword.getPassword()))){
                        JOptionPane.showMessageDialog(this, "Store Manager Login Successful..!!");
                        StoreManagerJPanel panel = new StoreManagerJPanel(connection);
                        container.add("workArea111", panel);
                        CardLayout layout = (CardLayout) container.getLayout();
                        layout.next(container);
                }
            }
            
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            logoutLabel.setVisible(false);
            backLabel.setVisible(true);
            txtUserName.setText("");
            fldPassword.setText("");    
          }
          else{
            JOptionPane.showMessageDialog(this, "No Admin Found for the Credentials"+" :( :(");
          }
        }
        catch(SQLException e){
            System.out.println("Error while retrieving data  "+e);
        }  
        
    }//GEN-LAST:event_signInButtonPanelMouseClicked

    private void newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_newUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
   
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel newUser;
    private javax.swing.JSeparator newUserSeperator;
    private javax.swing.JSeparator passwordSeperator;
    private javax.swing.JPanel signInButtonPanel;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JSeparator userNameSeperator;
    // End of variables declaration//GEN-END:variables
}
