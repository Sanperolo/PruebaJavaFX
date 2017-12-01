package application;
	
/**
 * @author Mi PC
 * @version 1.0
 * @Date 1/12/17
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class MainFX extends Application {
	
private AnchorPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../views/Login.fxml"));
			rootLayout = (AnchorPane) loader.load();
						
						
			// BorderPane root = new BorderPane();
			Scene scene = new Scene(rootLayout,500,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Inicia la App
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}