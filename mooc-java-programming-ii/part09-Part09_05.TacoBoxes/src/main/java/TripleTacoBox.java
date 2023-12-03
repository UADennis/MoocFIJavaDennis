/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class TripleTacoBox implements TacoBox {
    
    private int tacoCount = 3;
    
    public TripleTacoBox(){
        
    }

    @Override
    public int tacosRemaining() {
        return tacoCount;
    }

    @Override
    public void eat() {
        if(tacoCount == 0){
            return;
        }
        tacoCount--;
    }
    
}
