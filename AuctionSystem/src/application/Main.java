package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception
	{ 
		Button item = new Button("ITEM");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> System.exit(0));

		item.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				 System.out.println("Hi");
			}
			
		});
		primaryStage.setTitle("Auction System");
		VBox layout = new VBox();
		layout.getChildren().addAll(item,exit);
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
