/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name, String adress, int salary){
        super(name, adress);
        this.salary = salary;
    }
    
    public String toString(){
        return super.toString() + "\n" + "  salary " + salary + " euro/month";  
    }
    
}