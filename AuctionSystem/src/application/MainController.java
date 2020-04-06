package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
	private Label msg;
	private AnchorPane rootpane;
	public void adminlogin(ActionEvent event) throws Exception
	{
		//msg.setText("yolo");
		Parent pane;
		System.out.println("To enter starting bidding prices");
		try
		{
			pane = (AnchorPane) FXMLLoader.load(getClass().getResource("Admin_login.fxml"));
			Scene scene = new Scene(pane);
			Stage curStage = (Stage)rootpane.getScene().getWindow();
			curStage.setScene(scene);
		}catch(IOException e)
		{
			
		}
		
	}
	
	@FXML
	public void bid(ActionEvent event)
	{
		//msg.setText("yolo");
		System.out.println("Bid ");
	}
	
	@FXML
	public void sell(ActionEvent event)
	{
		//msg.setText("yolo");
		System.out.println("Sold");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
