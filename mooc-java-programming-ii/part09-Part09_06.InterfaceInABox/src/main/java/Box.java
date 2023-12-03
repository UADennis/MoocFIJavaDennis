
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
public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> store = new ArrayList<>();
    
    public Box(double capacity){
        this.capacity = capacity;
    }
    
    public void add(Packable pack){
        if(capacity < pack.weight()){
            return;
        }
        store.add(pack);
        capacity -= pack.weight();
        
    }

    @Override
    public double weight() {
    double weight = 0;
    for(Packable pack: store){
    weight += pack.weight();
    }
    return weight;
    }
    
    public String toString(){
        return "Box: " + store.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
}
