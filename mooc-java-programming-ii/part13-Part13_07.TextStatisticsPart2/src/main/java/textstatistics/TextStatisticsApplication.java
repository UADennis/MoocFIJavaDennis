package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane siteLayout = new BorderPane();
        TextArea txt = new TextArea();
        siteLayout.setCenter(txt);
        HBox prints = new HBox();
        prints.setSpacing(10);
        Label one = new Label("Letters: 0");
        Label two = new Label("Words: 0");
        Label three = new Label("The longest wors is:");
        prints.getChildren().add(one);
        prints.getChildren().add(two);
        prints.getChildren().add(three);
        siteLayout.setBottom(prints);
        txt.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            one.setText("Letters: " + characters);
            two.setText("Words: " + words);
            three.setText("The longest word is: " + longest);
            
            

        });
        

        Scene scn = new Scene(siteLayout);
        stage.setScene(scn);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
