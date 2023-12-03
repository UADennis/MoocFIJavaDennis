
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> stem = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(ArrayList<Item> items) {
        for (Item its : items) {
            if(its.getWeight() <= capacity){
                capacity -= its.getWeight();
                stem.add(its);
            }

        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(stem.contains(item)){
            return true;
        } else {
            return false;
        }
    }

    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            stem.add(item);
            capacity -= item.getWeight();
        }

    }

}
