package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class AdminLoginController implements Initializable{
	
	@FXML
	private Label msg;
	@FXML
	private PasswordField pass;

	public void getpassword(ActionEvent event) throws IOException 
	{
		String password = pass.getText();
		System.out.println(password);
		if(password.equals("password"))
			{
			System.out.println("Correct");
			msg.setText("valid");
			}
			
		else
		{
			System.out.println("Incorrect");
			msg.setText("Invalid!");
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
