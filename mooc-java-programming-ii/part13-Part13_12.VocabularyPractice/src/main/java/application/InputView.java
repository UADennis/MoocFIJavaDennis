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
public class InputView {
    
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        
        GridPane layout = new GridPane();
        
        Label descriptorOne = new Label("Word");
        
        TextField wordInput = new TextField();
        
        Label descriptorTwo = new Label("Translation");
        
        TextField translationInput = new TextField();
        
        Button apply = new Button("Add the word pair");
        
        apply.setOnAction((event) ->{
            String word = wordInput.getText();
            String translation = translationInput.getText();
            this.dictionary.add(word, translation);
            
            wordInput.clear();
            translationInput.clear();
            
        });
        
        layout.add(descriptorOne, 0, 0);
        layout.add(wordInput, 0, 1);
        layout.add(descriptorTwo, 0, 2);
        layout.add(translationInput,0, 3);
        layout.add(apply, 0, 4);
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        
        
        
        
        return layout;
    }
    
}
