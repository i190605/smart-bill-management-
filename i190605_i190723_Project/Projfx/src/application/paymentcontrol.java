package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;

import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.FileWriter;


public class paymentcontrol extends control{
	
	private Stage stage;
	private Scene scene;
	private Robot root;
	
	@FXML
	private AnchorPane scenePane;
	
	@FXML
	private TextField creditnum;
	
	@FXML
	private TextField inpbill;
	
	@FXML
	TextField t;
	
	@FXML
	TextField t1;
	@FXML
	TextField t2;
	@FXML
	TextField t3;
	
	@FXML
	Label l;
	
	static user obj=new user();
	
	static int cnum,pbill;
	 
	public void billset(ActionEvent e)
	{
		t.setText(String.valueOf(Total_Bill));
	}
	
	public void switchpay(ActionEvent event) throws IOException{
		int a,b;
		 cnum= Integer.parseInt(creditnum.getText());
		 obj.setC_num(cnum);
		 System.out.println("Credit Card #: " + obj.getC_num());
		
		pbill = Integer.parseInt(inpbill.getText());
		obj.setCbill(pbill);
		System.out.println("Paid Bill: " + obj.getCbill());
		a=obj.getC_num();
		b=obj.getCbill();
		if(pbill > Total_Bill || pbill < Total_Bill)
		{
			l.setText("Invalid Amount");
			
			throw new InsufficientFundsEception();
		}
		
		else if(pbill == Total_Bill)
		{
			l.setText("Amount Valid");
		}
		
	}
	
	public void receipt(ActionEvent event) throws IOException{
					
		Parent root = FXMLLoader.load(getClass().getResource("receipt.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void recset(ActionEvent e)
	{
		t1.setText(String.valueOf(Total_Bill));
	
		t2.setText(String.valueOf(pbill));
		System.out.println("Paid Bill 2:" + pbill);
		
		t3.setText(String.valueOf(cnum));
		System.out.println("Credit Card 2:" + cnum);
		
		try {
		    FileOutputStream fos = new FileOutputStream ("recipt.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(pbill);
		    oos.writeObject(cnum);
		    
		    fos.close();
		  } 
		  catch (Exception e1) {
		    System.out.println(e1);   
		  }
		
	}
	
	public void Mmenu(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public void exit(ActionEvent event) throws IOException{
		
		stage = (Stage) scenePane.getScene().getWindow();
		stage.close();
	}

}
