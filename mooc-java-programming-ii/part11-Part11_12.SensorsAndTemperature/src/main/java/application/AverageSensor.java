/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis Mayer
 */
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> all = new ArrayList<>();
    private List<Integer> reado = new ArrayList<>();
    
    
    public void addSensor(Sensor toAdd){
        all.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for(Sensor s: all){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        all.forEach(t -> t.setOn());
        
    }

    @Override
    public void setOff() {
        all.forEach(t -> t.setOff());
        
    }

    @Override
    public int read() throws IllegalStateException {
        if(!this.isOn()){
            throw new IllegalStateException();
        }
        
        int count = 0;
        int sum = 0;
        for(Sensor s : all){
            count++;
            sum += s.read();
        }
        int read = sum/count;
        reado.add(read);
        return read;
    }
    
    public List<Integer> readings(){
        return reado;
    }
    
}
