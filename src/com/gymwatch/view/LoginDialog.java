/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gymwatch.view;

import java.awt.event.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.*;
import javax.swing.border.LineBorder;

import com.gymwatch.controller.GymWatchController;

/**
 *
 * @author ADMIN
 */
public class LoginDialog extends JDialog {
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel clearBttn;
    private JComboBox rightsComboBox;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel loginBttn;
    private JPasswordField passwordTxt;
    private JLabel usernameJLabel;
    private JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
    private GymWatchController controller;

    /**
     * Creates new form LoginDialog
     */
    public LoginDialog(){
    	
    }
    public LoginDialog(GymWatchController baseController) {
    	this.controller=baseController;
        setupDialog();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void setupDialog() {

        rightsComboBox = new JComboBox();
        jLabel1 = new JLabel();
        usernameJLabel = new JLabel();
        usernameTxt = new JTextField();
        jLabel2 = new JLabel();
        loginBttn = new JLabel();
        clearBttn = new JLabel();
        passwordTxt = new JPasswordField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        rightsComboBox.setModel(new DefaultComboBoxModel(new String[] { "MANAGER", "COMMON" }));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/gymwatch/view/images/loginMember.png"))); // NOI18N

        usernameJLabel.setText("Username");

        usernameTxt.setBorder(new LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        //endpart one
        usernameTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        loginBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/logout-icon.png"))); // NOI18N
        loginBttn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginBttnMouseClicked(evt);
            }
        });
        loginBttn.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                loginBttnKeyPressed(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        passwordTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                passwordTxtKeyTyped(evt);
            }
        });

        jLabel3.setText("Login");

        jLabel4.setText("Clear");

       GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameJLabel)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTxt)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginBttn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(clearBttn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4)))))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearBttn)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBttn)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }

    private void usernameTxtActionPerformed(ActionEvent evt) {
    }
  
    private String encryptPassword(String input){
        String encPass=null;
        if(input==null) return null;
        
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return encPass;
    }
    
    String user;
    private void loginBttnMouseClicked(MouseEvent evt) {
        String username=usernameTxt.getText();
        String p=passwordTxt.getText();
        String password=encryptPassword(p);
        user=(String)rightsComboBox.getSelectedItem();
        
        if(controller.getFactory().checkLogin(username,password,user)==true){
            dispose();
            //new Dashboard(user,username);
            controller.startFrame(user, username);
        }else{
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }

    
    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        usernameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_clearBttnMouseClicked

    private void loginBttnKeyPressed(KeyEvent evt) {

    }

    private void passwordTxtKeyTyped(KeyEvent evt) {

    }
    
    public String getUser(){
        return user;
    }
    
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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog();
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });*/
    }


}
