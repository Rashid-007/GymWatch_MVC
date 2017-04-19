package com.gymwatch.controller;

import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.gymwatch.model.Client;
import com.gymwatch.model.GymResourceFactory;
import com.gymwatch.view.GymWatchDashboard;
import com.gymwatch.view.LoginDialog;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
//import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

public class GymWatchController {
	private GymResourceFactory factory;
	private Client client;
	private GymWatchDashboard appFrame;
	private LoginDialog login;
	public GymWatchController(){
		factory=new GymResourceFactory();
		//client = new Client();
	}
	public GymResourceFactory getFactory(){
		return factory;
	}
	public Client getClient(){
		return client;
	}
	public void startFrame(String user, String username){
		appFrame=new GymWatchDashboard(this);
	}
	public void start(){
		try{
			Properties p=new Properties();
			//p.put("logoString","IMS");
			HiFiLookAndFeel.setCurrentTheme(p);
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");  
			//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");  
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
			e.printStackTrace();
		}
		LoginDialog ld=new LoginDialog(this);
		ld.setLocationRelativeTo(null);
		ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ld.setVisible(true);
	}
}
