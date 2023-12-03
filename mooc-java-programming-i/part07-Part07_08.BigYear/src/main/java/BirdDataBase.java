
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
public class BirdDataBase {
    
    private ArrayList<Bird> birds;
    
    public BirdDataBase(){
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latin){
        Bird bird = new Bird(name, latin);
        birds.add(bird);
        
        
    }
    
    public void printAll(){
        for(Bird m: birds){
            System.out.println(m.toString());
        }
    }
    
    public void printOne(String input){
        int counter = 0;
        for(Bird m: birds){
            if(m.name.equals(input)){
                System.out.println(m.toString());
                counter++;
            }
            
        }
        if(counter == 0){
                System.out.println("Not a bird!");
        
    }
    }
    
    public void observe(String input){
        int counter = 0;
        for(Bird m: birds){
            if(m.name.equals(input)){
                counter++;
                m.observation();
            } 
            
        }
        if(counter == 0){
                System.out.println("Not a bird!");
            }
    }
    
    
 
    
}
