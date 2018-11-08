package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * public class for Main
 * creates a main stage, creates a new game
 * calls MainMenu.fxml and sets scene to stage
 * @author Jonathan Sutton pfj031
 */
public class Main extends Application {
	
	public static Stage stage;
	//public static Game game = new game();
	
	@Override
	public void start(Stage primaryStage) {
		
		stage = primaryStage;
		
		try {
			Parent root = FXMLLoader.load( getClass().getResource("view/MainMenu.fxml") );
			
			primaryStage.setScene(new Scene(root, 800, 600));
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
