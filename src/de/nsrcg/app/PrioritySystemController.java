package de.nsrcg.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class PrioritySystemController {
	
	private int[][] arrayOfDeath = new int[][]{
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0}
		};

	@FXML protected void onClick(ActionEvent event) {
		ToggleButton test = (ToggleButton)event.getSource();
		
		int row = (int) test.getId().substring(0, 1).charAt(0) - 97;
		int column = (int) test.getId().substring(1, 2).charAt(0) - 97;
		
		System.out.println(row + " " + column);
		
		arrayOfDeath[row][column] = 1;
		
		for (int i = 0; i < arrayOfDeath.length; i++) {
			for (int j = 0; j < arrayOfDeath.length; j++) {
				System.out.print(arrayOfDeath[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
}
