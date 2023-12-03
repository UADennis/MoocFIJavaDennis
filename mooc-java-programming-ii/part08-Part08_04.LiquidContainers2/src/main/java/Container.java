/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Container {
    private int content = 0;
    private String name;
    
    // Constructor
    public Container(){
        
        
    }
    
    public void add(int amount){
        if (amount < 0){
            return;
        }
        if(content < 100 && content + amount <100){
            content += amount;
            return;
        } 
        if(content + amount > 100){
            content = 100;
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        if(content - amount < 0){
            content = 0;
            return;
        } else {
            content -= amount;
        }
        
            
        
    }
    
    public int contains(){
        return content;
    }
    
    public String getName(){
        return name;
    }
    public String toString(){
        return this.content + "/100";
    }
}
