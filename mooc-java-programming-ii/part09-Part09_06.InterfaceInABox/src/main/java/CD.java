/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class CD implements Packable {
    
    private String name;
    private String artist;
    private int publicationYear;
    private double weight = 0.1;
    
    public CD(String artist, String name, int publicationYear){
        this.name = name;
        this.publicationYear = publicationYear;
        this.artist = artist;
    }

    @Override
    public double weight() {
        return weight;
    }
    
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
    
    
    
}
