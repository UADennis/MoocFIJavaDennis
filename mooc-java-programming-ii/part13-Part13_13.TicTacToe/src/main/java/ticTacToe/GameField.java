/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dennis Mayer
 */
public class GameField {
    
    public GameField(){
        
    }
    
    public Parent getView(){
        
        GridPane layout = new GridPane();
        ArrayList<Button> buttons = new ArrayList<>();
        for(int i = 0; i<9; i++){
            Button butt = new Button();
            butt.setFont(Font.font("Monospaced", 40));
            butt.setId(Integer.toString(i));
            buttons.add(butt);
        }
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        layout.add(buttons.get(0), 0, 0);
        layout.add(buttons.get(1), 1, 0);
        layout.add(buttons.get(2), 2, 0);
        layout.add(buttons.get(3), 0, 1);
        layout.add(buttons.get(4), 1, 1);
        layout.add(buttons.get(5), 2, 1);
        layout.add(buttons.get(6), 0, 2);
        layout.add(buttons.get(7), 1, 2);
        layout.add(buttons.get(8), 2, 2);
        
        return layout;
        
        
        
       
        
        
    }
    
}
