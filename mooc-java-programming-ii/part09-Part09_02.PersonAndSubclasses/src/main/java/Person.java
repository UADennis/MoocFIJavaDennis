/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Person {
    
    private String name;
    private String adress;
    
    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }
    
    public String toString(){
        return name + "\n" + "  " +adress;
    }
    
}
