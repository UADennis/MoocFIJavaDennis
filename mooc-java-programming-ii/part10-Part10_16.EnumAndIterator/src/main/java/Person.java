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
    private Education edu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Education getEducation() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }
    
    public Person(String name, Education edu){
        this.name = name;
        this.edu = edu;
    }
    
    public String toString(){
        return this.name + ", " + this.edu;
    }
    
}
