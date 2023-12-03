package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dict;

    @Override
    public void init() throws Exception {
        this.dict = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        PracticeView practiceView = new PracticeView(dict);
        InputView inputView = new InputView(dict);

        BorderPane highLevel = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(10,10,10,10));

        Button mode1 = new Button("Enter new words");
        Button mode2 = new Button("Practice");

        menu.setSpacing(10);
        menu.getChildren().addAll(mode1, mode2);

        highLevel.setTop(menu);

        mode1.setOnAction((event) -> {

            highLevel.setCenter(inputView.getView());
        });
        
        mode2.setOnAction((event) -> {

            highLevel.setCenter(practiceView.getView());
        });
        highLevel.setCenter(inputView.getView());
        Scene scn = new Scene(highLevel);
        stage.setScene(scn);
        stage.show();

    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
        
    }
}
