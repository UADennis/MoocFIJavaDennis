
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
public class Logic {

    ArrayList<Recipe> recipes = new ArrayList<>();

    public Logic() {

    }

    public void list() {
        for (Recipe e : recipes) {
            System.out.println(e.toString());
        }
    }

    public void findName(String name) {
        for (Recipe e : this.recipes) {
            if (e.nameContains(name)) {
                System.out.println(e.toString());
            }
        }

    }
    public void timeCook(int cookTime){
        for(Recipe e: this.recipes){
            if(e.getCookingTime() <= cookTime){
                System.out.println(e.toString());
            }
        }
    }
    public void findIngrediet(String ingredient){
        for(Recipe e: this.recipes){
            if(e.ingredientListContains(ingredient)){
                System.out.println(e.toString());
            }
        }
    }
}
