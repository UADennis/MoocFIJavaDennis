/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dennis Mayer
 */
public class VictoryScreen {
    
    public VictoryScreen(){
        
    }
    
    public Parent getView(){
        BorderPane layout = new BorderPane();
        Label msg = new Label("The end!");
        msg.setFont(Font.font("Monospaced", 70));
        msg.setPadding(new Insets(10,10,10,10));
        layout.setTop(msg);
        
        return layout;
    }
    
    
    
}
