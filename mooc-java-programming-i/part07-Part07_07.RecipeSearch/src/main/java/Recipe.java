
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
public class Recipe {
   
    private String name;
    private int cookingTime;
    ArrayList<String> ingredients;
    
    public Recipe(String name, ArrayList<String> ingredients, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        
    }
     public boolean nameContains(String name) {
         if(this.name.contains(name)){
             return true;
     }
         return false;
     }
     
     public int getCookingTime() {
        return cookingTime;
    }
     public boolean ingredientListContains(String ingredient) {
         if(this.ingredients.contains(ingredient)){
             return true;
         }
         return false;
          
      }
     
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
    
    
}
