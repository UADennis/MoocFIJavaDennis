package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label instruction = new Label("Enter your name and start.");
        TextField input = new TextField();
        Button submit = new Button("Start");
        

        GridPane layout = new GridPane();

        layout.add(instruction, 0, 0);
        layout.add(input, 0, 1);
        layout.add(submit, 0, 2);
        

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene first = new Scene(layout);

        Label greeting = new Label();

        StackPane welcomelay = new StackPane();
        welcomelay.setPrefSize(300, 180);
        welcomelay.getChildren().add(greeting);
        welcomelay.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomelay);
        
        submit.setOnAction((event) -> {
            greeting.setText("Welcome " + input.getText() + "!");
            stage.setScene(welcomeView);
            
        });
        
        stage.setScene(first);
        stage.show();
        

    }

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
