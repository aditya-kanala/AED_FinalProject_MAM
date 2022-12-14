/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 *
 * @author mahith
 */
public class forgotPasswordPanel extends javax.swing.JPanel {

    /**
     * Creates new form forgotPasswordPanel
     */
    public forgotPasswordPanel() {
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

        txtEmail = new javax.swing.JTextField();
        userNameSeperator = new javax.swing.JSeparator();
        submitBtnPanel = new javax.swing.JPanel();
        submitLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 56, 82));

        txtEmail.setBackground(new java.awt.Color(25, 56, 82));
        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("Email ID");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        userNameSeperator.setForeground(new java.awt.Color(204, 204, 204));

        submitBtnPanel.setBackground(new java.awt.Color(25, 56, 82));
        submitBtnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        submitBtnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnPanelMouseClicked(evt);
            }
        });

        submitLabel.setBackground(new java.awt.Color(25, 56, 82));
        submitLabel.setForeground(new java.awt.Color(204, 204, 204));
        submitLabel.setText("     Submit");
        submitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout submitBtnPanelLayout = new javax.swing.GroupLayout(submitBtnPanel);
        submitBtnPanel.setLayout(submitBtnPanelLayout);
        submitBtnPanelLayout.setHorizontalGroup(
            submitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        submitBtnPanelLayout.setVerticalGroup(
            submitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(496, 496, 496))
            .addGroup(layout.createSequentialGroup()
                .addGap(619, 619, 619)
                .addComponent(submitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(submitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if(txtEmail.getText().equals("Email ID")){
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().isBlank()){
            txtEmail.setText("Email ID");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void submitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitLabelMouseClicked
        // TODO add your handling code here:
        
        String toEmail = txtEmail.getText();
        String fromEmail = "amazonian.co.us@gmail.com";
        String password = "MAM@Amazonian";
        Properties defaultProps = new Properties();
        defaultProps.setProperty("mail.smtp.auth", "true");
        defaultProps.setProperty("mail.smtp.starttls.enable", "true");
        defaultProps.setProperty("mail.smtp.host", "smtp.gmail.com");
        defaultProps.setProperty("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(defaultProps, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthenticator() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
  
        try{
          MimeMessage message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail));
          message.addRecipient(RecipientType.TO, new InternetAddress(toEmail));
          message.setSubject("AMAZONIAN: Password Reset Notification");
          message.setText("Hi, \n \n Your New Password is password"+"\n \nThanks,\nTeam Amazonian.");
          
          Transport.send(message,fromEmail,"waawvlxrgcqdqjui");
          
          JOptionPane.showMessageDialog(this, "Email Successfully sent");
        }
        catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Please enter a valid Email ID");
            
        }
        
    }//GEN-LAST:event_submitLabelMouseClicked

    private void submitBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnPanelMouseClicked

    private void submitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitLabelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_submitLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel submitBtnPanel;
    private javax.swing.JLabel submitLabel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JSeparator userNameSeperator;
    // End of variables declaration//GEN-END:variables
}
