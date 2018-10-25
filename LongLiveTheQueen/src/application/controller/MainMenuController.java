package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * MainMenuController controls the MainMenu.fxml
 * @author Jonathan Sutton pfj031
 */
public class MainMenuController implements EventHandler<ActionEvent>{
	
	/**
	 * when the start button is pressed
	 * the handle loads the game fxml
	 */
	public void handle(ActionEvent event) {

			loadGame();
	}
	
	/**
	 * loadGame() loads the next scene and then sets
	 * that scene to the current stage
	 */
	public void loadGame() {
		
		// load the library view
		Parent root;
				
		try {
			root = FXMLLoader.load( getClass().getResource("../view/Game.fxml") );
			Main.stage.setScene( new Scene(root, 800, 600) );
			Main.stage.show();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * initialize() used to set any defaults
	 * in the fxml
	 */
	public void initialize(){
		
	}
	
}