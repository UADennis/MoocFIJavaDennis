
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
public class Room {
    
    private ArrayList<Person> list;
    
    public Room(){
        this.list = new ArrayList<>();
    }
    
    public void add(Person person){
        this.list.add(person);
    }
    
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return this.list;
    }
    
    public Person shortest(){
        if(list.isEmpty()){
            return null;
        }
        Person SanderHomo = this.list.get(0);
        
        for(Person refPerson : this.list){
            if(SanderHomo.getHeight() > refPerson.getHeight()){
                SanderHomo = refPerson;
            }
            
        }
        return SanderHomo;
    }
    public Person take(){
        if(this.list.isEmpty()){
            return null;
            
        }
        Person MidgetSander = this.shortest();
        this.list.remove(this.shortest());
        return MidgetSander;
    }
    
    
}
