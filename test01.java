package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;



public class test01 extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,Color.CRIMSON);
		Image icon = new Image("javafx.jpg");
		
		stage.setTitle("Test");
		stage.getIcons().add(icon);
		stage.setWidth(420);
		stage.setHeight(420);
		stage.setResizable(false);
		stage.setX(20);
		stage.setY(20);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Your an idiot... Haa haa \n press 's' to exit ");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("s"));
		
		stage.setScene(scene);
		stage.show();
	}
	

}
