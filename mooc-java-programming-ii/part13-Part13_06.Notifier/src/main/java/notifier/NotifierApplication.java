package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        VBox layout = new VBox();
        TextField input = new TextField();
        Button butt = new Button("Update");
        Label output = new Label();
        layout.getChildren().addAll(input, butt, output);
        
        butt.setOnAction((event) -> {
            output.setText(input.getText());
        });
        
        Scene scn = new Scene(layout);
        stage.setScene(scn);
        stage.show();
    }
    
    
    


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
