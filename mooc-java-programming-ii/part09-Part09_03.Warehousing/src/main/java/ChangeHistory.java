
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
public class ChangeHistory {
    
    private ArrayList<Double> history = new ArrayList<>();
    
    public ChangeHistory(){
        
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }
        double largest = 0;
        for(Double dob : history){
            if(dob > largest){
                largest = dob;
            }
            
        }
        return largest;
    }
    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double biggest = this.maxValue();
        for(Double dob : history){
            if(dob < biggest){
                biggest = dob;
            }
            
        }
        return biggest;
    }
    
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        int counter = 0;
        double sum = 0;
        
        for(Double dob : history){
            counter++;
            sum += dob;
        }
        return sum / counter;
    }
    
}
