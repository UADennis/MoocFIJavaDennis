package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private boolean turn = false;
    private String[][] arr = new String[3][3];

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane highLevel = new BorderPane();
        VictoryScreen scr = new VictoryScreen();
        Label state = new Label("Turn: X");
        state.setFont(Font.font("Monospaced", 40));
        GridPane layout = new GridPane();
        ArrayList<Button> buttons = new ArrayList<>();
        BorderPane victroyScreenLayout = (BorderPane)scr.getView();
        victroyScreenLayout.setMinSize(300, 300);
        Scene victroyScene = new Scene(victroyScreenLayout);

        for (int i = 0; i < 9; i++) {
            Button butt = new Button();
            butt.setFont(Font.font("Monospaced", 40));
            butt.setMinSize(butt.getFont().getSize() * 2 , butt.getFont().getSize() * 2 );
            butt.setId(Integer.toString(i));
            buttons.add(butt);
        }

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(buttons.get(0), 0, 0);
        layout.add(buttons.get(1), 1, 0);
        layout.add(buttons.get(2), 2, 0);
        layout.add(buttons.get(3), 0, 1);
        layout.add(buttons.get(4), 1, 1);
        layout.add(buttons.get(5), 2, 1);
        layout.add(buttons.get(6), 0, 2);
        layout.add(buttons.get(7), 1, 2);
        layout.add(buttons.get(8), 2, 2);

        for (Button butti : buttons) {
            butti.setOnAction((event) -> {

                if (butti.getText().equals("O") || butti.getText().equals("X")) {
                    return;
                }

                String s = "";

                if (turn == false) {
                    s = "X";
                    butti.setText(s);
                    turn = true;
                    state.setText("Turn: O");

                } else {
                    s = "O";
                    turn = false;
                    butti.setText(s);

                    state.setText("Turn: X");
                }

                if (checkForWinner(buttons, 0, 1, 2) || checkForWinner(buttons, 0, 3, 6) ||
                    checkForWinner(buttons, 3, 4, 5) || checkForWinner(buttons, 6, 7, 8) ||
                    checkForWinner(buttons, 1, 4, 7) || checkForWinner(buttons, 2, 5, 8) ||
                    checkForWinner(buttons, 0, 4, 8) || checkForWinner(buttons, 2, 4, 6)) {
                    stage.setScene(victroyScene);
                }
            });
        }
        highLevel.setTop(state);
        highLevel.setCenter(layout);
        Scene act = new Scene(highLevel);
        stage.setScene(act);
        stage.show();
    }

    // Helper method to check for a winner based on the given indices
    private boolean checkForWinner(ArrayList<Button> buttons, int index1, int index2, int index3) {
        String text = buttons.get(index1).getText();
        return !text.equals("") && text.equals(buttons.get(index2).getText()) && text.equals(buttons.get(index3).getText());
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }
}
