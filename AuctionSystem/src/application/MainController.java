package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label msg;
	
	public void adminlogin(ActionEvent event)
	{
		//msg.setText("yolo");
		System.out.println("To enter starting bidding prices");
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

}
