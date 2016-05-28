package de.nsrcg.app.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import de.nsrcg.app.NsrcgMain;
import de.shadowrunrpg.nscrg.core.GeneratorCore;
import de.shadowrunrpg.nscrg.core.costance.ListType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class RacesChooseController  implements Initializable {
	
	public NsrcgMain main; 
	@FXML
	ComboBox<String> raceChoose;
	private GeneratorCore core = new GeneratorCore();
    
    public void setMain(NsrcgMain main) {
		this.main = main;
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<String> raceList = this.core.getItemList(ListType.metaraces);
		
		ObservableList<String> options = 
			    FXCollections.observableArrayList(raceList);
		raceChoose.setItems(options);
		
	}
}
