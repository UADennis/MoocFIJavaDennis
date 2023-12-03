
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class MisplacingBox extends Box {
    
    private ArrayList<Item> magic = new ArrayList<>();
    
    public MisplacingBox(){
        
    }

    @Override
    public void add(Item item) {
        magic.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    @Override
    public void add(ArrayList<Item> items) {
        super.add(items); //To change body of generated methods, choose Tools | Templates.
    }
    
}
