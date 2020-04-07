package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BiddingController implements Initializable
{

	@FXML
	public void goHome(ActionEvent event) throws Exception
	{
		Parent pane;
		System.out.println("Bidding go to home");
		try
		{
			pane = (AnchorPane) FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(pane);
			Stage curStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			curStage.setScene(scene);
			curStage.show();
		}catch(IOException e)
		{
			System.out.println(e);
		}

	}
	
	void sqlconnect(String str,double val)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/auction","root","12345678");
			Statement stmt=con.createStatement();
			System.out.println("Connected Database");
			String query = "UPDATE auction SET PRESENT_BID = "+val+" ,STATUS = 'N'"+"WHERE ITEM_TYPE ='"+str+"';";
			stmt.execute(query);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@FXML
	public void Exxit(ActionEvent event) throws Exception
	{
		System.exit(0);
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
