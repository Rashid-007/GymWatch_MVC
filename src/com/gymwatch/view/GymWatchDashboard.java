package com.gymwatch.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import com.gymwatch.controller.GymWatchController;
import com.gymwatch.view.About;
//import com.gymwatch.view.ChangeDetails;
import com.gymwatch.view.ClientUI;
import com.gymwatch.view.HomePage;
import com.gymwatch.view.LoginDialog;

/**
 * Main Frame of Application Gymwatch extending JFrame for use with a MVC GUI
 * @author Enayat
 *
 */
public class GymWatchDashboard extends JFrame {
	/**
	 * Since frame is the main container, Jpanel would have a reference in frame. 
	 */
	private GymWatchPanel basePanel;
	private ClientUI clientUI;
	/**
	 * Create a sample frame object passing a reference to the GymWatchController for
	 * use by GymWatchFrame object.
	 * @param baseController the reference to the GymWatchController object
	 */
	/**
	 * 
	 * @param 
	 */
	 private javax.swing.JLabel addOfferBttn;
	    private javax.swing.JPanel bttnPanel;
	    private javax.swing.JMenuItem changeDetailsMenuItem;
	    private javax.swing.JLabel currentclientsBttn;
	    private javax.swing.JLabel clientsBttn;
	    private javax.swing.JMenu fileMenu;
	    private javax.swing.JMenuItem homeMenuItem;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JMenuItem logoutMenuItem;
	    private javax.swing.JPanel mainPanel;
	    private javax.swing.JLabel menuBttn;
	    private javax.swing.JPanel menuPanel;
	    private javax.swing.JPanel navPanel;
	    private javax.swing.JLabel subscriptionBttn;
	    private javax.swing.JMenu membershipTypeMenuItem;
	    private javax.swing.JLabel membershipReportBttn;
	    private javax.swing.JLabel membershipReportLab;
	    private javax.swing.JLabel coachesBttn;
	    private javax.swing.JLabel userBttn;
	    private javax.swing.JLabel userLab;
	    
	    CardLayout layout;
	    String userSelect;
	    String username;
	    ButtonGroup theme;
	public GymWatchDashboard(GymWatchController baseController){
		basePanel=new GymWatchPanel(baseController);
		clientUI = new ClientUI(baseController);
		setupFrame();
	}
	/**
	 * Set the content pane, size and make the frame visible
	 */
	public void setupFrame(){
/*		this.setContentPane(basePanel);
		this.setSize(700, 700);
		this.setVisible(true);*/
		initComponents();
        navPanel.setVisible(true);
        menuPanel.setVisible(true);
        layout = new CardLayout();
        //userSelect = user;
        this.username=username;
        if ("NORMAL USER".equalsIgnoreCase(userSelect)) {
            NotForNormalUser();
        }
        mainPanel.setLayout(layout);
        mainPanel.add("First", new HomePage());
        mainPanel.add("Third", clientUI);
        mainPanel.add("Twelvth", new About());
        layout.next(mainPanel);
        layout.next(mainPanel);
                
        Toolkit theKit = getToolkit();
        Dimension dim = theKit.getScreenSize();
        setSize(dim);
        setTitle("GymWatch: Management System");
        setLocationRelativeTo(null);
        setVisible(true);
	}
	//start
	public void addOfferPage() {
        layout.show(mainPanel, "Second");
    }

    public void addClientPage() {
        layout.show(mainPanel, "Third");
    }

    public void addCoachPage() {
        layout.show(mainPanel, "Fourth");
    }
    
    public void addUsersPage() {
        layout.show(mainPanel, "Sixth");
    }
    
    public void addLogsPage() {
        layout.show(mainPanel, "Seventh");
    }
    
    public void addChangeDetailsPage() {
        layout.show(mainPanel, "Eight");
    }
    
    public void addCurrentClientsPage() {
        layout.show(mainPanel, "Ninth");
    }
    
    public void addMembershipReportPage() {
        layout.show(mainPanel, "Tenth");
    }
    
    public void addPurchasePage() {
        layout.show(mainPanel, "Eleventh");
    }
    
