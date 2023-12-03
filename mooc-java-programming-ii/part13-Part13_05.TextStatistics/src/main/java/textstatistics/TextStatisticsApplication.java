package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane siteLayout = new BorderPane();
        siteLayout.setCenter(new TextArea());
        HBox prints = new HBox();
        prints.setSpacing(10);
        prints.getChildren().add(new Label("Letters: 0"));
        prints.getChildren().add(new Label("Words: 0"));
        prints.getChildren().add(new Label("The longest word is:"));
        siteLayout.setBottom(prints);
        
        Scene scn = new Scene(siteLayout);
        stage.setScene(scn);
        stage.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
