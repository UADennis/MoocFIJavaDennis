package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JokeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Button jk = new Button("Joke");
        Button ansr = new Button("Answer");
        Button expl = new Button("Explanation");
        
        HBox hbx = new HBox();
        hbx.getChildren().addAll(jk,ansr,expl);
        hbx.setSpacing(10);
        
        BorderPane layout = new BorderPane();
        
        layout.setTop(hbx);
        
        StackPane jkQuestion = createView("What do you call a bear with no teeth?");
        StackPane awnser = createView("A gummy bear.");
        StackPane explain = createView("Because its made out of gummy");
        
        jk.setOnAction((event) ->{
            layout.setCenter(jkQuestion);
            
            
        });
        
        ansr.setOnAction((event) ->{
            layout.setCenter(awnser);
            
        });
        
        expl.setOnAction((event) ->{
            layout.setCenter(explain);
            
        });
        
        layout.setCenter(jkQuestion);
        Scene crnt = new Scene(layout);
        stage.setScene(crnt);
        stage.show();
        
        
    }
    
    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
