package application;
import java.sql.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AddBidController implements Initializable{
	@FXML
	private TextField sculpamt;
	@FXML
	private Text scultext;
	@FXML
	public void getInitSculp(ActionEvent event)throws IOException
	{
		sqlconnect();
		System.out.print("Entered getINIT");
		String scamt = sculpamt.getText();
		scultext.setText("Saved");
		System.out.println(scamt);
	}
	
	@FXML
	private TextField coinamt;
	@FXML
	private Text cointext;
	@FXML
	public void getInitCoin(ActionEvent event)throws IOException
	{
		System.out.print("Entered getINIT");
		String coamt = coinamt.getText();
		cointext.setText("Saved");
		System.out.println(coamt);
	}
	
	@FXML
	private TextField othamt;
	@FXML
	private Text othtext;
	@FXML
	public void getInitOth(ActionEvent event)throws IOException
	{
		System.out.print("Entered getINIT");
		String otamt = othamt.getText();
		othtext.setText("Saved");
		System.out.println(otamt);
	}
	
	void sqlconnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","12345678");
			Statement stmt=con.createStatement();
			System.out.println("Connected Database");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@FXML
	public void eexit(ActionEvent event)throws IOException
	{
		System.exit(0);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
