package com.bms;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class BMS extends Application {
	
	static Stage original_stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Book Management System");
			primaryStage.setResizable(false);
			primaryStage.show();
			original_stage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeView(String inputfile) throws IOException {
		Parent root = FXMLLoader.load(BMS.class.getResource(inputfile));
		var scene = new Scene(root);
		original_stage.hide();
		original_stage.setScene(scene);
		original_stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
