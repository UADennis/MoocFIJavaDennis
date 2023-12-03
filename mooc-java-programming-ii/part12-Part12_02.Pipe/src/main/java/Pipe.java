
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
public class Pipe<T> {

    private ArrayList<T> contents = new ArrayList<>();

    public Pipe() {
    }
    
    public void putIntoPipe(T value){
        
        contents.add(value);
    }
    
    public T takeFromPipe(){
        
        if(contents.isEmpty()){
            return null;
        }
        T temp = contents.get(0);
        contents.remove(0);
        return temp;
    }
    
    public boolean isInPipe(){
        return contents.isEmpty();
    }
    
    
    
    
}