    public void addAboutPage() {
        layout.show(mainPanel, "Twelvth");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bttnPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addOfferBttn = new javax.swing.JLabel();
        clientsBttn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coachesBttn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userBttn = new javax.swing.JLabel();
        userLab = new javax.swing.JLabel();
        currentclientsBttn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        membershipReportBttn = new javax.swing.JLabel();
        membershipReportLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subscriptionBttn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        menuBttn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        membershipTypeMenuItem = new javax.swing.JMenu();
        changeDetailsMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bttnPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout bttnPanelLayout = new javax.swing.GroupLayout(bttnPanel);
        bttnPanel.setLayout(bttnPanelLayout);
        bttnPanelLayout.setHorizontalGroup(
            bttnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        bttnPanelLayout.setVerticalGroup(
            bttnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(570, 570, 570)
                .addComponent(bttnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(bttnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Offers");

        addOfferBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/offerLarge.png"))); // NOI18N
        addOfferBttn.setToolTipText("Offers");
        addOfferBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOfferBttnMouseClicked(evt);
            }
        });

        clientsBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/clientsLarge.png"))); // NOI18N
        clientsBttn.setToolTipText("Clients");
        clientsBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsBttnMouseClicked(evt);
            }
        });

        jLabel3.setText("Clients");

        coachesBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/coachsLarge.png"))); // NOI18N
        coachesBttn.setToolTipText("Coaches");
        coachesBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coachBttnMouseClicked(evt);
            }
        });

        jLabel5.setText("Coaches");

        userBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/userLarge.png"))); // NOI18N
        userBttn.setToolTipText("Users");
        userBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBttnMouseClicked(evt);
            }
        });

        userLab.setText("Users");

        currentclientsBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/current-clients.png"))); // NOI18N
        currentclientsBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentClientsBttnMouseClicked(evt);
            }
        });

        jLabel4.setText("Current Clients");

        membershipReportBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/membership.png"))); // NOI18N
        membershipReportBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              
            }
        });

        membershipReportLab.setText("Membership Types");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/home.png"))); // NOI18N
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        subscriptionBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/basket-icon.png"))); // NOI18N
        subscriptionBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subscriptionBttnMouseClicked(evt);
            }
        });

        jLabel7.setText("Subscription");

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coachesBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addOfferBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userLab))
                    .addComponent(userBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(clientsBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subscriptionBttn)
                    .addComponent(jLabel7)))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentclientsBttn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(membershipReportLab))
                    .addComponent(membershipReportBttn)))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(coachesBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(addOfferBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(subscriptionBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(clientsBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(currentclientsBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(membershipReportBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(membershipReportLab)
                .addGap(18, 18, 18)
                .addComponent(userBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLab)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        menuPanel.setPreferredSize(new java.awt.Dimension(61, 16));

        menuBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/menu.png"))); // NOI18N
        menuBttn.setPreferredSize(new java.awt.Dimension(77, 16));
        menuBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBttnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1556, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addComponent(menuBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        homeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        homeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/home.png"))); // NOI18N
        homeMenuItem.setText("Home");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(homeMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuBar1.add(fileMenu);

        membershipTypeMenuItem.setText("Action");

        changeDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        changeDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/changeDetails.png"))); // NOI18N
        changeDetailsMenuItem.setText("Change Details");
        changeDetailsMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeDetailsMenuItemMouseClicked(evt);
            }
        });
        changeDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDetailsMenuItemActionPerformed(evt);
            }
        });
        membershipTypeMenuItem.add(changeDetailsMenuItem);

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        logoutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gymwatch/view/images/logoutSmall.png"))); // NOI18N
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        membershipTypeMenuItem.add(logoutMenuItem);

        jMenuBar1.add(membershipTypeMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        LoginDialog ld = new LoginDialog();
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ld.setVisible(true);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void changeDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        addChangeDetailsPage();
    }

    private void changeDetailsMenuItemMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void currentClientsBttnMouseClicked(java.awt.event.MouseEvent evt) {
        addCurrentClientsPage();
    }

    private void userBttnMouseClicked(java.awt.event.MouseEvent evt) {
        /* setContentPane(new Users().mainPanel);
        remove(mainPanel);
        revalidate();
        repaint(); */
        addUsersPage();
    }//GEN-LAST:event_userBttnMouseClicked

    private void coachBttnMouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void clientsBttnMouseClicked(java.awt.event.MouseEvent evt) {
        addClientPage();
    }//GEN-LAST:event_clientsBttnMouseClicked

    private void addOfferBttnMouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void membershipReportBttnMouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void menuBttnMouseClicked(java.awt.event.MouseEvent evt) {
        if(navPanel.isVisible()==false){
            navPanel.setVisible(true);
        }else{
            navPanel.setVisible(false);
        }
    }
    
    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        //new GymWatchDashboard(userSelect,username);
    	//new GymWatchDashboard( baseController);
        dispose();
    }//GEN-LAST:event_homeMenuItemActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        //new Dashboard(userSelect,username);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void subscriptionBttnMouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        addAboutPage();
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
            java.util.logging.Logger.getLogger(GymWatchDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GymWatchDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GymWatchDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GymWatchDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    public void NotForNormalUser() {
        navPanel.remove(userBttn);
        navPanel.remove(userLab);
    }
	
	

}
