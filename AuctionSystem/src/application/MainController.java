package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label msg;
	
	public void function(ActionEvent event)
	{
		msg.setText("yolo");
		System.out.println("Button Pressed");
	}

}
