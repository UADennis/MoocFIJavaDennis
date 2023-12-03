/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Bird {

    public String name;
    public String latinName;
    public int observations = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;

    }
    
    public void observation(){
        this.observations++;
    } 
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }

}
