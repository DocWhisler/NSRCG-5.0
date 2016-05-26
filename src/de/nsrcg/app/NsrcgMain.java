package de.nsrcg.app;

import java.io.IOException;

import de.nsrcg.app.view.NsrcgMainViewController;
import de.nsrcg.app.view.PrioritySystemController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NsrcgMain extends Application {

	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("NSRCG 5.0");
		
		showMainView();
	}

	public void showMainView() {		
		try {
			FXMLLoader loader = new FXMLLoader(NsrcgMain.class.getResource("view/NsrcgMainView.fxml"));
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
			loader.setLocation(NsrcgMain.class.getResource("view/PrioritySystemView.fxml"));
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

	public void exitProgramm(){
		this.primaryStage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
