package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button butt = new Button("I am a button");
        
        Label lbl = new Label("You spin my head right round");
        
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(lbl);
        componentGroup.getChildren().add(butt);
        
        Scene view = new Scene(componentGroup);
        
        stage.setScene(view);
        stage.setTitle("Button and label");
        stage.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
