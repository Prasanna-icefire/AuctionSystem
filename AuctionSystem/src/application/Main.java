package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;



public class Main extends Application {
	
	Button item;
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Auction System");
		item = new Button("Item");
		StackPane layout = new StackPane();
		layout.getChildren().add(item);
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
