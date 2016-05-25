package de.nsrcg.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NsrcgMain extends Application {

	private Stage primaryStage;
	private Pane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("NSRCG 5.0");
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(NsrcgMain.class.getResource("view/PrioritySystem.fxml"));
		this.mainLayout = loader.load();
		
		Scene scene = new Scene(mainLayout);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
