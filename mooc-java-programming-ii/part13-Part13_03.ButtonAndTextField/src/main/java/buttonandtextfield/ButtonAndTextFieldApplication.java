package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button butt = new Button("I am a button");
        TextField field = new TextField("hello");
      
        
        FlowPane pane = new FlowPane();
        pane.getChildren().add(butt);
        pane.getChildren().add(field);
        
        Scene stg = new Scene(pane);
        
        stage.setScene(stg);
        stage.show();
        
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
