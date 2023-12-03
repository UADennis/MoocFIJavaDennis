/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Organism implements Movable {
    
    private int xCord;
    private int yCord;
    
    public Organism(int x, int y){
        this.xCord = x;
        this.yCord = y;
        
    }
    
    public String toString(){
        return "x: " + this.xCord + "; y: " + yCord; 
    }

    @Override
    public void move(int dx, int dy) {
        this.xCord += dx;
        this.yCord += dy;
    }
    
}
