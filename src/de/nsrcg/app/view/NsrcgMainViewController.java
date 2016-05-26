package de.nsrcg.app.view;

import de.nsrcg.app.NsrcgMain;
import de.nsrcg.app.constances.CharacterGender;
import de.nsrcg.app.models.shadowrun5.SRCharacter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class NsrcgMainViewController {
	
	public NsrcgMain main;
	
	private SRCharacter currentCharacter = new SRCharacter();    	
	
    @FXML private RadioButton radioMale;
    @FXML private RadioButton radioFemale;
    @FXML private ToggleGroup geschlecht;
    @FXML private TextField firstName;
    @FXML private TextField familyName;
    @FXML private TextField streetName;
	
    @FXML 
    protected void nextButton(ActionEvent event) {    	
    	if(radioMale.isSelected()) {
    		currentCharacter.setCharGender(CharacterGender.male);
    	} else {
        	currentCharacter.setCharGender(CharacterGender.female);
    	}
    	
    	currentCharacter.setFirstName(firstName.getText());
    	currentCharacter.setFamilyName(familyName.getText());
    	currentCharacter.setStreetName(streetName.getText());
    	
        currentCharacter.show();
        
        main.showPrioritySystem();
    }  
    
    @FXML
    protected void exitButton(ActionEvent event)
    {
    	main.exitProgramm();
    }
    
    public void setMain(NsrcgMain main) {
		this.main = main;
	}
}
