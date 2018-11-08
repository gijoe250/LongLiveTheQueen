package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * GameController controls the Game.fxml
 * @author Jonathan Sutton pfj031
 */
public class GameController implements EventHandler<ActionEvent>{

	@FXML
	private ImageView T_1;
	@FXML
	private ImageView T_2;
	@FXML
	private ImageView T_3;
	@FXML
	private ImageView T_4;
	@FXML
	private ImageView T_5;
	@FXML
	private ImageView T_6;
	@FXML
	private ImageView T_7;
	@FXML
	private ImageView T_8;
	@FXML
	private ImageView T_9;
	@FXML
	private ImageView T_10;
	
	@FXML
	private ImageView B_1;
	@FXML
	private ImageView B_2;
	@FXML
	private ImageView B_3;
	@FXML
	private ImageView B_4;
	@FXML
	private ImageView B_5;
	@FXML
	private ImageView B_6;
	@FXML
	private ImageView B_7;
	@FXML
	private ImageView B_8;
	@FXML
	private ImageView B_9;
	@FXML
	private ImageView B_10;
	
	@FXML
	private Label diceResult;
	
	@FXML
	private Label currentPlayer;
	
	/**
	 * initialize() used to set any defaults
	 * in the fxml
	 */
	public void initialize(){
		
		Main.game.loadImages();
		T_1.setImage(Main.game.p1.getCharacters.getPicBack());
		
	}
	
	/**
	 * handle()
	 */
	@Override
	public void handle(ActionEvent event) {
		
		loadMainMenu();
	}
	
	public void diceRoll(ActionEvent event){
		diceResult.setValue( Main.game.rollDice());
		
		if(Main.game.setPlayerTurn == false){
			Main.game.setPlayerTurn = true;
		}else{
			Main.game.setPlayerTurn = false;
		}
	}
	
	/**
	 * loadMainMenu() loads the next scene and then sets
	 * that scene to the current stage
	 */
	public void loadMainMenu() {
		
		// load the library view
		Parent root;
				
		try {
			root = FXMLLoader.load( getClass().getResource("../view/MainMenu.fxml") );
			Main.stage.setScene( new Scene(root, 800, 600) );
			Main.stage.show();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}