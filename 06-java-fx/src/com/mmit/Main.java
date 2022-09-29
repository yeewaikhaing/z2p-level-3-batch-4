package com.mmit;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//1
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			//2 add to scene
			Scene scene = new Scene(root);
			// 3 add scene obj to stage
			primaryStage.setScene(scene);
			// call show() to display
			primaryStage.show();
			primaryStage.setResizable(false);
			primaryStage.setTitle("Employee Registration");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
