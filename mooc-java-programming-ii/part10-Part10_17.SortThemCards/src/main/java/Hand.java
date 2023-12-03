
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards = new ArrayList<>();
    
    public Hand(){
        
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        Iterator<Card> it = cards.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
        print();
    }
    
    public int value(){
         int values = 0;
        for(Card card: cards){
           values += card.getValue();
        }
        return values;
    }
    
    

    @Override
    public int compareTo(Hand o) {
       return this.value() - o.value();
    }
    
    public void sortBySuit(){
        
        Collections.sort(cards, new BySuitInValueOrder());
        print();
        
    }
    
    
    
    
    
    
    
    
    
}
