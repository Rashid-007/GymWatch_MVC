package com.gymwatch.view;

import javax.swing.JPanel;

import com.gymwatch.controller.GymWatchController;

public class GymWatchPanel extends JPanel {
	private GymWatchController baseController;
	
	public GymWatchPanel(GymWatchController baseController){
		this.baseController=baseController;
		
		setupLayout();
		setupPanels();
		setupListeners();
	}
	private void setupLayout(){
		
	}
	private void setupPanels(){
		
	}
	private void setupListeners(){
		
	}

}
