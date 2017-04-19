/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gymwatch.view;

import com.gymwatch.controller.GymWatchController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class ClientUI extends JPanel {
	
	private javax.swing.JLabel addBttn;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JTextField clientNameFieldTxt;
    private javax.swing.JTextField clientNameTxt;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JLabel deleteLab;
    private javax.swing.JLabel editBttn;
    private javax.swing.JLabel editLab;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelA;
    private JLabel jLabelB;
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    //private javax.swing.JTextField locationTxt;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JTextField phoneTxt;
    
    private JTextField emailTxt;
    private JTextField birthDateTxt;
    private JTextField genderTxt;
    private JTextField coachTxt;
    private JTextField gymTxt;
    
    
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable table;

    /**
     * Creates new form Clients
     */
    private GymWatchController baseController;
    public ClientUI(GymWatchController baseController) {
    	this.baseController = baseController;
        initComponents();
        loadData();
    //    table.getColumn("id").setMaxWidth(0);
        clientNameFieldTxt.setVisible(false);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        mainPanel = new JPanel();
        jLabel12 = new JLabel();
        searchByLab = new JLabel();
        searchTxt = new JTextField();
        jSeparator1 = new JSeparator();
        jTabbedPane1 = new JTabbedPane();
        inputPanel = new JPanel();
        clientNameTxt = new JTextField();
        phoneTxt = new JTextField();
        
        emailTxt = new JTextField();
        birthDateTxt = new JTextField();
        genderTxt = new JTextField();
        coachTxt = new JTextField();
        gymTxt = new JTextField();
        
        //marked for delete
        //locationTxt = new JTextField();
        jLabel2 = new JLabel();
        jLabel5 = new JLabel();
        
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabelA = new JLabel();
        jLabelB = new JLabel();
        
        addBttn = new JLabel();
        editBttn = new JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        clientNameFieldTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editLab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        //jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("(Search using name, phone or client code)");

        searchByLab.setText("SEARCH");

        searchTxt.setToolTipText("Search using name, phone or client code");
        searchTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("ENTER ALL THE FIELDS"));

        clientNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        clientNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameTxtActionPerformed(evt);
            }
        });

        phoneTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        
        emailTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        birthDateTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        birthDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTxtActionPerformed(evt);
            }
        });
        genderTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        genderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTxtActionPerformed(evt);
            }
        });

/*        locationTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        locationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtActionPerformed(evt);
            }
        });*/

        jLabel2.setText("Name");
        jLabel5.setText("Phone");
        
        jLabel7.setText("Email");
        jLabel8.setText("Birth Date");
        jLabel9.setText("Gender");
        jLabelA.setText("CoachId");
        jLabelB.setText("GymId");

        addBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/addPeople.png"))); // NOI18N
        addBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					addBttnMouseClicked(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/editPeople.png"))); // NOI18N
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					editBttnMouseClicked(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        deleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/deletelarge.png"))); // NOI18N
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        clientNameFieldTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        clientNameFieldTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameFieldTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("Clear");

        editLab.setText("Edit");

        jLabel6.setText("Add");

        deleteLab.setText("Delete");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabelA)
                            .addComponent(jLabelB)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            //.addComponent(locationTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(clientNameTxt, javax.swing.GroupLayout.Alignment.LEADING,javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthDateTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coachTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gymTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTxt)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(addBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editLab)
                                .addGap(19, 19, 19)))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBttn)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deleteLab)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(clearBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clientNameFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(birthDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelA)
                        .addComponent(coachTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelB)
                        .addComponent(gymTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientNameFieldTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editLab)
                    .addComponent(jLabel6)
                    .addComponent(deleteLab)
                    .addComponent(jLabel11))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENT", inputPanel);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        //jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("CLIENTS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

/*    private void locationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtActionPerformed
*/
    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed
    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed
    private void birthDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed
    private void genderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void clientNameTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void addBttnMouseClicked(java.awt.event.MouseEvent evt) throws ParseException {//GEN-FIRST:event_addBttnMouseClicked
        if(clientNameTxt.getText().equals("") || phoneTxt.getText().equals("")|| emailTxt.getText().equals("")|| birthDateTxt.getText().equals("")|| genderTxt.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Please fill all the fields!");
        }else{
        	SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        	String name = clientNameTxt.getText();
        	String phone = clientNameTxt.getText();
        	String email = clientNameTxt.getText();
        	Date birthDate = format1.parse(birthDateTxt.getText());
        	String gender = genderTxt.getText();
/*        	baseController.getClient().setName(clientNameTxt.getText());
        	baseController.getClient().setPhone(phoneTxt.getText());
        	baseController.getClient().setEmail(emailTxt.getText());
        	baseController.getClient().setBirthDate(format1.parse(birthDateTxt.getText()));
        	baseController.getClient().setGender(genderTxt.getText());*/
        	//baseController.getFactory().addClient(baseController.getClient());
        	baseController.getFactory().addClient(name, phone, email, birthDate, gender);
            loadData();
        }
    }//GEN-LAST:event_addBttnMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i]=table.getValueAt(row, i);
        }
        clientNameFieldTxt.setText((String) val[0]);
        clientNameTxt.setText((String) val[1]);
        phoneTxt.setText((String) val[2]);
        emailTxt.setText((String) val[3]);
        birthDateTxt.setText((String) val[4]);
        genderTxt.setText((String) val[5]);
    }//GEN-LAST:event_tableMouseClicked

    private void clientNameFieldTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            if(clientNameTxt.getText().equals("") || phoneTxt.getText().equals("")|| emailTxt.getText().equals("")|| birthDateTxt.getText().equals("")|| genderTxt.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Please fill all the fields!");
            }else{

            	SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
               	String name = clientNameTxt.getText();
            	String phone = clientNameTxt.getText();
            	String email = clientNameTxt.getText();
            	Date birthDate = format1.parse(birthDateTxt.getText());
            	String gender = genderTxt.getText();
            	
            /*	baseController.getClient().setName(clientNameTxt.getText());
            	baseController.getClient().setPhone(phoneTxt.getText());
            	baseController.getClient().setEmail(emailTxt.getText());
            	baseController.getClient().setBirthDate(format1.parse(birthDateTxt.getText()));
            	baseController.getClient().setGender(genderTxt.getText());*/
            	//baseController.getFactory().addClient(baseController.getClient());
            	baseController.getFactory().addClient(name, phone, email, birthDate, gender);
                loadData();
            }
        }
    }//GEN-LAST:event_editBttnMouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            baseController.getFactory().deleteClient(table.getValueAt(table.getSelectedRow(),0).toString());
            loadData();
        }
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {
/*        clientNameFieldTxt.setText("");
        clientNameTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        birthDateTxt.setText("");
        genderTxt.setText("");*/
    }//GEN-LAST:event_clearBttnMouseClicked

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {
        String text=searchTxt.getText();
        loadSearchClientsDatas(text);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {
 /*       clientNameFieldTxt.setText("");
        clientNameTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        birthDateTxt.setText("");
        genderTxt.setText("");*/
    }//GEN-LAST:event_mainPanelMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {

    }//GEN-LAST:event_formMouseClicked

    public void loadData(){
            try{
             	table.setModel(baseController.getFactory().buildTableModel(baseController.getFactory().getClientTable()));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
    }
    
    public void loadSearchClientsDatas(String text){

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    // End of variables declaration//GEN-END:variables
}
