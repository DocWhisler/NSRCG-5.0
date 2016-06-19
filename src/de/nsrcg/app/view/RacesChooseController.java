package de.nsrcg.app.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import de.nsrcg.app.Nsrcg;
import de.shadowrunrpg.nscrg.core.GeneratorCore;
import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.dto.Metarace;
import de.shadowrunrpg.nscrg.core.request.MetaModelRequest;
import de.shadowrunrpg.nscrg.core.response.MetaModelResponse;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class RacesChooseController implements Initializable {

	public Nsrcg main;

	private GeneratorCore core = new GeneratorCore();

	@FXML
	private ComboBox<String> raceChoose;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MetaModelRequest request = new MetaModelRequest(CategoryType.A, CategoryType.A, CategoryType.A, CategoryType.A, CategoryType.A);
		MetaModelResponse response = this.core.getMetaModelForCategories(request);
		List<String> uiRaceList = new ArrayList<String>();
		for (Metarace metarace : response.getRaceList()) {
			uiRaceList.add(metarace.getLanguage());
		}

		ObservableList<String> options = FXCollections.observableArrayList(uiRaceList);
		raceChoose.setItems(options);

	}

	public void setMain(Nsrcg main) {
		this.main = main;
	}
}
