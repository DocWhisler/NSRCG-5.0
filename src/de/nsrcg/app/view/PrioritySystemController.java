package de.nsrcg.app.view;

import de.nsrcg.app.Nsrcg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;

public class PrioritySystemController {
	
	public Nsrcg main;		

	private int[][] arrayOfDeath = new int[][]{
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0}
		};

	@FXML 
	protected void onClick(ActionEvent event) {
		ToggleButton test = (ToggleButton)event.getSource();
		
		int row = (int) test.getId().substring(0, 1).charAt(0) - 97;
		int column = (int) test.getId().substring(1, 2).charAt(0) - 97;
		
		// Check ob in der Zeile schon was ist
		for (int i = 0; i < arrayOfDeath.length; i++) {
			if(arrayOfDeath[row][i] == 1) {
				arrayOfDeath[row][i] = 0;
				char rowChar = (char) (row + 97);
				char columnChar = (char) (i + 97);
				Scene scene = test.getParent().getScene();
				ToggleButton tb = (ToggleButton) scene.lookup("#" + rowChar + columnChar);
				tb.setSelected(false);
			}
		}	
		// Check ob in der Spalte schon was ist
//		for (int i = 0; i < arrayOfDeath.length; i++) {
//			if(arrayOfDeath[i][column] == 1) {
//				arrayOfDeath[i][column] = 0;
//				char rowChar = (char) (i + 97);
//				char columnChar = (char) (column + 97);
//				Scene scene = test.getParent().getScene();
//				ToggleButton tb = (ToggleButton) scene.lookup("#" + rowChar + columnChar);
//				tb.setSelected(false);
//			}
//		}	
		// Neuen Punkt setzen. 
		arrayOfDeath[row][column] = 1;
		
//		for (int i = 0; i < arrayOfDeath.length; i++) {
//			for (int j = 0; j < arrayOfDeath.length; j++) {
//				System.out.print(arrayOfDeath[i][j] + " ");
//			}
//			System.out.println("");
//		}		
	}
	
	@FXML
	protected void nextButton() {		
		this.main.showRaceChoose();
	}
	
	@FXML
	protected void backButton() {
		main.showMainView();
	}
	
	public void setMain(Nsrcg main) {
		this.main = main;
	}	
}
