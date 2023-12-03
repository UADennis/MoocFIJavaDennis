/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Student extends Person {
    
    private int credits = 0;

    public int credits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public Student(String name, String adress){
        super(name, adress);
    }
    
    public void study(){
        credits++;
    }
    
    public String toString(){
        return super.toString() + "\n  Study credits " + credits;
    }
    
    
    
}
