package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane brP = new BorderPane();
        brP.setTop(new Label("First view!"));
        Button tnScnd = new Button("To the second view!");
        brP.setCenter(tnScnd);
        
        VBox vbox = new VBox();
        Button toThird = new Button("To the third view!");
        vbox.getChildren().add(toThird);
        vbox.getChildren().add(new Label("Second view!"));
        
        GridPane gpane = new GridPane();
        Button toFirst = new Button("To the first view!");
        gpane.add(new Label("Third view!"), 0, 0);
        gpane.add(toFirst, 1, 1);
        
        
        
        Scene first = new Scene(brP);
        Scene second = new Scene(vbox);
        Scene third = new Scene(gpane);
        
        
        
        
        tnScnd.setOnAction((event) ->{
            stage.setScene(second);
            
        });
        
        toThird.setOnAction((event) ->{
            stage.setScene(third);
            
        });
        
        toFirst.setOnAction((event) ->{
            stage.setScene(first);
            
        });
        
        stage.setScene(first);
        stage.show();
        
        
        
        
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
