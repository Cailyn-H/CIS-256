package CIS256;
//Cailyn Hyun. 9/20/2021.
//Listing 4.8
//FahrenheitConverter.java       Author: Lewis/Loftus
//
//Demonstrates the use of a TextField and a GridPane.
//************************************************************
//************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FahrenheitConverter extends Application
{
	//--------------------------------------------------------
	//  Launches the temperature converter application.
	//--------------------------------------------------------
	public void start(Stage primaryStage)
	{
		Scene scene = new Scene(new FahrenheitPane(), 300, 150);

		primaryStage.setTitle("Fahrenheit Converter");
		primaryStage.setScene(scene);
		primaryStage.show();
	} 
} 

