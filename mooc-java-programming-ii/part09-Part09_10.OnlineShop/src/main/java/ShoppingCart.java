
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class ShoppingCart {

    private Map<String, Item> content;

    public ShoppingCart() {
        this.content = new HashMap<>();
    }

    public void add(String product, int price) {
        if(content.containsKey(product)){
            content.get(product).increaseQuantity();
            return;
        
        }
        content.putIfAbsent(product, new Item(product, 1, price));

    }

    public int price() {
        Collection<Item> test = content.values();
        int total = 0;
        for (Item ite : test) {
            total += ite.price();
        }
        return total;
    }

    public void print() {
        Collection<Item> test = content.values();
        for(Item it : test){
            System.out.println(it);
        }

    }

}
