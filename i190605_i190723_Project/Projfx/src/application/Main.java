package application;
import javafx.application.Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	//Inside the main() method, we can launch our application using Application.launch().
	public static void main(String[] args) {
		launch(args);
		}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			//Parent root = FXMLLoader.load(getClass().getResource("intro.fxml"));
			
			Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
			Scene scene1= new Scene(root); //create a scene
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.setTitle("Billing Management System");
			        
			primaryStage.show(); // It is hidden by default.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}      
	}



