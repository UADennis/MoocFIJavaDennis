/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Book {
    private String name;
    private int ageR;

    public Book(String name, int ageR) {
        this.name = name;
        this.ageR = ageR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeR() {
        return ageR;
    }

    public void setAgeR(int ageR) {
        this.ageR = ageR;
    }
    
    public String toString(){
        return this.name + " (recommended for " + this.ageR + " year-olds or older)";
    }
    
}
