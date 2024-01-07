package application;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class test02 extends Application {
    @Override
    public void start(Stage stage) {
    	
    	StackPane root = new StackPane();
    	Scene scene = new Scene(root,420,420);
    	Button btn01 = new Button("Click me");
    	
    	root.getChildren().add(btn01);
    	btn01.setOnAction(new EventHandler <ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				System.out.println("Hello World");
				
			}
    	});
    	
    	stage.setTitle("Hello Macha");
    	stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

