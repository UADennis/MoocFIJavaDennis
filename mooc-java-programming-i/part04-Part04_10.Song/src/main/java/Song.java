/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Song {
    private String name;
    private int length;
    
    
    public Song(String startName, int startLength){
        this.name = startName;
        this.length = startLength;
    }
    
    public String name(){
        return this.name;
    }
    public int length() {
        return this.length;
    }
    
}
