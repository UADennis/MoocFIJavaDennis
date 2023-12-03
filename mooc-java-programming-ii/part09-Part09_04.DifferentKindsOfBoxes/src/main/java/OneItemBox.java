
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
public class OneItemBox extends Box {
    
    private ArrayList<Item> stem = new ArrayList<>();

    @Override
    public void add(ArrayList<Item> items) {
        if(stem.isEmpty()){
            super.add(items);
        }
        
    }
    
    public boolean isInBox(Item item) {
        if(stem.contains(item)){
            return true;
        } else {
            return false;
        }
    }

    public void add(Item item) {
        if (stem.isEmpty()) {
            stem.add(item);
        }

    }
    
    
    
    
}
