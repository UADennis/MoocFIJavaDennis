
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Herd implements Movable {
    
    private List<Movable> test;
    
    public Herd(){
       test = new ArrayList<>();
    }
    
    public String toString(){
        String out = "";
        for(Movable mov:test){
            out += "\n" + mov.toString();
        }
        return out;
    }
    public void addToHerd(Movable movable){
        test.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable mov: test){
            mov.move(dx, dy);
        }
    }
    
}
