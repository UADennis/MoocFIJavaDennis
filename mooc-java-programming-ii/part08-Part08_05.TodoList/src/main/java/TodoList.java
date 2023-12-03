
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
public class TodoList {
    
    private ArrayList<String> tasks = new ArrayList<>();
    
    
    public TodoList(){
        
    }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void remove(int number){
        tasks.remove(number-1);
    }
    
    public void print(){
        int counter = 0;
        for(String content: tasks){
            counter++;
            System.out.println(counter + ": " + content);
        }
    }
    
    
    
    
    
}
