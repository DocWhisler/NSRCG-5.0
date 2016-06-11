package de.nsrcg.app.view;

import de.nsrcg.app.Nsrcg;
import de.nsrcg.app.constances.CharacterGender;
import de.nsrcg.app.models.shadowrun5.SRCharacterOriginal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class NsrcgMainViewController {
	
	private Nsrcg main;	
	private SRCharacterOriginal currentCharacter = new SRCharacterOriginal();    	
	
    @FXML private RadioButton radioMale;
    @FXML private RadioButton radioFemale;
    @FXML private ToggleGroup geschlecht;
    @FXML private TextField firstName;
    @FXML private TextField familyName;
    @FXML private TextField streetName;    
    @FXML private TextField age;
    @FXML private TextField weight;
    @FXML private TextField size;
    @FXML private TextField streetCall;
    @FXML private TextField description;    
	
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
    	currentCharacter.setAge(age.getText());
    	currentCharacter.setWeight(weight.getText());
    	currentCharacter.setSize(size.getText());
    	currentCharacter.setStreetCall(streetCall.getText());
    	currentCharacter.setDescription(description.getText());
    	
        currentCharacter.show();
        
        main.showPrioritySystem();
    }  
    
    @FXML
    protected void exitButton(ActionEvent event)
    {
    	main.exitProgramm();
    }
    
    public void setMain(Nsrcg main) {
		this.main = main;
	}
}
