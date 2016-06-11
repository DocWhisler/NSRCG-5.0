package de.nsrcg.app;

import java.io.IOException;
import java.sql.SQLException;

import de.nsrcg.app.db.NsrcgClient;
import de.nsrcg.app.view.NsrcgMainViewController;
import de.nsrcg.app.view.PrioritySystemController;
import de.nsrcg.app.view.RacesChooseController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Nsrcg extends Application {

	private Stage primaryStage;
	private NsrcgClient client;
	
	@Override
	public void start(Stage primaryStage) throws Exception {		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("NSRCG 5.0");		
		
		try {
			this.client = new NsrcgClient(false);
		} catch (Exception e) {
			System.out.println("Verbindungsaufbau fehlgeschlagen");
			e.printStackTrace();
		}	
		
		this.showMainView();
	}
	
	public void showMainView() {		
		try {
			FXMLLoader loader = new FXMLLoader(Nsrcg.class.getResource("view/NsrcgMainView.fxml"));
			Pane pane = loader.load();
		
			NsrcgMainViewController controller = loader.getController();
			controller.setMain(this);
		
			Scene scene = new Scene(pane);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();			
		
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	public void showPrioritySystem() {
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Nsrcg.class.getResource("view/PrioritySystemView.fxml"));
			Pane pane = loader.load();

			PrioritySystemController controller = loader.getController();
			controller.setMain(this);
		
			Scene scene = new Scene(pane);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
	
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	public void showRaceChoose() {
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Nsrcg.class.getResource("view/RasenauswahlView.fxml"));
			Pane pane = loader.load();

			RacesChooseController controller = loader.getController();
			controller.setMain(this);
		
			Scene scene = new Scene(pane);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
	
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	public void exitProgramm(){
		try {
			client.connectionClose();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		this.primaryStage.close();
	}
	
	public static void main(String[] args) {	
		launch(args);
	}
}
