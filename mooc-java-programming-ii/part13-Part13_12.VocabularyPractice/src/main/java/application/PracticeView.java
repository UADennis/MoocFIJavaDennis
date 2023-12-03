/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Dennis Mayer
 */
public class PracticeView {

    private Dictionary dict;
    private String word;

    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.getRandomWord();
    }

    public Parent getView() {

        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        
        TextField userInput = new TextField();

        Button contr = new Button("Check");

        Label feedback = new Label("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        layout.add(wordInstruction, 0, 0);
        layout.add(userInput, 0, 1);
        layout.add(contr, 0, 2);
        layout.add(feedback, 0, 3);
        
        contr.setOnAction((event) ->{
            if(userInput.getText().equals(dict.get(word))){
                feedback.setText("Correct");
                
              
                
                
            } else {
                feedback.setText("Incorrect! The translation of the word '" + this.word + "' is '" + dict.get(word) + "'");
                return;
            }
            
            word = dict.getRandomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'");
            userInput.clear();
            
            
        });

        return layout;

        
        
    
    }
}
